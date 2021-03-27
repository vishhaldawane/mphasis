/**
 * this is a comment - non execuing line
 */

function calculate() 
{
	let n1 = document.getElementById("num1").value;   
	let n2 = document.getElementById("num2").value;
	let opr = document.getElementById("operator").value;
	let ans;

		switch(opr) 
		{
			case "+": ans = parseInt(n1) + parseInt(n2); break;
			case '-': ans = n1 - n2; break;
			case '*': ans = n1 * n2; break;
			case '/': ans = n1 / n2; break;
		}
	
	document.mycalc.output.value = ans;
	
}