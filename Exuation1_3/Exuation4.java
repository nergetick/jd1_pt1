package Exuation1_3;

import java.math.BigInteger;

public class Exuation4 {
	public static void main (String args []) {
		BigInteger result1 = BigInteger.valueOf(1);
		int i;
		for (i=1; i<=200; i++) {
			result1 = result1.multiply(BigInteger.valueOf((long)i*i));
			
		}
		System.out.println("Произведение квадратов первых 200 чиселе составляет: " + result1);
	}

}
