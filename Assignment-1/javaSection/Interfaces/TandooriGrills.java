package javaSection.Interfaces;

public class TandooriGrills implements Menu,Billing{
	private String mainCourseBuffet;
	private int mcprice;
	private int mcQty;
	
	public boolean restaurantMenu(String mcBuffet){
		try{
			if(mcBuffet.equals("")){
				throw new NullPointerException("You have not provided Buffet Details");
			}
			else{
				this.setMainCourseBuffet(mcBuffet);
				return true;
			}
		}
		catch (Exception e) {
			System.out.println("Error:"+e);
			return false;
		} 
	}
	
	public int calculateBill(int mcprice, int mcQty) {
		int total;
		total = (mcprice*mcQty);
		System.out.println("Total Bill: " + total);
		return total;
	}

	public String getMainCourseBuffet() {
		return mainCourseBuffet;
	}

	public void setMainCourseBuffet(String mainCourseBuffet) {
		this.mainCourseBuffet = mainCourseBuffet;
	}

	public int getMcprice() {
		return mcprice;
	}

	public void setMcprice(int mcprice) {
		this.mcprice = mcprice;
	}

	public int getMcQty() {
		return mcQty;
	}

	public void setMcQty(int mcQty) {
		this.mcQty = mcQty;
	}
	
}
