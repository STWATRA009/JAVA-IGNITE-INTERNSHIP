package JAVA_DAY_2;

import java.util.Scanner;

public class TYPE_CASTING {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Decimal number");
			double num = sc.nextDouble();
			int result = (int)num;
			System.out.println("Original : " +num);
			System.out.println("Aftercasting : " +result);
		}
	}

}
