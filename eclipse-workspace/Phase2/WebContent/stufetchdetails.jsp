<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <p><b>Welcome Student:</b>
   <%= request.getParameter("stuname")%>
   <%= request.getParameter("stuage")%>
   <%= request.getParameter("stuemail")%>
   <%= request.getParameter("studept")%>
   <%= request.getParameter("stucourse")%>
   <%= request.getParameter("stuid")%>
   
</p>
</body>
</html>