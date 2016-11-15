<%@page import="br.com.domain.pooquiz.Quiz"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.domain.pooquiz.Questoes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (request.getParameter("teste") != null) {
        Quiz.validarTeste(new String[] {
            request.getParameter("0"),
            request.getParameter("1"),
            request.getParameter("2"),
            request.getParameter("3"),
            request.getParameter("4"),
            request.getParameter("5"),
            request.getParameter("6"),
            request.getParameter("7"),
            request.getParameter("8"),
            request.getParameter("9")
        });
        response.sendRedirect("dashboard.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
    </head>
    <body>
        <h1>WebQuiz</h1>
        <h2>Teste</h2>
        <hr/>
        <form>
            <%ArrayList<Questoes> teste = Quiz.getTeste();%>
            <%for(Questoes q : teste){%>
            <h4><%=q.getQuestao()%></h4>
                <%for(String alternativa : q.getAlternativas()) {%>
                <input type="radio" name="<%=teste.indexOf(q)%>" 
                       value="<%=alternativa%>"/><%=alternativa%>
            <%}%>
            <hr/>
            <%}%>
            <input type="submit" name="teste" value="Concluir"/>
        </form>
    </body>
</html>
