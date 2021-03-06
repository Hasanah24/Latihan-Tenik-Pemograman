package BigIntegerTest;

import java.math.*;
import java.util.*;

public class BigIntegerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you need to draw? ");
			int k = in.nextInt();
		
		System.out.print("What is the highest number you can draw? ");
			int n = in.nextInt();
		
		BigInteger randoms = BigInteger.valueOf(1);
		
		for (int i = 1; i <= k; i++)
			randoms = randoms.multiply(randoms.valueOf(n - i + 1)).divide(randoms.valueOf(i));
		
		System.out.println("Your odds are 1 in " + randoms + ". Good Luck!");
	}
}
