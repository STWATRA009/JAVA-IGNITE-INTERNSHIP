package JAVA_DAY_4;

import java.util.Scanner;

public class SUM_Until_Negative_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num;
		do
		{
			System.out.println("Enter the number:");
			num = sc.nextInt();
			if(num>=0)
			{
			sum+=num;
			}
		}while(num>=0);
			
		
		System.out.println("Sum is: "+sum);
		
		sc.close();
	}

}
