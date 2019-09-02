package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//Read number of items sold at store
		int numOfStoreItems = scan.nextInt();
		/*
		 * Initialize parallel arrays with items and prices 
		 */
		String[] inventoryItems = new String[numOfStoreItems];
		double[] inventoryPrices = new double[numOfStoreItems];
		/*
		 * Loop and read items and prices into respective arrays
		 */
		for (int i = 0; i < numOfStoreItems; i++) {
			
			inventoryItems[i] = scan.next();
			inventoryPrices[i] = scan.nextDouble();
			
		}
		/*
		 * Set initial values for max and min prices and customers
		 */
		double totalPrice = 0;
		double maxPrice = 0;
		String maxCustomer = "";
		String minCustomer = "";
		double minPrice = 0;
		/*
		 * Read number of total customers and loop through each
		 */
		int numOfCustomers = scan.nextInt();
		for (int j = 0; j < numOfCustomers; j++) {
			/*
			 * Read name and number of customer's items
			 */
			String customerName = scan.next() + " " + scan.next();
			int numOfCustomerItems = scan.nextInt();
			double customerPrice = 0;
			/*
			 * Loop through each group of items
			 */
			for (int k = 0; k < numOfCustomerItems; k++) {
				//Get item name and quantity
				int itemQuantity = scan.nextInt();
				String item = scan.next();
				/*
				 * Calculate price using findIndexOf method and add to customer's price
				 */
				double price = inventoryPrices[findIndexOf(inventoryItems, item)];
				customerPrice += (price * itemQuantity);
				
			}
			//Add customer's price to total price
			totalPrice += customerPrice;
			/*
			 * Use first customer's price as initial minimum price
			 */
			if (j == 0) {
				
				minPrice = customerPrice;
				
			}
			/*
			 * If a customer's price is larger than the largest price,
			 * change maximum customer's name and price
			 */
			if (customerPrice > maxPrice){
				//Update values
				maxPrice = customerPrice;
				maxCustomer = customerName;
			}
			/*
			 * If a customer's price is less than the lowest price,
			 * change minimum customer's name and price
			 */
			if (customerPrice <= minPrice) {
				//Update values
				minPrice = customerPrice;
				minCustomer = customerName;
			}
			/*
			 * Reset customerPrice
			 */
			customerPrice = 0;
		}
		/*
		 * Calculate average price for all customers
		 */
		double average = totalPrice / (double)numOfCustomers;
		/*
		 * Print biggest and smallest, and average spender rounded to 2 decimal points
		 */
		System.out.println("Biggest: " + maxCustomer + " (" + String.format("%.2f", maxPrice) + ")");
		System.out.println("Smallest: " + minCustomer + " (" + String.format("%.2f",  minPrice) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		
	}

	/*
	 * Function that finds String element in an array
	 * Input: array of Strings stringArray and String str
	 * Output: Index of str in stringArray
	 * Returns -1 if str is not found in stringArray
	 */
	static int findIndexOf(String[] stringArray, String str)
	{
		//Loop through array
		for (int l = 0; l < stringArray.length; l++) {
			//Check if str matches an element in array
			if (stringArray[l].equals(str)) {
				//return index o
				return l;
			}
			
			
		}
		//Return -1 if not found
		return -1;
		
	}
}
