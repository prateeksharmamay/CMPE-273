package javaSection.Queues;

//import java.util.Date;
import java.util.Scanner;

public class ImmigrationVisitorManager {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		ImmigrationQueue visitor = new ImmigrationQueue();
		int choice;
		String answer;
		
		do{
				System.out.println("Welcome to the Immigration Department:");
				System.out.println("1: Add Visitor to the Queue.");
				System.out.println("2: Attend Visitor and remove from the Queue.");
				System.out.println("3: See the Total number of visitors to be attended");
				System.out.println("4: To Exit.");
				System.out.print("\n Please Enter the number of option you want to choose:");
				choice = reader.nextInt();
				reader.nextLine();
		
				switch(choice){
				case 1:
					String visitorName;
					String DOB;
					String passportNumber;
					String citizenshipCountry;
					String visaType;
					String visitingReason;
					String dateOfEntry;
		
					System.out.println("Please enter Visitor's Details:");
					
					System.out.print("Name : ");
					visitorName = reader.nextLine();
		
					System.out.print("Date of Birth : ");
					DOB = reader.nextLine();
		
					System.out.print("Passport Number : ");
					passportNumber = reader.nextLine();
		
					System.out.print("Citizenship Country : ");
					citizenshipCountry = reader.nextLine();
		
					System.out.print("Visa Type : ");
					visaType = reader.nextLine();
		
					System.out.print("Visiting Reason : ");
					visitingReason = reader.nextLine();
		
					System.out.print("Date Of Entry : ");
					dateOfEntry = reader.nextLine();
		
					boolean status = visitor.addVisitor(visitorName, DOB, passportNumber, citizenshipCountry, visaType, visitingReason, dateOfEntry);
					
					if(status){
						System.out.println("Added to Queue.");
					}
					else{
						System.out.println("Not Added to Queue.");
					}
					
					break;
		
				case 2:
					visitor.attendedVisitor();
					break;
					
				case 3:
					visitor.queueSize();
					break;
					
				case 4:
					System.exit(0);
					
				default:
					System.out.println("Wrong Choice. Please Enter a correct choice.");
			}
				
				System.out.print("Do you want to continue:");
				answer = reader.nextLine();
				System.out.println("\n");
		} while (answer.equals("y") || answer.equals("Y"));
		reader.close();
	}
}
