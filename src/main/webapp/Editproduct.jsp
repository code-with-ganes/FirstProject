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
ProductBean pb=(ProductBean)request.getAttribute("pb");
out.println("page belongs to:"+di.getFname()+"<br>");

%>
<form action="ubdate" method="post">
<input type="hidden" name="code" value=<%=pb.getCode()%> ><br>
<input type="text" name="name" value=<%=pb.getName() %>><br><br>
<input type="text" name="price" value=<%=pb.getPrice() %>><br><br>
<input type="text" name="qty" value=<%=pb.getQty() %>><br><br>
<input type="submit" value="ubdate.." >


</form>
</body>
</html>