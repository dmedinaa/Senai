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

$sqlCreateLivros = "CREATE TABLE IF NOT EXISTS livros (
    id_livro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    ano_publicacao INT
)";

if ($conn->query($sqlCreateLivros) === TRUE) {
    echo "Tabela 'livros' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'livros': " . $conn->error . "<br>";
}

$sqlCreateAutores = "CREATE TABLE IF NOT EXISTS autores (
    id_autor INT AUTO_INCREMENT PRIMARY KEY,
    nome_autor VARCHAR(255)
)";

if ($conn->query($sqlCreateAutores) === TRUE) {
    echo "Tabela 'autores' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'autores': " . $conn->error . "<br>";
}

$sqlInsertLivros = "INSERT INTO livros (titulo, ano_publicacao) VALUES ('Livro A', 2020), ('Livro B', 2018)";

if ($conn->query($sqlInsertLivros) === TRUE) {
    echo "Dados inseridos na tabela 'livros' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'livros': " . $conn->error . "<br>";
}

$sqlInsertAutores = "INSERT INTO autores (nome_autor) VALUES ('Autor X'), ('Autor Y')";

if ($conn->query($sqlInsertAutores) === TRUE) {
    echo "Dados inseridos na tabela 'autores' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'autores': " . $conn->error . "<br>";
}

$conn->close();
?>
