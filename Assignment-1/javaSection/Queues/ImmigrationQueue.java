package javaSection.Queues;

//import java.util.Date;

public class ImmigrationQueue {
	private int qLength;
	singleNode first, last;
	
	public ImmigrationQueue(){
		qLength = 0;
		first = null;
		last=null;
	}
	
	// Function to add new visitor in the queue
	public boolean addVisitor(String visitorName, String dOB, String passportNumber, 
			String citizenshipCountry, String visaType, String visitingReason, String dateOfEntry){
		
		try {
			if(visitorName.equals("")||dOB.equals("")||dateOfEntry.equals("")||passportNumber.equals("")||citizenshipCountry.equals("")||
					visaType.equals("")||visitingReason.equals("")){
				throw new NullPointerException("You have not Entered values for some attributes.");
			}
			else{
				singleNode temp = new singleNode(visitorName, dOB, passportNumber, citizenshipCountry, visaType, visitingReason, dateOfEntry);

				//if there is no one in the queue
				if(qEmpty() == true){
					first = temp;
				}	
				else{
					last.setNextNode(temp);
				}
				last = temp;
				qLength++;
				return true;
			}
			
		} catch (Exception e) {
			System.out.println("Error is: "+ e);
			return false;
		}
	}
	
	// Function to remove the visitor from queue after he is interviewed
	public boolean attendedVisitor(){
		if(qEmpty() == true){
			System.out.println("There is no visitor to be attended.");
			return false;
		}
		else{
			String currentVisitor = this.first.getVisitorName();
			System.out.println("Attending Visitor " + currentVisitor);
			// VISIOR DETAILS
			System.out.println("********** Visitor Details **********");
			System.out.println("Date of Birth: "+this.first.getDOB());
			System.out.println("Passport Number: "+this.first.getPassportNumber());
			System.out.println("Citizenship Country: "+this.first.getCitizenshipCountry());
			System.out.println("Visa Type: "+this.first.getVisaType());
			System.out.println("Visiting Reason: "+this.first.getVisitingReason());
			System.out.println("Date Of Entry: "+this.first.getDateOfEntry());
			first = first.getNextNode();
			qLength--;
			System.out.println(currentVisitor + " Visitor removed from Queue.");
			return true;
		}
	}
	
	// Function to return the number of the Visitors to be attended by Immigration Officers
	public int queueSize(){
		System.out.println("There are "+ qLength + " Visitors in the Queue.");
		System.out.println("These are:\n");
		singleNode temp = first;
		
		while(temp != null){
			System.out.println(temp.getVisitorName()+"\n");
			temp=temp.getNextNode();
		}
		return qLength;
	}
	
	
	public boolean qEmpty(){
		if(qLength == 0){
			return true;
		}
		else{
			return false;
		}
	}
}
