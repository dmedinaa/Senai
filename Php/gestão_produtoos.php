<?php
// Medina

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "gestão_produtos";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sqlCreateProdutos = "CREATE TABLE IF NOT EXISTS produtos (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(255),
    preco DECIMAL(10,2)
)";

if ($conn->query($sqlCreateProdutos) === TRUE) {
    echo "Tabela 'produtos' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'produtos': " . $conn->error . "<br>";
}

$sqlCreateCategorias = "CREATE TABLE IF NOT EXISTS categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(255)
)";

if ($conn->query($sqlCreateCategorias) === TRUE) {
    echo "Tabela 'categorias' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'categorias': " . $conn->error . "<br>";
}

$sqlInsertProdutos = "INSERT INTO produtos (nome_produto, preco) VALUES ('Produto A', 10.50), ('Produto B', 20.75)";

if ($conn->query($sqlInsertProdutos) === TRUE) {
    echo "Dados inseridos na tabela 'produtos' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'produtos': " . $conn->error . "<br>";
}

$sqlInsertCategorias = "INSERT INTO categorias (nome_categoria) VALUES ('Categoria X'), ('Categoria Y')";

if ($conn->query($sqlInsertCategorias) === TRUE) {
    echo "Dados inseridos na tabela 'categorias' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'categorias': " . $conn->error . "<br>";
}

$conn->close();
?>
