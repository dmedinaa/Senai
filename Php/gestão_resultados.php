<?php
// Medina

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "gestão_resultados";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sqlCreateResultado = "CREATE TABLE IF NOT EXISTS resultados_exames (
    id_resultados INT AUTO_INCREMENT PRIMARY KEY,
    tipo_exame VARCHAR(255),
    resultado VARCHAR(255)
)";

if ($conn->query($sqlCreateResultado) === TRUE) {
    echo "Tabela 'Resultado' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'Resultado': " . $conn->error . "<br>";
}

$sqlCreatePaciente = "CREATE TABLE IF NOT EXISTS pacientes (
    id_paciente INT AUTO_INCREMENT PRIMARY KEY,
    nome_paciente VARCHAR(255),
    data_nascimento DATETIME
)";

if ($conn->query($sqlCreatePaciente) === TRUE) {
    echo "Tabela 'Paciente' criada com sucesso ou já existe.<br>";
} else {
    echo "Erro ao criar tabela 'Paciente': " . $conn->error . "<br>";
}

$sqlInsertResultado = "INSERT INTO resultados_exames (tipo_exame, resultado) VALUES ('Próstata', 'Positvo'), ('AIDS', 'Negativo')";

if ($conn->query($sqlInsertResultado) === TRUE) {
    echo "Dados inseridos na tabela 'Resultado' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'Resultado': " . $conn->error . "<br>";
}

$sqlInsertPaciente = "INSERT INTO pacientes (nome_paciente, data_nascimento) VALUES ('Neylor', '2005-08-24'), ('Medina', '2006-12-04')";

if ($conn->query($sqlInsertPaciente) === TRUE) {
    echo "Dados inseridos na tabela 'Paciente' com sucesso.<br>";
} else {
    echo "Erro ao inserir dados na tabela 'Paciente': " . $conn->error . "<br>";
}

$conn->close();
?>
