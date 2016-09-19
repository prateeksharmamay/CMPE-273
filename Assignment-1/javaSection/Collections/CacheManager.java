package javaSection.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CacheManager {

	public static void main(String[] args) {
		String websiteName;
		String ans;
		Scanner reader = new Scanner(System.in);
		Map<String,CacheDetails> cacheMap = new HashMap<String,CacheDetails>();
		CacheDetails cdetails = new CacheDetails();

		System.out.println("We Manage your Website Preferences in Cache:\n");

		do{
			System.out.print("Enter Name of the website: ");
			websiteName = reader.nextLine();

			if(websiteName.equals("")){
				System.out.println("No Data Provided");
				break;
			}

			if(cacheMap.containsKey(websiteName)){
				System.out.println("Fetching website from Cache.");

				cdetails = cacheMap.get(websiteName);
				System.out.println("Website Details:\n");
				cdetails.showDetails();
			}

			else{
				String wUrl;
				String wServerLocation;

				System.out.println("\nNot Present in Cache.");
				System.out.println("Enter the URL: ");
				wUrl = reader.nextLine();

				System.out.println("Enter the Server Location: ");
				wServerLocation = reader.nextLine();

				boolean flag = cdetails.getDetails(wUrl, wServerLocation);
				if(flag){
					cacheMap.put(websiteName, cdetails);
				}
			}

			System.out.println("\nDo you want to see the websites stored in Cache(Y/N): ");
			String ans2 = reader.nextLine();

			if(ans2.equalsIgnoreCase("y")){
				for(Map.Entry<String,CacheDetails> cache : cacheMap.entrySet()){
					String key = cache.getKey();
					CacheDetails cd = cache.getValue();

					System.out.println("*****************");
					System.out.println("Website Name: "+ key);
					cd.showDetails();
					System.out.println("*****************");
				}
			}

			System.out.println("\nDo you want to continue (Y/N): ");
			ans = reader.nextLine();
		}while(ans.equalsIgnoreCase("y"));
		reader.close();
	}

}