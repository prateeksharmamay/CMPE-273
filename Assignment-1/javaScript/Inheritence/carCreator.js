
var Car = function(carName){
	this.carName = carName;
}

Car.prototype.getCarName = function(){
	return this.carName;
}

var Volkswagen = function(seatingType, roofType){
	this.seatingType = seatingType;
	this.roofType = roofType;
}

var car1 = new Car("Polo");
Volkswagen.prototype = car1;
var polo = new Volkswagen("Coupe","Sunroof");

var Toyota = function(fuelType){
	this.fuelType = fuelType;
}

var car2 = new Car("Prius");
Toyota.prototype = car2;
var prius = new Toyota("Hybrid");


function displayDetails(){
	var carchoice = document.querySelector('input[name = "brand"]:checked').value;
	
	if(carchoice == "vw"){
		document.getElementById("details").innerHTML = "Polo Details:"+"<br>" + "Seating Type: "+polo.seatingType+' , '+ "Roof Type: "+polo.roofType;;
	}
	else if(carchoice == "toyota"){
		document.getElementById("details").innerHTML = "Prius Details:"+"<br>" + "Fuel Type: " + prius.fuelType;
	}
	else{
		alert("Please Select a brand.");
	}

	
}