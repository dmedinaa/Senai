<form action="usuario.php" method="post">
    Nome: <input type="text" name="nome"><br>
    Idade: <input type="text" name="idade"><br>
    Sexo: <input type="text" name="sexo"><br>
    <input type="submit" value="Cadastrar">
</form>

<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "usuarios";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}

// Query para criar a tabela
$sql = "CREATE TABLE IF NOT EXISTS pessoas (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    idade INT(3) NOT NULL,
    sexo VARCHAR(1)
)";
 
// Executar a query
if ($conn->query($sql) === TRUE) {
    echo "Tabela 'pessoas' criada com sucesso";
} else {
    echo "Erro ao criar tabela: " . $conn->error;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nome = $_POST['nome'];
    $idade = $_POST['idade'];
    $sexo = $_POST['sexo'];

    // Verifica se os campos não estão vazios antes de inserir na tabela
    if (!empty($nome) && !empty($idade) && !empty($sexo)) {
        // Query para inserir na tabela
        $sql = "INSERT INTO pessoas (nome, idade, sexo) VALUES ('$nome', '$idade', '$sexo')";

        if ($conn->query($sql) === TRUE) {
            echo "\nCadastro realizado com sucesso!";
        } else {
            echo "Erro ao cadastrar: " . $conn->error;
        }
    } else {
        echo "Por favor, preencha todos os campos do formulário.";
    }
}

// Função para retornar todos os registros da tabela
function getAllPessoas($conn) {
    $sql = "SELECT * FROM pessoas";
    $result = $conn->query($sql);
 
    if ($result->num_rows > 0) {
         return $result->fetch_all(MYSQLI_ASSOC);
    } else {
         return "Nenhum resultado encontrado";
    }
}

// Uso da função
$data = getAllPessoas($conn);
print_r($data);

$conn->close();

// Função para obter uma pessoa por ID
function getPessoaById($conn, $id) {
    $sql = "SELECT * FROM pessoas WHERE id = $id";
    $result = $conn->query($sql);
 
    if ($result->num_rows > 0) {
         return $result->fetch_assoc();
    } else {
         return "Nenhum resultado encontrado para o ID: $id";
    }
}

// Uso da função para obter uma pessoa por ID
$id = 1; // Exemplo de ID, você pode passar o ID desejado como parâmetro
$pessoa = getPessoaById($conn, $id);
print_r($pessoa);

// Função para atualizar uma pessoa por ID
function updatePessoaById($conn, $id, $nome, $idade, $sexo) {
    $sql = "UPDATE pessoas SET nome = '$nome', idade = '$idade', sexo = '$sexo' WHERE id = $id";
    
    if ($conn->query($sql) === TRUE) {
        echo "Registro atualizado com sucesso!";
    } else {
        echo "Erro ao atualizar registro: " . $conn->error;
    }
}

// Uso da função para atualizar uma pessoa por ID
$idToUpdate = 2; // Exemplo de ID, você pode passar o ID desejado como parâmetro
$updateNome = "Novo Nome";
$updateIdade = 30;
$updateSexo = "M";
updatePessoaById($conn, $idToUpdate, $updateNome, $updateIdade, $updateSexo);

?>
