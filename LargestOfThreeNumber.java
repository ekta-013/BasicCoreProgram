package CoreJava;
import java.util.Scanner;
public class LargestOfThreeNumber {

	public static void main(String[] args) {
		 ////Taking Input From User Using Scanner Class
        System.out.println("----------Find LargestNum----------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number");
        int N1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int N2 = scanner.nextInt();
        System.out.println("Enter Third Number");
        int N3 = scanner.nextInt();
        //Using Nested If-Else here
        /*First Condition
        If Its True=Then It Goes To Nested If-Else Condition and Check it
        If Its False=Then it Check Main Else Block Condition*/
        //if it false its check else if else is also false then it checks the third one
        if(N1 >= N2) {
            if (N1 >= N3) {
                System.out.println("LargestNum is : " + N1);
            } else {
                System.out.println("LargestNum is : " + N3);
            }
        }

        else {
            if (N2 >= N3) {
                System.out.println("LargestNum is :" + N2);
            } else {
                System.out.println("LargestNum is :" + N3);
            }
        }
	}

}
