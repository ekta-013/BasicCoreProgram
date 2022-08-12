package CoreJava;
import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		int result = 1;
        System.out.println("Input Any Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Input Power");
        int pow = sc.nextInt();

        for(int i=1; i<=pow; i++){     //e.g-input 5 pow 2 //i=1 //1<=2 //it goes on result=r=5*1 //r=5
            result = num*result;      //i++ //i=2 //2<=2 //result = 5*5=25
        }
        System.out.println("Result of your input is : "+result);
	}
}
