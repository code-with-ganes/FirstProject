<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="project_product.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Demoinfo di=(Demoinfo)session.getAttribute("uDemoinfo");
out.printlnn("page belongs to:"+di.getFname()+"<br>");
String msg=(String)request.getAttribute("msg");
out.println(msg);
%>
<a href="view">viewproduct...?</a>
<a href="Addproduct.html"> Addproduct../?</a><br>

</body>
</html>