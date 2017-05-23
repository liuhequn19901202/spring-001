<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${message}</p>
<!--  -->
<form:form modelAttribute="checkForm" action="${pageContext.request.contextPath}/checkbox">
    <form:checkboxes path="employees" items="${checkEmployees}" delimiter="<div>" />
    <input type="submit" /><%--  <input type="hidden" name="myhashCode" value="${checkEmployees.hashCode}"   /> --%>
</form:form>
</body>
</html>