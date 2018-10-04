<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border=1>
		<tr>
			<th>Deposit Number</th>
			<th>Principal Amount</th>
			<th>Start Date</th>
			<th>Maturity Date</th>
			<th>Amount on Maturity</th>
		</tr>
		<c:forEach var="list" items="${FD}">
			<tr>
				<td>${list.fixedDepositNo}</td>
				<td>${list.principalAmount}</td>
				<td>${list.startDate}</td>
				<td>${list.endDate}</td>
				<td>${list.maturityValue}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>