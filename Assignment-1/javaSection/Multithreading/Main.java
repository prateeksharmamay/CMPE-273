package javaSection.Multithreading;

public class Main {

	public static void main(String[] args) {

		User user1=new User("A","First",1,5);
	    User user2=new User("B","Second",2,10);

	    Thread t1=new Thread(user1);
	    t1.setName(user1.uName);
	    Thread t2=new Thread(user2);
	    t2.setName(user2.uName);
	
	    t1.start();
	    
	    t2.start();
	    
	    
	}
}
