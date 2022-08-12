package CoreJava;
import java.util.Scanner;

public class HarmonicNumber {
	public static double harmonicNum(int n) {
		double sum = 0;
		if (n > 0) {
			for(double i = 1; i <= n; i++) {
				sum  += (1/i);
			}
		}else {
			System.out.println("Invalid");
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		System.out.println("Harmonic Number: " +harmonicNum(n));
	}

}
