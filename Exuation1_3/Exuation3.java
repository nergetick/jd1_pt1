package Exuation1_3;

public class Exuation3 {
	public static void main (String [] args) {
		int a;
		int b;
		int h;
				
		int x, y;
		
		a = -10;
		b = 10;
		h = 2;
		
		System.out.println("Дан отрезок от " + a + " до " + b + " Шаг изменения функции: " + h);
		
		for (int i=a; i<=b ; i = i+h) {
			
			if (i >2) {
				System.out.println("При х = " + i + " y = " + -i);
			} 
			else {
				System.out.println("При х = " + i + " y = " + i);
			}
			
		}
	}

}
