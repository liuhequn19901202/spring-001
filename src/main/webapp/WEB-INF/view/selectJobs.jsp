<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<script>
	function check() {
		var txtValue = document.getElementById("text1").value;
		// 		alert(txtValue);
		if (isNaN(txtValue)) {
			// submit
			//alert('只能输入数字');
			document.getElementById("text2").innerHTML = "数字のみを入力してください";
			return false;
		} else if (txtValue == "" || txtValue == null) {
			document.getElementById("text2").innerHTML = "数字を入力してください　　";
			return false;
		}
	}

</script>
</head>
<body style="background-color: #515356" align="center">
	<h1 style="color: #ffffff">JOBS詳細</h1>
	<h2 style="color: #ffffff">検索金額を入力してください</h2>
	<h3 style="color: #FF0000">${message}</h3>

	<form:form modelAttribute="testview" onSubmit="return check();">
		<form:input path="number" type="text" id="text1" />
		<input type="submit" id="btn1" value="情報検索">
		<div style="height: 5px"></div>
		<div style="color: #FF0000; font-size: 12px">${message1}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
		<div style="height: 15px"></div>
		<div id="text2" style="color: #FF0000; font-size: 12px; width: 93%"></div>
		<div style="height: 15px"></div>
		<table border="1" style="color: #ffffff; width: 50%" align="center">
			<tr>
				<td>JOB_ID</td>
				<td>JOB_TITLE</td>
				<td>MIN_SALARY</td>
				<td>MAX_SALARY</td>
			</tr>

			<c:forEach var="vrr" items="${lists}">
				<tr>

					<td align="left"><form:form modelAttribute="empview">
							<a id="myLink" href="test002">${vrr.JOB_ID}</a>
						</form:form></td>
					<td align="left"><c:out value="${vrr.JOB_TITLE}" /></td>
					<td align="left"><c:out value="${vrr.MIN_SALARY}" /></td>
					<td align="left"><c:out value="${vrr.MAX_SALARY}" /></td>
				</tr>
			</c:forEach>
		</table>
	</form:form>
</body>
</html>