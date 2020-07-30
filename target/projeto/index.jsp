<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">    
    <head>
        <meta  charset="UTF-8">
        <title>Formulário de Cadastro</title>
    </head>
    <body>
        <form method="post" action="tratamento.jsp">
            <h1 style="text-aling: center;">Formulário</h1>

            <p>
                <label for ="nome">Nome:</label>
                <input type="text" size="20" id="nome" name="nome" />
            </p>
            <p>
                <label for ="end">Endereço:</label>
                <input type="text" size="20" id="end" name="end" />
            </p>
            <p>
                <label for ="email">E-mail:</label>
                <input type="text" size="20" id="email" name="email" />
            </p>
            <p>
                <label for ="tel">Telefone:</label>
                <input type="text" class="form-control phone-ddd-mask" placeholder="Ex.: (00) 0000-0000"size="20" id="tel" name="tel" />
            </p>
            <p>
                <label for ="cpf">CPF:</label>
                <input type="text" class="form-control cpf-mask" placeholder="Ex.: 000.000.000-00"  size="20" id="cpf" name="cpf" />
            </p>
            <p>
                <input type="submit" value="Enviar" />
            <p>
        </form>
    </body>
</html>