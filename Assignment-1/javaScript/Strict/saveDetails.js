var obj = {};
function save( ) {
	"use strict";
	try{
		var name = document.getElementById("name").value;
		var age = document.getElementById("age").value;
				
		Object.defineProperty(obj, "name", {value:name, writable:false});
		Object.defineProperty(obj, "age", {value:age, writable:false});
		document.getElementById("details").innerHTML = " User Name: "+ obj.name + " , " + "User Age: " + obj.age;
	}
	catch(Exception){
		alert("You are not allowed to Enter new data. Exception: "+Exception);
	}
	
	
}