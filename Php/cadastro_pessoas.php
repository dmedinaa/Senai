<?php
// Medina

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "cadastro";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sqlCreateUsuarios = "CREATE TABLE IF NOT EXISTS usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255)
)";

if ($conn->query($sqlCreateUsuarios) === TRUE) {
    echo "Tabela 'usuarios' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'usuarios': " . $conn->error . "<br>";
}

$sqlCreatePedidos = "CREATE TABLE IF NOT EXISTS pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    produto VARCHAR(255),
    quantidade INT,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
)";

if ($conn->query($sqlCreatePedidos) === TRUE) {
    echo "Tabela 'pedidos' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'pedidos': " . $conn->error . "<br>";
}

$sqlInsertUsuarios = "INSERT INTO usuarios (nome, email) VALUES ('Neylor Henrique', 'neylor@henrique.com.br')";

if ($conn->query($sqlInsertUsuarios) === TRUE) {
    echo "Dados inseridos na tabela 'usuarios' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'usuarios': " . $conn->error . "<br>";
}


$sqlInsertPedidos = "INSERT INTO pedidos (id_usuario, produto, quantidade) VALUES (LAST_INSERT_ID(), 'Livro Java', 1)";

if ($conn->query($sqlInsertPedidos) === TRUE) {
    echo "Dados inseridos na tabela 'pedidos' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'pedidos': " . $conn->error . "<br>";
}

$conn->close();
?>
