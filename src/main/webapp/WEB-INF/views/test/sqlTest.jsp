<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sql Test</title>
</head>
<body>
<table>
<c:forEach var="list" items="${testList }">
	<tr>
		<td>${list.text }<br></td>
		<td><input type="button" value="삭제" id="delBtn"></td>
	</tr>
</c:forEach>
</table>
<form action="/test/input">
<input type="text" name="text" /><input type="submit" value="입력" />
</form>
</body>
<script type="text/javascript">
	
</script>
</html>