import java.util.Scanner;

public class CheckMultiplesOf3Or5 {

	public static void main(String[] args) {
		boolean result = false;
		Scanner input = new Scanner(System.in);
        System.out.print("Number:");
        int number = input.nextInt();
        while (number < 0 ) {
            System.out.println("Input a non-negative number. ");
            System.out.print("Number:");
            number = input.nextInt();
        }
        input.close();	
        if((number % 3 == 0) || (number % 5 == 0))
        {
        	result=true;
        }
        System.out.printf("Is the number %d either a multiple of 3 or 5? %b",number,result);
        System.exit(0);
	}

}
