package Project1;
/* 
 * Gabriella Bruno
 * Project 1
 * Title: Project1.java
 * Description: enter groceries, price, and quantity to display a receipt
 * Date: 9/22/24
 */

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to checkout.");
		System.out.println("Answer the questions accurately.");
		
		
		System.out.println("Enter the name of item 1:");
		String itemName1 = keyboard.nextLine();
		
		System.out.println("Enter the cost of item 1:");
		double itemCost1 = keyboard.nextDouble();
				
		System.out.println("Enter the quantity of item 1:");
		int itemQuant1 = keyboard.nextInt();
		keyboard.nextLine();                         //joined the open lab for this line
		
		double itemTotal1 = itemCost1 * itemQuant1;
		
		
		System.out.println("Enter the name of item 2:");
		String itemName2 = keyboard.nextLine();
		
		System.out.println("Enter the cost of item 2:");
		double itemCost2 = keyboard.nextDouble();
		
		System.out.println("Enter the quantity of item 2:");
		int itemQuant2 = keyboard.nextInt();
		keyboard.nextLine();                         //joined the open lab for this line

		double itemTotal2 = itemCost2 * itemQuant2;
		
		
		System.out.println("Enter the name of item 3:");
		String itemName3 = keyboard.nextLine();
		
		System.out.println("Enter the cost of item 3:");
		double itemCost3 = keyboard.nextDouble();
		
		System.out.println("Enter the quantity of item 3:");
		int itemQuant3 = keyboard.nextInt();
		keyboard.nextLine();                         //joined the open lab for this line

		double itemTotal3 = itemCost3 * itemQuant3;
		
		
		double subtotal = itemTotal1 + itemTotal2 + itemTotal3;
		double tax = 0.0625;
		double salesTax = subtotal * tax;
		double total = subtotal + salesTax;
				
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("                        Purchase Receipt");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%-30s%-15s%-14s%-5s", "Item", "Quantity", "Cost", "Total");
		System.out.println("");
		System.out.printf("%-30s%-15s%-14s%-5s","----", "--------", "----", "-----");
		System.out.println("");
		
		System.out.printf("%-30s%8s%11.2f%15.2f", itemName1, itemQuant1, itemCost1, itemTotal1);
		System.out.println("");
		System.out.printf("%-30s%8s%11.2f%15.2f", itemName2, itemQuant2, itemCost2, itemTotal2);
		System.out.println("");
		System.out.printf("%-30s%8s%11.2f%15.2f", itemName3, itemQuant3, itemCost3, itemTotal3);
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		
		System.out.print("Subtotal:");
		System.out.printf("%55.2f", subtotal);
		System.out.println("");
		System.out.print("Sales Tax (6.25%):");
		System.out.printf("%46.2f", salesTax);
		System.out.println("");
		System.out.println("");
		System.out.print("Total:");
		System.out.printf("%58.2f", total);
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("             Thank you for shopping with us today!");

	}

}

/*
 * example console output:
 * 
 Welcome to checkout.
Answer the questions accurately.
Enter the name of item 1:
Peanut M&Ms
Enter the cost of item 1:
2.99
Enter the quantity of item 1:
2
Enter the name of item 2:
Chex Mix
Enter the cost of item 2:
5.99
Enter the quantity of item 2:
3
Enter the name of item 3:
French Fries
Enter the cost of item 3:
3.99
Enter the quantity of item 3:
4

----------------------------------------------------------------
                        Purchase Receipt
----------------------------------------------------------------
Item                          Quantity       Cost          Total
----                          --------       ----          -----
Peanut M&Ms                          2       2.99           5.98
Chex Mix                             3       5.99          17.97
French Fries                         4       3.99          15.96
----------------------------------------------------------------
Subtotal:                                                  39.91
Sales Tax (6.25%):                                          2.49

Total:                                                     42.40
----------------------------------------------------------------
             Thank you for shopping with us today!
*
*/
