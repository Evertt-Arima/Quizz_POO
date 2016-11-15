
<%@page import="br.com.domain.pooquiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jogo do Bilhão</title>
    </head>
    <body>
        <header>
            <h1> Jogo do Bilhão</h1>
            <h2>Teste seus conhecimentos ganhando dinheiro</h2>

            <p> Você está preparado para este desafio?</p>
        </header>

        <main>
            <p>Click no link abaixo para preecher seu cadastro </p>
            <p>Boa sorte!</p>
            <a href="cadastro.jsp">Cadastro</a> 
            <h2>Índice</h2>
            <hr/>
            <h3>Última nota:</h3>
            <%= 100.0 * Quiz.getNota()%>%
            <h3>Média:</h3>
            <%= 100.0 * Quiz.getMédia()%>%
            <hr/>
            <a href="quiz.jsp">
                Iniciar Teste
            </a>
        </main>
    </body>
</html>
