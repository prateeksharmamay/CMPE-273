package javaSection.Generics;

import java.util.List;

public class ShoppersParadise<T> {
	
	public int checkout(List <T> list){
		int cartPrice = 0;
		int cartLimit = 100;
		
		for(T item : list)
		{
			int cost=0;
			if(item instanceof Eatables){
				cost = ((Eatables) item).getCost();
			}
			else{
				cost = ((Electronics) item).getCost();
			}
			cartPrice += cost;
		}
			
		if(cartPrice > cartLimit){
			System.out.println("Sorry, you do not have sufficient credit limit. Please remove some items.");
			return 0;
		}
		else{
			System.out.println("********** B I L L ***********");
			System.out.println("ITEMS");
			for(T item : list){
				System.out.println(item);
			}
			System.out.println("Your Total Amount Payable: " + cartPrice);
			System.out.println("Thanks for shopping with us. Please come back soon.");
			return cartPrice;
		}
	}
}
