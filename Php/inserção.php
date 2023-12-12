<?php
// Medina

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "people";

// Criar conexão
$conn = new mysqli($servername, $username, $password);

// Checar conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

// Criar banco de dados 'people' se não existir
$sqlCreateDB = "CREATE DATABASE IF NOT EXISTS $dbname";
if ($conn->query($sqlCreateDB) === false) {
    die("Erro ao criar banco de dados: " . $conn->error);
}

// Selecionar o banco de dados 'people'
$conn->select_db($dbname);

// Verificar conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

// Criação das tabelas
$sqlCreateTables = "
    CREATE TABLE IF NOT EXISTS pessoas (
        id INT NOT NULL AUTO_INCREMENT,
        nome VARCHAR(255) NOT NULL,
        idade INT NOT NULL,
        PRIMARY KEY (id)
    );

    CREATE TABLE IF NOT EXISTS enderecos (
        id INT NOT NULL AUTO_INCREMENT,
        pessoa_id INT NOT NULL,
        rua VARCHAR(255) NOT NULL,
        cidade VARCHAR(255) NOT NULL,
        PRIMARY KEY (id),
        FOREIGN KEY (pessoa_id) REFERENCES pessoas (id)
    );

    CREATE TABLE IF NOT EXISTS telefones (
        id INT NOT NULL AUTO_INCREMENT,
        pessoa_id INT NOT NULL,
        numero VARCHAR(255) NOT NULL,
        PRIMARY KEY (id),
        FOREIGN KEY (pessoa_id) REFERENCES pessoas (id)
    );

    CREATE TABLE IF NOT EXISTS pedidos (
        id INT NOT NULL AUTO_INCREMENT,
        pessoa_id INT NOT NULL,
        valor DECIMAL(10,2) NOT NULL,
        data DATE NOT NULL,
        PRIMARY KEY (id),
        FOREIGN KEY (pessoa_id) REFERENCES pessoas (id)
    );
";

// Executar criação de tabelas
if ($conn->multi_query($sqlCreateTables) === false) {
    die("Erro ao criar tabelas: " . $conn->error);
}

// Fechar conexão para evitar problemas com multi-query
$conn->close();

// Reabrir conexão para inserção de dados
$conn = new mysqli($servername, $username, $password, $dbname);

// Inserção de dados para Neylor e Medina (em consultas separadas)
$sqlInsertNeylor = "INSERT INTO pessoas (nome, idade) VALUES ('Neylor', 18)";
if ($conn->query($sqlInsertNeylor) === false) {
    die("Erro ao inserir dados de Neylor: " . $conn->error);
}

$Neylor_id = $conn->insert_id;

$sqlInsertEnderecoNeylor = "INSERT INTO enderecos (pessoa_id, rua, cidade) VALUES ('$Neylor_id', 'Antonio Borges de Araujo', 'Uberaba')";
$sqlInsertTelefoneNeylor = "INSERT INTO telefones (pessoa_id, numero) VALUES ('$Neylor_id', '537')";
$sqlInsertPedidoNeylor = "INSERT INTO pedidos (pessoa_id, valor, data) VALUES ('$Neylor_id', 13.50, CURDATE())";

if ($conn->query($sqlInsertEnderecoNeylor) === false || $conn->query($sqlInsertTelefoneNeylor) === false || $conn->query($sqlInsertPedidoNeylor) === false) {
    die("Erro ao inserir dados de Neylor: " . $conn->error);
}

$sqlInsertMedina = "INSERT INTO pessoas (nome, idade) VALUES ('Medina', 16)";
if ($conn->query($sqlInsertMedina) === false) {
    die("Erro ao inserir dados de Medina: " . $conn->error);
}

$Medina_id = $conn->insert_id;

$sqlInsertEnderecoMedina = "INSERT INTO enderecos (pessoa_id, rua, cidade) VALUES ('$Medina_id', 'Jose Magnino', 'Uberaba')";
$sqlInsertTelefoneMedina = "INSERT INTO telefones (pessoa_id, numero) VALUES ('$Medina_id', '343')";
$sqlInsertPedidoMedina = "INSERT INTO pedidos (pessoa_id, valor, data) VALUES ('$Medina_id', 15.00, CURDATE())";

if ($conn->query($sqlInsertEnderecoMedina) === false || $conn->query($sqlInsertTelefoneMedina) === false || $conn->query($sqlInsertPedidoMedina) === false) {
    die("Erro ao inserir dados de Medina: " . $conn->error);
}

$conn->close();
?>
