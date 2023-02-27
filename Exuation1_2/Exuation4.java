package Exuation1_2;

public class Exuation4 {
	public static void main (String [] args ) {
		int A;
		int B;		
		int x, y, z;
		
		A = 5;
		B = 4;
		
		int minAB;
		
		x = 1;
		y = 2;
		z = 300;
		
		System.out.println("Размеры отверстия: " + A + "x" + B);
		System.out.println("Размеры кирпича:" + x + "x" + y + "x" + z);
		
		if (A<=B) {
			minAB = A;
		}
		else  {
			minAB=B;
		}
		
		if ( x < minAB & y < minAB & z < minAB) {
			System.out.println("Кирпич пройдет через отверстие");
		}
		else {
			System.out.println("Кирпич не пройдет через отверстие");
		}
	}

}
