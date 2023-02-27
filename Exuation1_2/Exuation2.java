package Exuation1_2;

public class Exuation2 {
	public static void main(String[] args) {
     double a, b, c, d, minAB, minCD;
     
     a = 100;
     b = 150;
     c = 20;
     d= 600;
     
     System.out.println ("Даны следующие числа: ");
     System.out.println ("a = "+a + ", " + "b = " + b + ", " + "c = " + c + ", " + "d = " + d);
     
     if (a<=b) {
    	 minAB = a;
     } else {
    	 minAB = b;
     }
     
     if (c<=d) {
    	 minCD = c;
     } else {
    	 minCD = d;
     }
     
     if (minAB >= minCD) {
    	 System.out.println ("max{min(a,b), min(c,d)} является " +  minAB);
     } else  {
    	 System.out.println("max{min(a,b), min(c,d)} является " + minCD);
     }
     		
	}
}
