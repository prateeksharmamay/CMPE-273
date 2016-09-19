package javaSection.Queues;

//import java.util.Date;

// To generate Linked List Nodes
public class singleNode {
	// Visitor's Personal Details
	private String visitorName;
	private String DOB;
	private String passportNumber;
	private String citizenshipCountry;
	private String visaType;
	private String visitingReason;
	private String dateOfEntry;
	
	private singleNode nextNode;
	
	// Constructor to instantiate values in Linked List
	public singleNode(String visitorName, String dOB, String passportNumber, 
			String citizenshipCountry, String visaType, String visitingReason, String dateOfEntry){
		this.visitorName = visitorName;
		this.DOB = dOB;
		this.passportNumber = passportNumber;
		this.citizenshipCountry = citizenshipCountry;
		this.visaType = visaType;
		this.visitingReason = visitingReason;
		this.dateOfEntry = dateOfEntry;
	}
	
	// Getters and Setters to set or retrieve values of visitor's attributes
	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		this.DOB = dOB;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getCitizenshipCountry() {
		return citizenshipCountry;
	}

	public void setCitizenshipCountry(String citizenshipCountry) {
		this.citizenshipCountry = citizenshipCountry;
	}

	public String getVisaType() {
		return visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public String getVisitingReason() {
		return visitingReason;
	}

	public void setVisitingReason(String visitingReason) {
		this.visitingReason = visitingReason;
	}

	public String getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public singleNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(singleNode nextNode) {
		this.nextNode = nextNode;
	}	
}
