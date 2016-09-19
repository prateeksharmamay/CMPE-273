function updateSentence(){
	var myString = document.getElementById("myString").value;
	var addWord = document.getElementById("addWord").value;
	var posWord = document.getElementById("posWord").value;
	
	var pat = new RegExp('\\s('+posWord+')\\s', "i");
	
	var pos = myString.search(pat);
	
	if(pos < 0){
		alert("Oops ! Looks like you gave the wrong word. Please retry with a word from the sentence.");
	}
	
	else{
		var arr = myString.split(pat);
		
		var finalString = arr[0] + " " + arr[1] + " " + addWord + " " + arr[2];
		document.getElementById("newSentence").innerHTML = finalString;
	}
}