import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		boolean minor=false,adult=false,senior=false;
		Scanner input = new Scanner(System.in);
        System.out.print("Age:");
        int age = input.nextInt();
        while (age < 0 ) {
            System.out.println("Input a valid age. ");
            System.out.print("Age:");
            age = input.nextInt();
        }
        input.close();	
		if (age<18)
		{
			minor=true;
		}
		else if (age<60)
		{
			adult=true;
		}
		else
		{
			senior=true;
		}
		System.out.printf("minor? %b\nadult? %b\nsenior? %b",minor,adult,senior);
		System.exit(0); 
	}

}
