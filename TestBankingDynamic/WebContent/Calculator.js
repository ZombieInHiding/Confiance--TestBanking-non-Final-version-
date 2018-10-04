/**
 * 
 */
function round2Fixed(value) {
		value = +value;
		if (isNaN(value))
			return NaN;
		// Shift
		value = value.toString().split('e');
		value = Math
				.round(+(value[0] + 'e' + (value[1] ? (+value[1] + 2) : 2)));
		// Shift back
		value = value.toString().split('e');
		return (+(value[0] + 'e' + (value[1] ? (+value[1] - 2) : -2)))
				.toFixed(2);
	}
	function calculateInterest() {
		principalAmount = document.getElementById("principalAmount").value;
		tenure = document.getElementById("tenure").value;
		document.getElementById("result1").value = round2Fixed(principalAmount
						* Math.pow((1 + (0.06 / 1)), (1 * tenure)));
		document.getElementById("result2").value = round2Fixed((principalAmount * Math.pow((1 + (0.06 / 1)),
						(1 * tenure)))
						- principalAmount);
	}