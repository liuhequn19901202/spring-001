<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: #515356" align="center">
<h1 style="color: #ffffff">JOB_IDの詳細</h1>
<INPUT type="button" value="戻る" onClick="history.go(-1)">
<%-- <form:form modelAttribute="selectForm" action="${pageContext.request.contextPath}/selectbox"> --%>
<%--     <form:select path="employees" items="${selectEmployees}" multiple="true" /> --%>
<!--     <input type="submit" /> -->
    <table border="1" style="color: #ffffff; width: 80%" align="center">
			<tr>
				<td>EMPLOYEE_ID</td>
				<td>NAME</td>
				<td>EMAIL</td>
				<td>PHONE_NUMBER</td>
				<td>HIRE_DATE</td>
				<td>JOB_ID</td>
				<td>SALARY</td>
				<!-- <td>COMMISSION_PCT</td> -->
				<td>MANAGER_ID</td>
				<td>DEPARTMENT_ID</td>
			</tr>
			<c:forEach var="emp" items="${selects}">
				<tr>
					<td align="left"><c:out value="${emp.EMPLOYEE_ID}" /></td>
					<td align="left"><c:out value="${emp.FIRST_NAME}" />&nbsp;<c:out value="${emp.LAST_NAME}" /></td>
					<%-- <td align="left"><c:out value="${emp.LAST_NAME}" /></td> --%>
					<td align="left"><c:out value="${emp.EMAIL}" /></td>
					<td align="left"><c:out value="${emp.PHONE_NUMBER}" /></td>
					<td align="left"><c:out value="${emp.HIRE_DATE}" /></td>
					<td align="left"><c:out value="${emp.JOB_ID}" /></td>
					<td align="left"><c:out value="${emp.SALARY}" /></td>
					<%-- <td align="left"><c:out value="${emp.COMMISSION_PCT}" /></td> --%>
					<td align="left"><c:out value="${emp.MANAGER_ID}" /></td>
					<td align="left"><c:out value="${emp.DEPARTMENT_ID}" /></td>
				</tr>
			</c:forEach>
			</table>
<%-- </form:form> --%>
</body>
</html>