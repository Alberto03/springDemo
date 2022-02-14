<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
    <head>
        <%@ page isELIgnored="false" %>
        <title>Hello world</title>
    </head>

    <body>
        <h2>${helloWorld.message}</h2>
        <h4>Server date time is: ${helloWorld.dateTime}</h4>
    </body>
</html>