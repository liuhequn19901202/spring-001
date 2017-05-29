<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.dongrenfeng {
	height: 20px;
	color: #ffffff;
}
p {
    height: 10px;
	color: #ffffff;
}
select {
height: 25px;
width: 240px;
}
</style>
</head>
<body style="background-color: #515356" align="center">

	<h1 style="color: #ffffff">K&K(株)人事管理システム</h1>

	<p style="padding-right: 62px">地域を選択してください</p>
	<p class="dongrenfeng">
		<select>
			<option value="empty"></option>
			<option value="volvo">Europe</option>
			<option value="saab">Americas</option>
			<option value="opel">Asia</option>
			<option value="audi">Middle East and Africa</option>
		</select>
	</p>
	<p style="padding-right: 76px">国を選択してください</p>
	<p class="dongrenfeng">
<%-- 		<c:forEach var="emp" items="${selects}"> --%>
		<select>
			<option value="volvo"></option>
			<option value="saab">COUNTRYを選択してください</option>
			<option value="opel">LOCATIONを選択してください</option>
			<option value="audi">DEPARTMENTを選択してください</option>
		</select>
<%-- 		</c:forEach> --%>
	</p>
	<p style="padding-right: 62px">位置を選択してください</p>
	<p class="dongrenfeng">
		<select>
			<option value="volvo"></option>
			<option value="saab">COUNTRYを選択してください</option>
			<option value="opel">LOCATIONを選択してください</option>
			<option value="audi">DEPARTMENTを選択してください</option>
		</select>
	</p>
	<p style="padding-right: 62px">分野を選択してください</p>
	<p class="dongrenfeng">
		<select>
			<option value="volvo"></option>
			<option value="saab">COUNTRYを選択してください</option>
			<option value="opel">LOCATIONを選択してください</option>
			<option value="audi">DEPARTMENTを選択してください</option>
		</select>
	</p>
	<div style="width: 64%;" align="right">
		<INPUT type="button" value="検索"
			style="background-color: #515356; color: #ffffff; width: 70px" /> <INPUT
			type="button" value="新規登録"
			style="background-color: #515356; color: #ffffff;" />
	</div>
</body>
</html>