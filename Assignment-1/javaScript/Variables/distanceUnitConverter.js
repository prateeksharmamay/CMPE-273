function convertKm(){
	var km = document.getElementById("km").value;
	
	const KmToMilesConstant = 0.621371;
	
	var eqMiles = KmToMilesConstant * km;
	
	document.getElementById("miles").innerHTML = km + " Kilometeres are quivalent to " + eqMiles + " Miles";
}