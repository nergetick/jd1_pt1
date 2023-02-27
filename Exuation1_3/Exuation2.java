package Exuation1_3;

import java.util.Scanner;

public class Exuation2 {
	public static void main(String[] args) {		
		
			Scanner sc = new Scanner (System.in);
			int v=0;
			int sum=0;
			String var;
			
			 System.out.println("Введите число > 0");
			 
				while(sc.hasNextInt() == false) {
					sc.next();
					System.out.println("Вы ввели не число или число < 0. Введите число. Введите число >0");
				}
				v = sc.nextInt();
				if (v > 0) {				
				for (int i=0; i<=v; i++) {
					sum = sum+i;
				}
				System.out.println("Вы ввели число: " + v);
				System.out.println("Сумма чисел от 0 до " + v + " равна " + sum);
				}
				else {
					System.out.println("Вы ввели отрицательное число. Перезапустите программу и введите положительное число");
				}
				
				}
	}
