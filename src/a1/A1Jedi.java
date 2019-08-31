package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		String returnStr = "";
		int numOfStoreItems = scan.nextInt();
		String[] inventoryItems = new String[numOfStoreItems];
		double[] inventoryPrices = new double[numOfStoreItems];
		int[] inventoryFrequencies = new int[numOfStoreItems];
		int[] customerFrequencies = new int[numOfStoreItems];
		
		for (int i = 0; i < numOfStoreItems; i++) {
			
			inventoryItems[i] = scan.next();
			inventoryPrices[i] = scan.nextDouble();
			
			
			
		}
		int numberOfCustomers = scan.nextInt();
		for (int j = 0; j < numberOfCustomers; j++) {
			
			boolean[] hasPurchased = new boolean[numOfStoreItems];
			String customerName = scan.next() + " " + scan.next();
			int numOfCustomerItems = scan.nextInt();
			
			for(int k = 0; k < numOfCustomerItems; k++) {
				
				int itemQuantity = scan.nextInt();
				String item = scan.next();
				int itemIndex = A1Adept.findIndexOf(inventoryItems, item);
				inventoryFrequencies[itemIndex] += itemQuantity;
				
				if (!hasPurchased[itemIndex]) {
					
					hasPurchased[itemIndex] = true;
					customerFrequencies[itemIndex]++;
					
				}
				
				
			}
				
		}
	
	  for (int frequencyIndex = 0; frequencyIndex < inventoryFrequencies.length; frequencyIndex++) {
	
		if (customerFrequencies[frequencyIndex] != 0) {
			
			returnStr += customerFrequencies[frequencyIndex] + " ";
			
		}
		else {
			returnStr += "No ";
		}
		
		returnStr += "customers bought ";
		if (inventoryFrequencies[frequencyIndex] != 0) {
			
			returnStr += inventoryFrequencies[frequencyIndex] + " ";
		}
		returnStr += inventoryItems[frequencyIndex] + "\n";
		
	
	}

	System.out.println(returnStr);
	}
}
