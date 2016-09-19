function startUp(){
	var uTable = document.getElementById("usersTable");
	
	if(localStorage.length==0){
		console.log("You are the First Visitor");
		uTable.style.display="none";
		document.getElementById("userHeader").style.display="none";
	}
	
	else{
		for(i=0;i<localStorage.length;i++){
		    var addRow = uTable.insertRow(1);
		    var cell1 = addRow.insertCell(0);
		    var cell2 = addRow.insertCell(1);
		    cell1.innerHTML = localStorage.key(i);
		    cell2.innerHTML = localStorage.getItem(localStorage.key(i));
		}
	}

}

function saveDetails(){
	var name = document.getElementById('userName').value;
	var favWebsite = document.getElementById('wsName').value;
	
	if(name == '' || favWebsite == ''){
		alert("Please fill User name and your favorite Website");
		exit();
	}
	
	console.log("name"+name);
	console.log("favWebsite"+favWebsite);
	localStorage.setItem(name,favWebsite);
	document.getElementById("usersTable").style.display="block";
	document.getElementById("userHeader").style.display="block";
	window.location.reload();
	
}

function clearLocalStorage(){
	console.log("clearLocalStorage");
	localStorage.clear();
	window.location.reload();
}