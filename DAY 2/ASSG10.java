//ATM Information System
package JAVA_DAY_2;

import java.util.Scanner;

public class ASSG10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Account balance (in Rs.):");
		double balance=sc.nextDouble();
		System.out.println("Withdrawl amount (in Rs.):");
		double withdraw=sc.nextDouble();
		System.out.println("Account holder "+name+"'s bank statement:");
		System.out.println("Remaining balance: Rs."+(balance-withdraw));
		System.out.println("Is balance greater than withdraw: "+(balance>withdraw));
		sc.close();
	}
}
