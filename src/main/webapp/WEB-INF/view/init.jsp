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

<h1 style="color: #ffffff">EMPLOYEESの詳細</h1>
<div style="width: 90%;" align="right">
<INPUT type="button" value="検索" style="background-color: #515356;color: #ffffff;width:70px" />
<INPUT type="button" value="登録" style="background-color: #515356;color: #ffffff;width:70px" /></div>
<select>
  <option value ="volvo">REGIONを選択してください</option>
  <option value ="saab">COUNTRYを選択してください</option>
  <option value="opel">LOCATIONを選択してください</option>
  <option value="audi">DEPARTMENTを選択してください</option>
</select>
</body>
</html>