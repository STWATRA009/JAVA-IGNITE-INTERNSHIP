package JAVA_DAY_4;

public class MULTIPLICATION_TABLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 9;
		int result = 0;
		System.out.println("=== Multiplication Table of 9 ===");
		{
			for(int i=1;i<=10;i++)
			{
				result = number * i; 
			
			
			System.out.println(number + " x " + i + " = " + result);
			}
		}
	}

}
