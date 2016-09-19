function submitAttendance(){
	addStudent();
	calculateAttendance();
	document.getElementById("submitBtn").innerHTML = "Add Student";
	document.getElementById("sAttendance").value = '';
	document.getElementById("sName").value = '';
	
}

var students = [];
window.onload = function(){
	document.getElementById("studentsTable").style.display = "none";
}

function calculateAttendance(){
	var totalStudents = students.length;
	var present=0;
	
	for(i=0;i<totalStudents;i++){
	    if(students[i].sAttendance == 'P'){
	    	present++;
	    }
	}
	var attPerc = (present/totalStudents)*100;
	document.getElementById("classPerc").innerHTML = "Present Students Percentage of Class: "+attPerc;
}

function addStudent(){
	var obj = {};
	obj.name = document.getElementById("sName").value;
	obj.sAttendance = document.getElementById("sAttendance").value;
	students.push(obj);
}

function showTable(){
	
	if(document.getElementById("showTable").innerHTML == "Hide Students Table"){
		document.getElementById("showTable").innerHTML = "Click to Show All Students";
		document.getElementById("studentsTable").style.display = "none";
	}
	else{
		document.getElementById("showTable").innerHTML = "Hide Students Table";
		document.getElementById("studentsTable").style.display = "block";
		
		var sTable = document.getElementById("studentsTable");
		var rowCount = sTable.rows.length;
		
		for(var j = 1; j< rowCount; j++){
			sTable.deleteRow(1);
		}
		
		for(i=0;i<students.length;i++){
		    var addRow = sTable.insertRow(1);
		    var cell1 = addRow.insertCell(0);
		    var cell2 = addRow.insertCell(1);
		    
		    cell1.innerHTML = students[i].name;
		    cell2.innerHTML = students[i].sAttendance;
		}
		
	}
}