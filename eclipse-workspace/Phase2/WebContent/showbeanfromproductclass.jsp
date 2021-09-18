<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="productclass" class="com.java.assistedassignments.ProductClass" scope="session"></jsp:useBean>
        Product Id:    <jsp:getProperty name="productclass" property="productId" />  <br>
        Product Name:    <jsp:getProperty name="productclass" property="productName" />  <br>
        Product Price:    <jsp:getProperty name="productclass" property="price" />  <br>

</body>
</html>