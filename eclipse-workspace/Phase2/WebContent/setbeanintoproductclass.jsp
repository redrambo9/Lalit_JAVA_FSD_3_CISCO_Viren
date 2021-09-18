<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <% String ID = request.getParameter("id"); %>
Using UseBean tag for Product Class<br>
<jsp:useBean id="productclass" class="com.java.assistedassignments.ProductClass" scope="session"></jsp:useBean>
        <jsp:setProperty property="*" name="productclass" />

<a href="showbeanfromproductclass.jsp">Show Product Details</a><br>


<hr>

</body>

</html>