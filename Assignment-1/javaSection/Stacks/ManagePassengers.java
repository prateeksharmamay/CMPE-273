package javaSection.Stacks;

import java.util.Scanner;

public class ManagePassengers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int capacity = 0;
		int choice;
		String answer;
		
		System.out.print("Please Enter Bus Capacity:");
		capacity = reader.nextInt();
		
		AirportHotelShuttle passenger = new AirportHotelShuttle(capacity);
		
		do{
				System.out.println("Emirates Connect Welcomes You:");
				System.out.println("1: Boarding Passenger to the bus.");
				System.out.println("2: Dropping Passenger to the Destination.");
				System.out.println("3: See the Total number of Passengers to be dropped.");
				System.out.println("4: To Exit.");
				System.out.print("\n Please Enter the number of option you want to choose:");
				choice = reader.nextInt();
				reader.nextLine();
		
				switch(choice){
				case 1:
					String passengerName;
		
					System.out.print("Please enter Passenger's Name:");
					passengerName = reader.nextLine();
		
					passenger.boardBus(passengerName);
										
					break;
		
				case 2:
					passenger.leaveBus();
					break;
					
				case 3:
					passenger.noOfPassengers();
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
