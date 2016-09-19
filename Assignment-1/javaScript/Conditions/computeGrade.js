function grader(){
	var asgn1 = Number(document.getElementById("asgn1").value);
	var asgn2 = Number(document.getElementById("asgn2").value);
	var lab = Number(document.getElementById("lab").value);
	var mProject = Number(document.getElementById("mProject").value);
	var fExam = Number(document.getElementById("fExam").value);
	
	var asgnMarks = (0.15*(asgn1+asgn2)) ;
	var labMarks = (0.35*lab);
	var mpMarks = (0.35*mProject);
	var examMarks = (0.15*fExam);
	var marksObtained = asgnMarks+labMarks+mpMarks+examMarks;
	
	var maxAsgnMarks = (0.15*20) ;
	var maxLabMarks = (0.35*50);
	var maxMpMarks = (0.35*100);
	var maxExamMarks = (0.15*50);
	var maxMarks = maxAsgnMarks+maxLabMarks+maxMpMarks+maxExamMarks;
	
	var finalMarksPerc = (marksObtained/maxMarks)*100;
	
	if(finalMarksPerc > 90){
		document.getElementById("yourGrade").innerHTML = "Your Grade: A+  |||	Your %age: "+finalMarksPerc;
	}
	else if(finalMarksPerc > 80 && finalMarksPerc < 90){
		document.getElementById("yourGrade").innerHTML = "Your Grade: A	|||	Your %age: "+finalMarksPerc;
	}
	else if(finalMarksPerc > 70 && finalMarksPerc < 80){
		document.getElementById("yourGrade").innerHTML = "Your Grade: B	|||	Your %age: "+finalMarksPerc;
	}
	else if(finalMarksPerc > 60 && finalMarksPerc < 70){
		document.getElementById("yourGrade").innerHTML = "Your Grade: C	|||	Your %age: "+finalMarksPerc;
	}
	else if(finalMarksPerc > 50 && finalMarksPerc < 60){
		document.getElementById("yourGrade").innerHTML = "Your Grade: D	|||	Your %age: "+finalMarksPerc;
	}
	else if(finalMarksPerc > 40 && finalMarksPerc < 50){
		document.getElementById("yourGrade").innerHTML = "Your Grade: D- |||	Your %age: "+finalMarksPerc;
	}
	else{
		document.getElementById("yourGrade").innerHTML = "Your Grade: F	|||	Your %age: "+finalMarksPerc;
	}
}