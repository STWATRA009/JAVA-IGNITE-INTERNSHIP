package JAVA_DAY_4;

public class EVENno_DO_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 20; 
        int i = 2;      
        System.out.println("Even numbers up to " + limit + ":");

        do {
            System.out.print(i + " ");
            i += 2; 
        } while (i <= limit);
	}

}
