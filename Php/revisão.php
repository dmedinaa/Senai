<?php

$host = "localhost";
$dbname = "revisao";
$user = "root";
$password = "";

try {
    $pdo = new PDO("mysql:host=$host;dbname=$dbname", $user, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $query = "CREATE TABLE IF NOT EXISTS transportadoras(
         id INT AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(100) NOT NULL,
        contato INT (11) NOT NULL,
        tipo_servico VARCHAR(50) NOT NULL,
        endereco VARCHAR(150) NOT NULL
    );
    CREATE TABLE IF NOT EXISTS cargas(
        id INT AUTO_INCREMENT PRIMARY KEY,
        tipo VARCHAR(100) NOT NULL,
        peso INT (10) NOT NULL,
        origem VARCHAR(50) NOT NULL,
        destino VARCHAR(150) NOT NULL
   );
   CREATE TABLE IF NOT EXISTS rastreamento(
        id INT AUTO_INCREMENT PRIMARY KEY,
        codigo_rastreio VARCHAR(10) NOT NULL,
        localizacao VARCHAR (10) NOT NULL,
        data_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        status VARCHAR(150) NOT NULL
    );
    CREATE TABLE IF NOT EXISTS transportadoras_log(
        id INT AUTO_INCREMENT PRIMARY KEY,
        id_transportadoras INT NOT NULL,
        acao VARCHAR(50) NOT NULL,
        data_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        usuario VARCHAR(100)
    )";

    $pdo->exec($query);

    echo "Tabelas criadas com sucesso!";

} catch (PDOException $e) {
    die("Erro ao criar as tabelas: " . $e->getMessage());
}

try {
    $pdo = new PDO("mysql:host=$host;dbname=$dbname", $user, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Função para inserção de dados na tabela transportadoras
    function inserirTransportadora($nome, $contato, $tipo_servico, $endereco) {
        global $pdo;
        $sql = "INSERT INTO transportadoras (nome, contato, tipo_servico, endereco) VALUES (:nome, :contato, :tipo_servico, :endereco)";
        $stmt = $pdo->prepare($sql);
        $stmt->bindParam(':nome', $nome);
        $stmt->bindParam(':contato', $contato);
        $stmt->bindParam(':tipo_servico', $tipo_servico);
        $stmt->bindParam(':endereco', $endereco);
        $stmt->execute();

        // Registrar ação na tabela de log
        $id_transportadora = $pdo->lastInsertId();
        registrarLogTransportadora($id_transportadora, 'inserção');
    }

    // Função para registrar ação na tabela de log para transportadoras
    function registrarLogTransportadora($id_transportadora, $acao, $usuario = null) {
        global $pdo;
        $data_registro = date('Y-m-d H:i:s');
        $sql = "INSERT INTO transportadoras_log (id_transportadoras, acao, data_registro, usuario) VALUES (:id_transportadoras, :acao, :data_registro, :usuario)";
        $stmt = $pdo->prepare($sql);
        $stmt->bindParam(':id_transportadoras', $id_transportadora);
        $stmt->bindParam(':acao', $acao);
        $stmt->bindParam(':data_registro', $data_registro);
        $stmt->bindParam(':usuario', $usuario);
        $stmt->execute();
    }

    // Função para inserir dados na tabela cargas
    function inserirCarga($tipo, $peso, $origem, $destino) {
        global $pdo;
        $sql = "INSERT INTO cargas (tipo, peso, origem, destino) VALUES (:tipo, :peso, :origem, :destino)";
        $stmt = $pdo->prepare($sql);
        $stmt->bindParam(':tipo', $tipo);
        $stmt->bindParam(':peso', $peso);
        $stmt->bindParam(':origem', $origem);
        $stmt->bindParam(':destino', $destino);
        $stmt->execute();

        // Registrar ação na tabela de log (se necessário)
    }

    // Função para inserir dados na tabela rastreamento
    function inserirRastreamento($codigo_rastreio, $localizacao, $status) {
        global $pdo;
        $sql = "INSERT INTO rastreamento (codigo_rastreio, localizacao, status) VALUES (:codigo_rastreio, :localizacao, :status)";
        $stmt = $pdo->prepare($sql);
        $stmt->bindParam(':codigo_rastreio', $codigo_rastreio);
        $stmt->bindParam(':localizacao', $localizacao);
        $stmt->bindParam(':status', $status);
        $stmt->execute();
    }

    // Inserção de dados de transportadoras
    inserirTransportadora('Brasspress Transportes Urgentes', 3421047400, 'Serviço de Entrega', 'Leblon, Rua Cobalto 42');
    inserirTransportadora('TNT Mercúrio Cargas e Encomendas Expressas', 5121075000, 'Serviço de Carregamento de Madeira', 'Jardim Libano, Av. Nossa Sinhora Do Desterro 1683');
    inserirTransportadora('Patrus Transportes Urgentes', 3433365100, 'Serviço de Coleta','Boa Vista, Rua Vigia 32');
    
    // Inserção de dados de cargas
    inserirCarga('Eletrônicos', 500, 'São Paulo', 'Rio de Janeiro');
    inserirCarga('Alimentos', 300, 'Belo Horizonte', 'Curitiba');
    inserirCarga('Madeira', 1000, 'Barão De Cocais', 'Uberlândia');

    // Inserção de dados de rastreamento
    inserirRastreamento('ABC123', 'Centro de Distribuição', 'Em trânsito');
    inserirRastreamento('DEF456', 'Armazém', 'Pendente');
    inserirRastreamento('MMADE5', 'Marcenária', 'Em trânsito');
    
    echo "\nDados inseridos com sucesso!";
} catch (PDOException $e) {
    die("\nErro ao inserir dados: " . $e->getMessage());
}
?>
