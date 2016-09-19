package javaSection.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppersParadiseStore {

	public static void main(String[] args) {

		int choice;
		String ans;
		Scanner reader = new Scanner(System.in);
		do{
			System.out.println("Welcome to Shoppers Paradise, Please select:");
			System.out.println("1. To buy an Eatable");
			System.out.println("2. To buy a Electronic Gadget");
			System.out.println("3. Exit");
			System.out.print("\nPlease Enter your Choice: ");
			while (!reader.hasNextInt()) 
			{        
				reader.next(); // Read and discard offending non-int input
			    System.out.print("Please enter an integer: "); // Re-prompt
			}
			choice = reader.nextInt();

			reader.nextLine();
			
			int count = 0;
			
			switch (choice) {
			case 1:
				List<Eatables> eatablesList = new ArrayList<Eatables>();
				ShoppersParadise<Eatables> cartE = new ShoppersParadise<Eatables>();
				
				System.out.print("How many eatables are you buying: ");
				while (!reader.hasNextInt()) 
				{        
					reader.next(); // Read and discard offending non-int input
				    System.out.print("Please enter an integer: "); // Re-prompt
				}
				count = reader.nextInt();
				reader.nextLine();
				
				for(int i=0; i< count; i++){
					Eatables eatable = new Eatables();
					System.out.print("Enter Eatable Name: ");
					String eName = reader.nextLine();
					
					System.out.print("Enter Eatable item cost: ");
					while (!reader.hasNextInt()) 
					{        
						reader.next(); // Read and discard offending non-int input
					    System.out.print("Please enter an integer: "); // Re-prompt
					}
					
					int cost = reader.nextInt();
					reader.nextLine();
					
					eatable.setEatables(eName, cost);
					eatablesList.add(eatable);
				}
				
				System.out.println("Adding Eatable to Cart for Checkout.");
				cartE.checkout(eatablesList);
				
				break;

			case 2:
				List<Electronics> gadgetsList = new ArrayList<Electronics>();
				ShoppersParadise<Electronics> cartG = new ShoppersParadise<Electronics>();
				
				System.out.print("How many Gadgets are you buying: ");
				while (!reader.hasNextInt()) 
				{        
					reader.next(); // Read and discard offending non-int input
				    System.out.print("Please enter an integer: "); // Re-prompt
				}
				count = reader.nextInt();
				reader.nextLine();
				
				for(int i=0; i< count; i++){
					Electronics gadget = new Electronics();
					System.out.print("Enter Gadget Name: ");
					String gName = reader.nextLine();
					
					System.out.print("Enter Gadget item cost: ");
					while (!reader.hasNextInt()) 
					{        
						reader.next(); // Read and discard offending non-int input
					    System.out.print("Please enter an integer: "); // Re-prompt
					}
					int cost = reader.nextInt();
					reader.nextLine();
					
					gadget.setElectronicsDetails(gName, cost);
					gadgetsList.add(gadget);
				}
				
				System.out.println("Adding Electronic Gadgets to Cart for Checkout.");
				cartG.checkout(gadgetsList);
				
				break;
				
			case 3:
				System.exit(0);
				break;
			
			default:
				System.out.println("Please Enter Relevant option.");
				break;
			}
			System.out.print("Do you want to Continue(Y/N):");
			ans = reader.nextLine();
		}while(ans.equalsIgnoreCase("y"));
		reader.close();
	}

}
