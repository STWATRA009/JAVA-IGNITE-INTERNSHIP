package JAVA_DAY_4;

public class WHILE_LOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        int totalSum = 0;
        
        int i = 1; 

      
        while (i <= n) {
            totalSum += i; 
            i++;           
        }

        System.out.println("Sum of numbers is: " + totalSum);
	}

}
