<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Multiplication tables</title>
</head>
<body>
    welcome to home


    <form action="add">
        Enter the 1st number : <input type="text" name="num1"><br>
        Enter the 2nd number : <input type="text" name="num2"><br>
        <input type="submit">

    </form>
    <form action="addAlien" method="post">
        Enter the aid : <input type="text" name="aid"><br>
        Enter the aname : <input type="text" name="aname"><br>
        <input type="submit">
    </form>

    <form action="getonedata">
        Enter the id : <input type="text" name="aid"> <br>
        <input type="submit">
    </form>
    <form action="adddata" method="post">
        Enter the aid for database: <input type="text" name="aid"><br>
        Enter the aname for database: <input type="text" name="aname"><br>
        <input type="submit">
    </form>
    <form action="getdataname">
        Enter the name : <input type="text" name="aname"> <br>
        <input type="submit">
    </form>

    <form action="queryname">
        Enter the queryname : <input type="text" name="aname"> <br>
        <input type="submit">
    </form>

</body>
</html>