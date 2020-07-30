<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.formulario"%>
<!DOCTYPE html>
<html lang="pt-br">    
    <head>
        <meta  charset="UTF-8">
        <title>Formulário de Cadastro</title>
    </head>
    <body>
        <%
            String nome, end, email , cpf, tel;
            formulario formulario = new formulario();
            formulario.setNome(request.getParameter("nome"));
            formulario.setEnd(request.getParameter("end"));
            formulario.setEmail(request.getParameter("email"));
            formulario.setCpf(request.getParameter("cpf"));
            formulario.setTel(request.getParameter("tel"));    
        %>
          
            <h1>Nome:<%= formulario.getNome() %> </h1>
            <h1>Endereço:<%= formulario.getEnd() %> </h1>
            <h1>E-mail:<%= formulario.getEmail() %> </h1>
            <h1>Telefone:<%= formulario.getTel() %> </h1>
            <h1>CPF:<%= formulario.getCpf() %> </h1>
    </body>
</html>