package JAVA_DAY_4;

public class MULTIPLICATION_DO_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 9; 
        int i = 1;      
        System.out.println("Multiplication Table of 9 (using DO_WHILE):");
        System.out.println("------------------------------------------");

        do {
        		int result = number * i;
        		System.out.println(number + " x " + i + " = " + result);
        		i++; 
            
        	}
        	while (i <= 10);
	}

}
