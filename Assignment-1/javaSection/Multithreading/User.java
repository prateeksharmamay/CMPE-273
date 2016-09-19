package javaSection.Multithreading;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class User implements Runnable{

	protected String uName;
	protected String fileName;
	protected int uID;
	protected int noPages;
	protected Map<String,Integer> printLog = new HashMap<String, Integer>(); // < User Name, Current Status of Printed Pages>
	Scanner s = new Scanner(System.in);
	User(){
		uName = null;
		fileName = null;
		uID = 0;
		noPages = 0;	
		printLog.put(null, 0);
		
	}
	
	User(String uName,String fileName,int uID,int noPages){
		this.uName = uName;
		this.fileName = fileName;
		this.uID = uID;
		this.noPages = noPages;
		printLog.put(uName,0 );
	}
	
	void inputData(){
		System.out.println("Enter Your User Name : ");
		uName = s.next();
		
		System.out.println("Enter File Name : ");
		fileName = s.next();
		
		System.out.println("Enter Your User ID : ");
		uID = s.nextInt();
		
		System.out.println("Enter Number of Pages to be Printed : ");
		noPages = s.nextInt();
		
	}
	
	void displayData(){
		System.out.println("Your User Name : " + uName);
		
		System.out.println("Your File Name : " + fileName);
				
		System.out.println("Your User ID : " + uID);
		
		System.out.println("Number of Pages to be Printed : " + noPages);
	}
	
	
	
	public void run(){
		String ans=null;
		
		do{
			Printer print = Printer.getsingleInstance();    
			print.operator(this);

			System.out.println("\nCurrent Thread is : " + Thread.currentThread().getName());
			System.out.println("\nDo U Wanna Continue : ");
			ans = s.next();

		}while(ans.equalsIgnoreCase("yes"));
	}
}