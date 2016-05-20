<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jjc" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="body-div">insert User
	<sf:form action="addUser" method="post" modelAttribute="newUser">		
		<sf:input path="firstName" placeholder="first name"/>
		<sf:input path="secondName" placeholder="last name"/>
		<sf:input path="email" placeholder="email"/>
		<sf:input path="phoneNumber" placeholder="phone number"/>
		<sf:select path="role">
			<jjc:forEach items="${roles}" var="role">
				<sf:option value="${role.idRole}">${role.roleName}</sf:option>
			</jjc:forEach>
		</sf:select>
		<input type="submit">
	</sf:form>
	
	<form action="addRole" method="post">
		<input type="text" placeholder="role" name="roleName">
		<input type="submit">
	</form>
	</div>
</body>
</html>