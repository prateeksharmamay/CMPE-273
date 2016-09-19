function getStarWarsData(){
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var starwarmovies = JSON.parse(this.responseText);
			var swTable = document.getElementById("displayTable");
			console.log(starwarmovies);
			
			for(i=0;i<starwarmovies.count;i++){
			    var addRow = swTable.insertRow(1);
			    var cell1 = addRow.insertCell(0);
			    var cell2 = addRow.insertCell(1);
			    
			    cell1.innerHTML = starwarmovies.results[i].episode_id;
			    cell2.innerHTML = starwarmovies.results[i].title;
			}
		}
	};
	var url = "http://swapi.co/api/films/";
	xhttp.open("GET", url, true);
	xhttp.send();
}