<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="project_product.Demoinfo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Demoinfo di=(Demoinfo)session.getAttribute("uDemoinfo");
out.println("Welcome to :"+di.getFname());

%>
<a href="Addproduct.html"> Addproduct../?</a>
<a href="view">viewproduct...?</a>
</body>
</html>