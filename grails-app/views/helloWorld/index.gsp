<%@ page import="sampleswf.HelloWorldController" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form method="GET" controller="helloWorld" action="index">
    <button type="submit">call Controller</button>
</g:form>

<g:form method="POST" controller="helloWorld" action="testin">
    <button type="submit">call Controller testing</button>
</g:form>
</body>
</html>