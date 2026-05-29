package JAVA_DAY_4;

public class ODDno_WHILE_LOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 20; 
        int i = 1;      

        System.out.println("Odd numbers up to " + number + ":");

        while (i <= number) {
            System.out.print(i + " "); 
            i += 2;
        }
	}

}
