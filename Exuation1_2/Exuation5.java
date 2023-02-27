package Exuation1_2;

public class Exuation5 {
public static void main (String [] args) {
	
	int x;
	double f1, f2;
	x=4;
	
	f1 = x*x - 3*x + 9;
	f2 = 1/(Math.pow(3,x)+6);
	
	System.out.println("При х=" + x);
	
	if (x<=3) {
		System.out.println("f(x) = " + f1);
	}
	else {
		System.out.println("f(x) = " + f2);
	}
	
		
}
}
