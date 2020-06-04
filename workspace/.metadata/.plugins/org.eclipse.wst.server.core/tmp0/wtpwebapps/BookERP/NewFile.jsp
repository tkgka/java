<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%int sum = 0;
for(int i=0;i<10;i++){
	sum +=i;
	}%>
	

<table>
<tr>
</tr>
<td>1001_홍길동</td>
<td><%=sum %></td>
</tr>
</table>
</body>
</html>