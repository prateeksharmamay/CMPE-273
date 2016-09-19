var students = [];
window.onload = function(){
	document.getElementById("studentsTable").style.display = "none";
}

function evaluateProfile(){
	var obj = {};
	obj.name = document.getElementById("sName").value;
	obj.gre = document.getElementById("sGre").value;
	obj.major = document.getElementById("sMajor").value;
	students.push(obj);
}

function submitEval(){
	evaluateProfile();
	document.getElementById("submitBtn").innerHTML = "Submit another Profile";
	document.getElementById("sName").value = '';
	document.getElementById("sGre").value = '';
	document.getElementById("sMajor").value = '';
	
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
		    var cell3 = addRow.insertCell(2);
		    
		    cell1.innerHTML = students[i].name;
		    cell2.innerHTML = students[i].gre;
		    cell3.innerHTML = students[i].major;
		}
		
	}
}