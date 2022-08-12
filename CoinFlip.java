package CoreJava;
import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		int heads=0;
        int tails=0;
        int count=1;
        //NumberOfTimesToFlipCoin(SCANNERCLASS)
        System.out.println("Enter Number Of Times To Flip The Coin");
        Scanner scan = new Scanner(System.in);
        int flips = scan.nextInt();

        while(count <= flips) {

            double RandomFlips = Math.random();
            System.out.println("Sr No."+count + " " + "RandomValues : "+RandomFlips);

            if (RandomFlips < 0.5) {
                heads++;
                System.out.println("Heads");
            } else {
                tails++;
                System.out.println("Tails");
            }
            count++;
        }
        double headPercent = (double)heads/flips*100;
        System.out.println("NumOFHeads : " +headPercent);
        double tailPercent = (double)tails/flips*100;
        System.out.println("NumOFTails : "+tailPercent);
	}
}