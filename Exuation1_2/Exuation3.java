package Exuation1_2;

public class Exuation3 {

	public static void main(String[] args) {
		int x1, x2, x3;
		int y1, y2, y3;
		
		x1 = 1;
		y1 = 3;
		
		x2 = 2;
		y2 = 4;
		
		x3 = 3;
		y3 = 5;
		
		
		System.out.println("Даны три точки с координатамb: ");
		System.out.println("A (" + x1 + "; " + y1 + ")");
		System.out.println("B (" + x2 + "; " + y2 + ")");
		System.out.println("C (" + x3 + "; " + y3 + ")");
		
	if( x2==x1 & y2==y1 ) {
		System.out.println("Точки лежат на одной прямой");
	}
	else {
		if (x2!=x1 & y2!=y1) {		
		if (((x3-x1)/(x2-x1)) == ((y3-y1)/(y2-y1))) {
		
		System.out.println("Точки лежат на одной прямой");
		}
	else {
		System.out.println("Точки не лежат на одной прямой");
	}
	}
		else {
			System.out.println("Точки не лежат на одной прямой");		
			
		}
     
	}
	}
}


