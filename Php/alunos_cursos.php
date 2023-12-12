<?php
// Medina

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "alunos_cursos";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sqlCreateAlunos = "CREATE TABLE IF NOT EXISTS alunos (
    id_aluno INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    turma VARCHAR(255)
)";

if ($conn->query($sqlCreateAlunos) === TRUE) {
    echo "Tabela 'alunos' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'alunos': " . $conn->error . "<br>";
}

$sqlCreateCursos = "CREATE TABLE IF NOT EXISTS cursos (
    id_curso INT AUTO_INCREMENT PRIMARY KEY,
    nome_curso VARCHAR(255),
    instrutor VARCHAR(255)
)";

if ($conn->query($sqlCreateCursos) === TRUE) {
    echo "Tabela 'cursos' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'cursos': " . $conn->error . "<br>";
}

$sqlInsertAlunos = "INSERT INTO alunos (nome, turma) VALUES ('Neylor', 'Turma A'), ('Medina', 'Turma B')";

if ($conn->query($sqlInsertAlunos) === TRUE) {
    echo "Dados inseridos na tabela 'alunos' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'alunos': " . $conn->error . "<br>";
}

$sqlInsertCursos = "INSERT INTO cursos (nome_curso, instrutor) VALUES ('Curso de Java', 'Instrutor A'), ('Curso de Python', 'Instrutor B')";

if ($conn->query($sqlInsertCursos) === TRUE) {
    echo "Dados inseridos na tabela 'cursos' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'cursos': " . $conn->error . "<br>";
}

$conn->close();
?>
