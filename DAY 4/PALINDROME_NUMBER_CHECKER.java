package JAVA_DAY_4;

import java.util.Scanner;

public class PALINDROME_NUMBER_CHECKER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp>0)
		{
			rev=(rev*10)+temp%10;
			temp/=10;
		}
		if(rev==num)
		{
			System.out.println("Palindrome number!");
		}
		else
		{
			System.out.println("Not palindrome!");
		}
		sc.close();
	}

}
