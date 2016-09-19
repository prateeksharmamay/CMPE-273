package javaSection.Generics;

public class Electronics implements DetailsProvider{
	private String gadgetName;
	private int price;
	
	public boolean setElectronicsDetails(String gadgetName, int price){
		try{
			if(gadgetName.equals("")){
				throw new Exception("Wrong Input for Name");
			}
			else{
				this.gadgetName = gadgetName;
				this.price = price;
				return true;
			}
		}
		catch (Exception e) {
			System.out.println("Error :" + e);
			return false;
		}
	}
	
	public String getName(){
		return this.gadgetName;
	}
	
	public int getCost(){
		return this.price;
	}
	
	 public String toString(){
		return "Electronic Gadget Name: "+ this.gadgetName +" and "+ "Cost of Electronic Gadget: "+ this.price;
	}
}
