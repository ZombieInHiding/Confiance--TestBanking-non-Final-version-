<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="Calculator.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	<h1>Account Created</h1>
	<div>
		Principal Amount: ${principalAmount}<br> Tenure: ${tenure} <br>
		Start Date: ${startDate}<br> Maturity Date: ${endDate}<br>
		Rate Of Interest: 6% <br> Amount on Maturity: ${maturityValue}<br>
		Interest Earned: ${interestEarned} <br>

	</div>

	<%-- Interest Earned: ${maturityValue-principal} --%>
</body>
</html>