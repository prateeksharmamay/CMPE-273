package javaSection.Stacks;

public class AirportHotelShuttle {
	private String passengerName;
	private int busCapacity;
	public String passengerStack[];
	private int top = -1;
	
	public AirportHotelShuttle(int cap){
		this.busCapacity = cap;
		this.passengerStack = new String[cap];
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getBusCapacity() {
		return busCapacity;
	}

	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}
	
	public int noOfPassengers(){
		System.out.println("The Total number of passengers in the bus are: " + (top+1));
		if(top>=0){
			nextPassengerToLeave();
		}
		return (top+1);
	}
	
	public boolean busEmpty(){
		if(top < 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean boardBus(String passengerName){
		if(top == (busCapacity-1)){
			System.out.println("Bus is full. Please take the next bus.");
			return false;
		}
		else{
			++top;
			passengerStack[top] = passengerName;
			return true;
		}
	}
	
	public boolean leaveBus(){
		if(busEmpty()){
			System.out.println("The bus is already Empty.");
			return false;
		}
		else{
			String temp = passengerStack[top];
			top--;
			System.out.println("Passenger leaving the bus : "+temp);
			return true;
		}
	}
	
	public String nextPassengerToLeave(){
		System.out.println("Next passenger who will leave :"+ passengerStack[top]);
		return passengerStack[top];
	}
}
