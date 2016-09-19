function getUserPos() {
	if(navigator.geolocation){
		navigator.geolocation.getCurrentPosition(userPosition);
	}
}

function userPosition(position){
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var locDetails = this.responseText;
			doChanges(locDetails);
		}
	};
	
	var url = "http://ws.geonames.org/countryCode?lat="+ position.coords.latitude + "&lng="+ position.coords.longitude+"&username=demo";
	xhttp.open("GET", url, true);
	xhttp.send();
}

function doChanges(locDetails){
	locDetails = locDetails.trim();
	document.getElementById("country").defaultValue = locDetails;
	
	if(locDetails == 'US'){
		document.getElementById("phnnoCode").defaultValue = "+1";
	}
	else if(locDetails == 'IN'){
		document.getElementById("phnnoCode").defaultValue = "+91";
	}
	else if(locDetails == 'DE'){
		document.getElementById("phnnoCode").defaultValue = "+49";
	}
	else{
		document.getElementById("phnnoCode").defaultValue = "";
	}
}