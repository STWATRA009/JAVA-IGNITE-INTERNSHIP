package JAVA_DAY_4;

public class SUM_OF_NOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; 
        int totalSum = 0;

        
        for (int i = 1; i <= n; i++) {
            totalSum += i; 
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + totalSum);
	}

}
