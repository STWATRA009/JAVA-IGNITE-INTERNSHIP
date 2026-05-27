//Student Result Analyzer
package JAVA_DAY_2;

import java.util.Scanner;

public class ASSG8 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your name:");
				String name = sc.nextLine();
				System.out.println("Enter marks of 1st subject:");
				double mark1 = sc.nextDouble();
				System.out.println("Enter marks of 2nd subject:");
				double mark2 = sc.nextDouble();
				System.out.println("Enter marks of 3rd subject:");
				double mark3 = sc.nextDouble();
				double total = mark1+mark2+mark3;
				System.out.println("Student "+name+" has got:");
				System.out.println("Total marks: "+total);
				System.out.println("Average marks: "+(total/3));
				boolean greater = (total/3)>50;
				System.out.println("Marks greater than average: "+greater);
				sc.close();
		}
		
	}


