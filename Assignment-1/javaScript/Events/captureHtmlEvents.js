function highlight(x){
	document.getElementById(x).style.background = "yellow";
}

function clearField(x){
	document.getElementById(x).style.background = "white";
}

function movingUp(){
	document.getElementById("panelDiv").style.background = "red";
	document.getElementById("textContent").innerHTML = "Mouse Up Event Triggered.";
}

function movingDown(){
	document.getElementById("panelDiv").style.background = "green";
	document.getElementById("textContent").innerHTML = "  Mouse Down Event Triggered.";
}

function startup(){
	alert("Welcome To JS Events Demo.");
}

function submitForm(){
	alert('Your Details have been saved successfully')
}