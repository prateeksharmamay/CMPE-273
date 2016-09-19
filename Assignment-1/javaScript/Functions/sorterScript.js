function sortNmbs(){
	var arr = document.getElementById("nArray").value;
	
	var nmbs= arr.split(',');
	
	document.getElementById("sortedNumbs").innerHTML = nmbs.sort(function(num1,num2) { return num1 - num2; });
}