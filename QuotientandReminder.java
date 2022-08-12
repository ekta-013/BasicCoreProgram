package CoreJava;
import java.util.Scanner;

public class QuotientandReminder {

	public static void main(String[] args) {
	System.out.println("Enter the value of num1 and num2");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int quotient = 0, reminder = 0;
	quotient = num1/num2;
	reminder = num1%num2;
	
	System.out.println("Quotient when" + num1 +"/" + num2 + "is:" + quotient);
	System.out.println("Reminder when" + num1 +"is divided by" + num2 + "is:" + reminder);
	
	}

}
