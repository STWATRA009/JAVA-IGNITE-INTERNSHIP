package JAVA_DAY_4;

import java.util.Scanner;

public class ATM_Retry_Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int correct_pin=6969;
		int pin;
		do
		{
			System.out.println("Enter the pin (4-digit):");
			pin = sc.nextInt();
			if(pin!=correct_pin)
			{
				System.out.println("Wrong pin! Please try again!");
			}
			
		}while(pin!=correct_pin);
		
		System.out.println("Successfully logged into account!");
		sc.close();
	}

}
