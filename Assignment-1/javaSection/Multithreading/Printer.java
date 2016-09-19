package javaSection.Multithreading;

/*
 * SINGLETON Class Printer
 */
public class Printer{
	
	
	private final int maxAllowedPrint = 10;
	private final int maxLimitPrint = 30;
	private static Printer singleInstance = null;
	
	public static Printer getsingleInstance(){
		if (singleInstance == null) {          
					singleInstance = new Printer();      
		}      
		return singleInstance;
	}
	

	int n=0;
	public void operator(User userDetails){
		synchronized (this) {
			System.out.println("\nPrinting Limit for each user for a day is :"+ maxLimitPrint);
			n = userDetails.printLog.get(Thread.currentThread().getName());
			
			if(n >= maxLimitPrint){
				System.out.println("You have EXCEEDED your Print Limit.");
			}

			else{
				int avail = 30- n ;
				System.out.println("\nAvailable prints for user "+userDetails.uName+" : "+ avail);
				if(userDetails.noPages < maxAllowedPrint){
					if(userDetails.noPages >= avail){
						userDetails.printLog.put(Thread.currentThread().getName(), n+ avail);
						printing(userDetails,avail);
					}

					else{
						userDetails.printLog.put(Thread.currentThread().getName(), n+ userDetails.noPages);
						printing(userDetails,userDetails.noPages);
					}
				}

				else{
					if(userDetails.noPages <= avail){
						userDetails.printLog.put(Thread.currentThread().getName(), n+ maxAllowedPrint);
						printing(userDetails,maxAllowedPrint);
					}

					else{
						if(avail > maxAllowedPrint){
							userDetails.printLog.put(Thread.currentThread().getName(), n+ maxAllowedPrint);
							printing(userDetails,maxAllowedPrint);
						}

						else{
							userDetails.printLog.put(Thread.currentThread().getName(), n+ avail);
							printing(userDetails,avail);
						}
					}
				}
				
				System.out.println("\nPages Printed by "+userDetails.uName+" : "+ userDetails.printLog.get(userDetails.uName));
			}
		}
	}
	
	void printing(User user,int pages){
			synchronized (this) {
				System.out.println("\nPrinting for Employee "+user.uName+" with ID "+user.uID);
				System.out.println("\nFile Name is "+user.fileName);
				
				for(int i=1;i<=pages;i++){
					System.out.println(Thread.currentThread().getName()+" Printing Page "+i+"\t");
					
				}
			}
	}
}
