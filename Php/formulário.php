<form action = "formulário.php" method = "post">
    Nome: <input type = "text" name = "nome"><br>
    E-mail: <input Type = "email" name="email"><br>
    <input type = "submit" value = "Enviar">
</form>

<?php

$nome = $_POST["nome"]; // Pega o que foi escrito no campo "nome"
$email = $_POST['email']; // Pega o que foi escrito no campo "email"

echo "Obrigado por enviar, $nome! Seu e-mail é $email.";

?>