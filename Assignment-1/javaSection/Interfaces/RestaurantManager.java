package javaSection.Interfaces;

import java.util.Scanner;

public class RestaurantManager {
	public static void main(String args[]){
		int choice;
		String ans;
		Scanner reader = new Scanner(System.in);
		do{
			System.out.println("Welcome to Restaurant Manager, Please select a Restaurant:");
			System.out.println("1. Tandoori Grills");
			System.out.println("2. Mainland China");
			System.out.println("3. Exit");
			System.out.print("\nPlease Enter your Choice: ");
			choice = reader.nextInt();
			reader.nextLine();
			
			switch (choice) {
			case 1:
				TandooriGrills tg = new TandooriGrills();
				System.out.println("\n\n***Tandoori Grills Restaurant***");
				System.out.print("Enter Maincourse Buffet Details: ");
				String tgBuffet = reader.nextLine();
				tg.restaurantMenu(tgBuffet);
				
				System.out.print("Do you want to generate a Bill (Y/N)?");
				String ans1 = reader.nextLine();
				
				if(ans1.equalsIgnoreCase("y")){
					System.out.print("Enter price of Buffet: ");
					int buffetprice = reader.nextInt();
					
					System.out.print("Enter Buffet's Quantity: ");
					int buffetQty = reader.nextInt();
					reader.nextLine();
					tg.calculateBill(buffetprice, buffetQty);
				}
				else{
					System.out.println("Thanks for using Tandoori Grills !!!");
				}
				break;
				
			case 2:
				MailandChina mc = new MailandChina();
				System.out.println("***Mailand China Restaurant***");
				System.out.print("Enter Maincourse Buffet Details: ");
				String mcBuffet = reader.nextLine();
				mc.restaurantMenu(mcBuffet);
				
				System.out.print("Do you want to generate a Bill (Y/N)?");
				String ans2 = reader.nextLine();
				
				if(ans2.equalsIgnoreCase("y")){
					System.out.print("Enter price of Buffet: ");
					int buffetprice = reader.nextInt();
					
					System.out.print("Enter Buffet's Quantity: ");
					int buffetQty = reader.nextInt();
					reader.nextLine();
					mc.calculateBill(buffetprice, buffetQty);
				}
				else{
					System.out.println("Thanks for using Mailand China !!!");
				}
				break;
			
			case 3:
				System.exit(0);
			
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
