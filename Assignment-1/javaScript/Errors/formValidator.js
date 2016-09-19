function saveDetails(){
	var fname = document.getElementById("fName").value;
	var age = Number(document.getElementById("age").value);
	var purpose =  document.querySelector('input[name = "purpose"]:checked').value;
	var phone = document.getElementById("phone").value;
	
	try{
		if(fname == ''){
			throw "First Name Cannot be Empty";
		}
		else if((age < 10 || age > 90) || (isNaN(age))){
			throw "Please Enter a valid Age between 10 and 90";
		}
		else if(purpose == ''){
			throw "Please Select a Purpose";
		}
		else if((phone.length != 10) || isNaN(phone) || (phone == '')){
			throw "Please Enter a Valid Number";
		}
		else{
			document.getElementById("msg").innerHTML = " Your Details are saved successfully. We will contact you in 3-5 Business Days. Thanks for contacting us."
		}
	}
	catch(Error){
		alert(Error);
	}
}