<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<script type="text/javascript" src="Calculator.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fixed Deposit Estimator</title>

</head>

<body>

	<div class="container">
		<form action="fixedDeposit.bank" method="post">
			<h1>Simple Interest Calculation</h1>

			Principal Amount: <input id="principalAmount" name="principalAmount"
				pattern="[0-9]+" required> <br /> Rate of Interest: 6% <br />
			Tenure(No of Years): <input id="tenure" name="tenure"
				pattern="[0-9]+" required> <br /> Frequency: Annually <br />
			<br /> Amount on maturity Annually is : <input style="border: none"
				name="maturityValue" id="result1" readonly>
			</p>

			Interest Earned on maturity Annually is :<input style="border: none"
				name="interestEarned" id="result2" readonly>
			</p>

			<input onclick="calculateInterest()" type="submit"
				value="Submit Answer" class="btn btn-success">
		</form>

		<br />
		<button onclick="calculateInterest()" value="calculateInterest">Estimate
			Amount on Maturity</button>
		<br />
	</div>
</body>
</html>
