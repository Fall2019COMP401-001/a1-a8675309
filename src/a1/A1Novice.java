package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		/*
		 * Initialize output string and read number of customers
		 */
		String returnStr = "";
		int numOfCustomers = scan.nextInt();
		/*
		 * Loop through each customer reading info and formatting output
		 */
		for (int i = 0; i < numOfCustomers; i++) {
		
			/*
			 * Get names and format into return String
			 */
			String firstName = scan.next();
			String lastName = scan.next();
			returnStr += firstName.charAt(0) + ". " + lastName + ": ";
			/*
			 * Initialize individual customer price and reset it to 0
			 */
			double totalCustomerPrice = 0;
			int numOfItems = scan.nextInt();
			/*
			 * Loop through customer items calculating price
			 */
			for (int j = 0; j < numOfItems; j++) {
				
				/*
				 * Get price and number of specific item
				 */
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();
				//Calculate and add item price to customer price
				totalCustomerPrice += (itemQuantity * itemPrice);
				
				
			}
			//Add total price for 1 customer to return String, start new line
			returnStr += String.format("%.2f", totalCustomerPrice) + "\n";
			
			
		}
		//Print output
		System.out.println(returnStr);
	}
	
}
