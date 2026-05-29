package JAVA_DAY_4;

public class MULTIPLICATION_WHILE_LOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 9; 
        int i = 1;     
        System.out.println("Multiplication Table of 9:");
        System.out.println("---------------------------");

        while (i <= 10) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
            
            i++;
        }
	}

}
