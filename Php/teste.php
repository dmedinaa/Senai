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
    )";

$pdo->exec($query);

echo "Tabelas criada com sucesso!";

} catch (PDOException $e) {
    die("Erro ao criar as tabelas: " . $e->getMessage());
}
?>