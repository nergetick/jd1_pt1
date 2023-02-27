package Exuation1_3;

public class Exuation5 {
	public static void main (String args []) {
		int i;
		int e =3;
		int i1 = -3;
		int in = 20;
		double sum =0;		
		for (i = i1; i <= in; i ++ ) {
			double a = (1/(Math.pow(2, i))) + (1/(Math.pow(3, i)));
			    if (Math.abs(a) >= e) {
				System.out.println( i + "-й член равен " + a);
				sum = sum + a;
			}
		}
		System.out.println("На интервале n = " + i1 + "..." + in + " cумма членов ряда an, модуль которых больше или равен " + e + " составляет "  + sum);
	}
}
