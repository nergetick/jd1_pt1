package Exuation1_3;

public class Exuation1 {

	public static void main(String[] args) {
		
		double sum;
		sum=0;
		
		for (int i=1; i<=100; i++) {
			sum = sum + Math.pow(i, 2);
		}
		
		System.out.println("Сумма квадартов первых ста чисел ровна: " + sum);
	}

}
