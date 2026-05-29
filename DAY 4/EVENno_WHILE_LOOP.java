package JAVA_DAY_4;

public class EVENno_WHILE_LOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 20; // We want to print even numbers up to 20
        int i = 2;      // Start at the first even number

        System.out.println("Even numbers up to " + number + ":");

        while (i <= number) {
            System.out.print(i + " "); 
            i += 2;
        }
	}

}
