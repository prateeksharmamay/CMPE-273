package javaSection.Arrays;

import java.util.Scanner;

public class FrequencyCountDisplay {
	public static void main(String[] args){
		int arrNumbers[];
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter limit of numbers in the array: ");
		int limit = reader.nextInt();
		
		arrNumbers = new int[limit];
		
		
		for(int i=0; i<limit;i++){
			System.out.print("Enter "+(i+1)+ " Number in array:");
			arrNumbers[i] = reader.nextInt();
		}
		
		FrequencyCounter fc = new FrequencyCounter();
		fc.counter(limit,arrNumbers);
		reader.close();
	}
}
