//Online Shopping Bill Generator
package JAVA_DAY_2;

import java.util.Scanner;

public class ASSG7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter product name:");
		String prdname = sc.nextLine();
		System.out.println("Enter product price(in Rs.):");
		double price = sc.nextDouble();
		System.out.println("Enter the quantity:");
		int qty = sc.nextInt();
		System.out.println("********Shopping bill********");
		System.out.println("Customer name: "+name);
		System.out.println("Product name: "+prdname);
		System.out.println("Price: Rs."+price);
		System.out.println("Quantity: "+qty);
		System.out.println("------------------------------");
		System.out.println("Total bill: Rs."+(price*qty));
		System.out.println("******************************");
		sc.close();
	}

}
