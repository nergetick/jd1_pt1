package Exuation1;

public class Exuation2 {
	public static void main( String args[]){
		int a=1;
		int b=150;
		int c=5;
		double z;
		
		z =((b+ Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a) - Math.pow(a, 3)*c + Math.pow(b, -2);
		System.out.println ("a = " + a);
		System.out.println ("b = " + b);
		System.out.println ("c = " + c);
		System.out.println ("z = " + z);
	}

}
