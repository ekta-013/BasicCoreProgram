package CoreJava;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		System.out.println("Enter Any Year");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if (input % 4 == 0 && input % 400 == 0) {

            System.out.println("Yes it is a leap year");}

        else if (input % 4 == 0  && input % 100 != 0){

            System.out.println("Yes it is a leap year"); }

        else System.out.println("No it is not a leap year");

	}

}
