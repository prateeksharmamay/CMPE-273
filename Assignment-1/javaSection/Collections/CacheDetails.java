package javaSection.Collections;

public class CacheDetails extends Throwable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String url;
	private String serverLocation;
	
	public boolean getDetails(String wUrl, String wServerLocation){
		try {
			if( wUrl.equals("") || wServerLocation.equals("") == true){
				throw new NullPointerException("wUrl or wServerLocation not defined.");
			}
			else{
				this.url = wUrl;
				this.serverLocation = wServerLocation;
				return true;
			}
			
		} catch (Exception e) {
			System.out.println("Error: "+e);
			return false;
		}
	}
	public boolean showDetails(){
		
		try {
			if(this.url.equals("") || this.serverLocation.equals("")){
				throw new NullPointerException("wUrl or wServerLocation not defined.");
			}
			else{
				System.out.println("URL: "+this.url);
				System.out.println("Server Location: "+ this.serverLocation);
				return true;
			}
			
		} catch (Exception e) {
			
			return false;
		}
	}
	
}
