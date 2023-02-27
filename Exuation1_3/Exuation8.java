package Exuation1_3;

import java.util.Scanner;

public class Exuation8 {
	public static void main (String args [] ) {
		int a = enterInt ("Введите a");
		int b = enterInt ("Введите b");
		System.out.println ("Вы ввели следующие числа : " + a + " и " + b);		
		System.out.println("Число " + a + " Содержит " + number(a) + " цифр");
		System.out.println("Число " + b + " Содержит " + number(b) + " цифр");		
		int res1=a;
		int res2=b;
		int var3 = 0;	
		int [] replay = new int [20];
		int k = 0;
		
		for (int i = 1; i <= number(a); i++) {			
			int varA = res1%10;
			//System.out.println("Цифра первого числа" + varA);
			for (int j =1; j <= number(b); j++) {				
				int varB = res2%10;
				//System.out.println("Цифра второго числа" + varB);
				if (varA == varB) {					
					//System.out.println("Цифра " + varA + " встречается в обеих числах");						
					var3 = var3+1;
					replay [k] = varA;
					k = k+1;
				}
				res2=res2/10;
			}
			res1=res1/10;
			res2=b;
		}
		if (var3==0) {
			System.out.println("Введенные числа не содержат одинаковых цифр");	
			}
		else {
			System.out.println("!!!! Цифра " + replay [0] + " встречается в обеих числах");
	  	for (int i=1; i <= var3-1; i++) {
			int replayInd = 0;
			for (int j =0; j< i; j++) {
				if (replay [i] != replay [j]) {
					replayInd = replayInd + 1;
					if (replayInd == i) {
						System.out.println("!!!! Цифра " + replay [i] + " встречается в обеих числах");
				}
			}
			
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
	public static int number (int some_int) {
		double res1;
		int nomA = 1;
		for (int i=10; (res1 = some_int/i) >= 1; i=i*10) {
			nomA = 1 + nomA;
	}
		return nomA;
	}
	
	}

