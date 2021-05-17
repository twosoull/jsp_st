<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- ---------------------------------- -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
pageContext.setAttribute("result", "hello");
%>
<body>
	<!-- Controller에서 같은 키값의 request를 보낸다고해도
	page 객체가 먼저 자리를 차지하기 때문에 page의 자료가
	사용된다. -->
	${result} <!-- 출력값 : hello -->
	
	<!-- page -->
	${pageScope.result}
	<!-- request -->
	${requestScope.result}
	<br>
	${param.n}<br>
	${header.accept}
</body>
</html>