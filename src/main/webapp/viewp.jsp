<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="project_product.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Demoinfo di=(Demoinfo)session.getAttribute("uDemoinfo");
ArrayList<ProductBean>al=(ArrayList<ProductBean>)session.getAttribute("al");
out.println("page belongs to:"+di.getFname()+"<br><br>");

if(al.size()==0){
	out.println("product not available...");
}
else{
	Iterator <ProductBean>it=al.iterator();
	while(it.hasNext()){
		ProductBean p=(ProductBean)it.next();
		out.println("productId :"+p.getCode()+"&nbsp&nbsp&nbsp"+"productName :"+p.getName()+"&nbsp&nbsp&nbsp"+"productPrice :"+p.getPrice()+"&nbsp&nbsp&nbsp"+"productQuntity :"+p.getQty()+"<a href='edit?code="+p.getCode()+"'>Editing...?</a>"+"&nbsp&nbsp"+"<a href='delet'>Delete...?</a>"+"<br><b>");
		}
	}
%>
<a href="Addproduct.html"> Addproduct../?</a><br>
</body>
</html>