package JAVA_DAY_4;

public class ODDno_DO_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 20;
        int i = 1;      
        System.out.println("Odd numbers up to " + limit + ":");
        do {
            System.out.print(i + " ");
            i += 2; 
        } while (i <= limit);
	}

}
