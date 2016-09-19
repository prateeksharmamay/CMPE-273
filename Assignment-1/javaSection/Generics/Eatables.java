package javaSection.Generics;

public class Eatables implements DetailsProvider{
	private String eatableName;
	private int cost;
	
	public boolean setEatables(String eatableName, int totalCost){
		try{
			if(eatableName.equals("")){
				throw new Exception("Wrong Input for Name");
			}
			else{
				this.eatableName = eatableName;
				this.cost = totalCost;
				return true;
			}
		}
		catch (Exception e) {
			System.out.println("Error :" + e);
			return false;
		}
	}
	
	public String getName(){
		return this.eatableName;
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public String toString(){
		return "Eatable Name: "+ this.eatableName +" and "+ "Cost of Eatable: "+ this.cost;
	}
}