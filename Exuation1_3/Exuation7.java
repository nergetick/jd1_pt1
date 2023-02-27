package Exuation1_3;

import java.util.Scanner;

public class Exuation7 {
	public static void main (String args [] ) {
	
		int m = enterInt ("Введите m");
		int n = enterInt ("Введите n");
		
		System.out.println("Вы ввели интервал: " + m + "..." + n);
		for (int i = m; i <= n; i++) {
			for (int j=1; j<i; j++) {
				if ( (i%j==0) & j!=1 ) {
					System.out.println(j + " является делителем " + i);
				}
			}
		}
		
	
	}
		public static int enterInt (String message) {	
			Scanner sc = new Scanner (System.in);
			System.out.println(message);
			while(sc.hasNextInt() == false) {
				sc.next();
				System.out.println(message);
			}
			int a = sc.nextInt();
			return a;
		}	
	  
	}

