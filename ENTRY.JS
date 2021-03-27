
function  validate()
{					
	let var1 = document.getElementById("FNAME").value;
	let var2 = document.getElementById("MNAME").value;
	let var3 = document.getElementById("LNAME").value;
	let mgender = document.getElementById("male").checked;
	let fgender = document.getElementById("female").checked;
	let agree = document.getElementById("agree").checked;

	let var1Err = document.getElementById("fnameErr");
	let var2Err = document.getElementById("mnameErr");
	let var3Err = document.getElementById("lnameErr");

	if(agree == false ){
		alert('Please agree with our terms');	
		return false;
	}

	if(mgender == false && fgender == false ){
		alert('Gender must be selected');
		return false;
	}
	
	if(var1=='') {
		//alert('First name cannot be empty');
		var1Err.innerHTML='First name cannot be empty';
		document.myform.fistname.focus();
		return false;
	}
	else {
		var1Err.innerHTML='';
	}
	if(var2=='') {
		//alert('Middle name cannot be empty');
		var2Err.innerHTML='Middle name cannot be empty';
		document.myform.middlename.focus();
		return false;
	}
	else {
		var2Err.innerHTML='';
	}

	if(var3=='') {
		//alert('Last name cannot be empty');
		var3Err.innerHTML='Last name cannot be empty';
		document.myform.lastname.focus();
		return false;
	}
	else {
		var3Err.innerHTML='';
	}

	return true;
}