function kgToPound(){
	var weightKg = Number(document.getElementById("kg").value);
	
	var weightPound = 2.21 * weightKg;
	
	document.getElementById("pound").innerHTML = "Your weight in pounds: "+ String(weightPound);
}