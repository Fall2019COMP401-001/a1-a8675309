package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		String returnStr = "";
		
		int numOfCustomers = scan.nextInt();
		
		for (int i = 0; i < numOfCustomers; i++) {
			
			
			String firstName = scan.next();
			String lastName = scan.next();
			returnStr += firstName.charAt(0) + ". " + lastName + ": ";
			double totalCustomerPrice = 0;
			int numOfItems = scan.nextInt();
			for (int j = 0; j < numOfItems; j++) {
				
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();
				
				totalCustomerPrice += (itemQuantity * itemPrice);
				
				
			}
			
			returnStr += String.format("%.2f", totalCustomerPrice) + "\n";
			
			
		}
		System.out.println(returnStr);
	}
	
}
