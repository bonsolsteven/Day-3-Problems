import java.util.Scanner;
public class FullName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
	    String firstname = input.nextLine();
	    System.out.println("Enter last name: ");
	    String lastname = input.nextLine();
	    System.out.printf("Your full name is %s %s", firstname,lastname); 
	    System.exit(0);
	}

}
