package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numOfStoreItems = scan.nextInt();
		String[] inventoryItems = new String[numOfStoreItems];
		double[] inventoryPrices = new double[numOfStoreItems];
		for (int i = 0; i < numOfStoreItems; i++) {
			
			inventoryItems[i] = scan.next();
			inventoryPrices[i] = scan.nextDouble();
			
			
			
		}
		
		int numOfCustomers = scan.nextInt();
		double totalPrice = 0;
		double maxPrice = 0;
		String maxCustomer = "";
		String minCustomer = "";
		double minPrice = 0;
		for (int j = 0; j < numOfCustomers; j++) {
			
			String customerName = scan.next() + " " + scan.next();
			int numOfCustomerItems = scan.nextInt();
			double customerPrice = 0;
			for (int k = 0; k < numOfCustomerItems; k++) {
				
				int itemQuantity = scan.nextInt();
				String item = scan.next();
				double price = inventoryPrices[findIndexOf(inventoryItems, item)];
				customerPrice += (price * itemQuantity);
				
			}
			
			totalPrice += customerPrice;
			if (j == 0) {
				
				minPrice = customerPrice;
				
			}
			if (customerPrice > maxPrice){
				maxPrice = customerPrice;
				maxCustomer = customerName;
			}
			
			if (customerPrice <= minPrice) {
				
				minPrice = customerPrice;
				minCustomer = customerName;
			}
			customerPrice = 0;
		}
		double average = totalPrice / (double)numOfCustomers;
		System.out.println("Biggest: " + maxCustomer + " (" + String.format("%.2f", maxPrice) + ")");
		System.out.println("Smallest: " + minCustomer + " (" + String.format("%.2f",  minPrice) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		
	}
	
	static int findIndexOf(String[] stringArray, String str)
	{
		
		for (int l = 0; l < stringArray.length; l++) {
			
			if (stringArray[l].equals(str)) {
				
				return l;
			}
			
			
		}
		return -1;
		
	}
}
