package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//Initialize output string
		String returnStr = "";
		/**
		 * Read number of store items and create 
		 * parallel arrays for items, prices, 
		 * item frequencies, and customer frequencies
		 */
		int numOfStoreItems = scan.nextInt();
		String[] inventoryItems = new String[numOfStoreItems];
		double[] inventoryPrices = new double[numOfStoreItems];
		int[] inventoryFrequencies = new int[numOfStoreItems];
		int[] customerFrequencies = new int[numOfStoreItems];
		/*
		 * Loop through items and prices arrays reading in data
		 */
		for (int i = 0; i < numOfStoreItems; i++) {
			
			inventoryItems[i] = scan.next();
			inventoryPrices[i] = scan.nextDouble();
			
		}
		/*
		 * Loop through customers updating customer frequencies
		 * and item frequencies
		 */
		int numberOfCustomers = scan.nextInt();
		for (int j = 0; j < numberOfCustomers; j++) {
			//create boolean array to check duplicate items
			boolean[] hasPurchased = new boolean[numOfStoreItems];
			String customerName = scan.next() + " " + scan.next();
			/*
			 * Obtain number of specific item and loop through them
			 */
			int numOfCustomerItems = scan.nextInt();
			for(int k = 0; k < numOfCustomerItems; k++) {
				/*
				 * Use item name to add quantity to specific 
				 * index of item frequencies
				 */
				int itemQuantity = scan.nextInt();
				String item = scan.next();
				//call findIndexOf method from A1Adept to find position of item 
				int itemIndex = A1Adept.findIndexOf(inventoryItems, item);
				//Update item frequencies
				inventoryFrequencies[itemIndex] += itemQuantity;
				/*
				 * Check if customer has not purchased item
				 */
				if (!hasPurchased[itemIndex]) {
					/*
					 * If not purchased, set array to true to show purchased
					 * Update customer frequency for that item
					 */
					hasPurchased[itemIndex] = true;
					customerFrequencies[itemIndex]++;
					
				}
					
			}
				
		}
	  /*
	   * Format return string for each item depending on number of customers and items
	   */
	  for (int frequencyIndex = 0; frequencyIndex < inventoryFrequencies.length; frequencyIndex++) {
		/*
		 * Format string if no customers bought item
		 */
		if (customerFrequencies[frequencyIndex] != 0) {
			
			returnStr += customerFrequencies[frequencyIndex] + " ";
			
		}
		else {
			returnStr += "No ";
		}
		
		returnStr += "customers bought ";
		/*
		 * Format string if no items were purchased
		 */
		if (inventoryFrequencies[frequencyIndex] != 0) {
			
			returnStr += inventoryFrequencies[frequencyIndex] + " ";
		}
		returnStr += inventoryItems[frequencyIndex] + "\n";
		
	
	}
	//Print output string
	System.out.println(returnStr);
	}
}
