import java.math.BigInteger;
import java.util.Scanner;

public class HackerRankBigInteger {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 BigInteger a = scanner.nextBigInteger();
		 BigInteger b = scanner.nextBigInteger();
		 BigInteger c = 	a.add(b);
		 BigInteger d = a.multiply(b);
		 System.out.println(c);
		 System.out.println(d);
		 scanner.close();
		 

	}

}
