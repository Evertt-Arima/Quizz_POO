
<%@page import="br.com.domain.tpquizpoo.Quiz"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.domain.tpquizpoo.Questoes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <%ArrayList<Questoes> test = Quiz.getTeste();%>
            <%for(Questoes q: test){%>
            <h4><%=q.getQuestao()%></h4>
            <%for(String alternative: q.getAlternativas()){%>
            <input type="radio" name="<%=test.indexOf(q)%>"
                    value="<%=alternative%>"/> <%=alternative%>
            <%}%>
            <hr/>
            <%}%>
            <input type="submit" name="test" value="Concluir"/>
            
        </form>
    </body>
</html>
