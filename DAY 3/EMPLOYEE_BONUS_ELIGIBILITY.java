package JAVA_DAY_3;

import java.util.Scanner;

public class EMPLOYEE_BONUS_ELIGIBILITY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of working years:");
		int year = sc.nextInt();
		System.out.println("Enter the attendance (in %):");
		double attendance = sc.nextDouble();
		System.out.println("Enter performance rating (1-5):");
		int rating = sc.nextInt();
		
		if(attendance>85 && year>3)
		{
			System.out.println("Eligible for bonus");
			switch(rating)
			{
				case 5:
					System.out.println("Bonus amount is Rs. 50,000");
					break;
				case 4:
					System.out.println("Bonus amount is Rs. 30,000");
					break;
				case 3:
					System.out.println("Bonus amount is Rs. 10,000");
					break;
				default:
					System.out.println("But since performance is not up to mark, there is no bonus!");
			}
		}
		else if(attendance<60)
		{
			System.out.println("Not eligible for bonus");
		}
		sc.close();
	}

}
