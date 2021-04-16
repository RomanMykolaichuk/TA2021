<%-- 
    Document   : toDo
    Created on : 8 квіт. 2021 р., 13:54:34
    Author     : 38068
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${name}!</h1>

        <p>Name: ${sampleData.name}</p>
        <p>Age: ${sampleData.age}</p>

        <form action="<%=request.getContextPath()%>">
            <input type="submit" value="Home"/>
        </form>
    </body>
</html>
