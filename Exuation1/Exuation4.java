package Exuation1;

public class Exuation4 {

	public static void main(String[] args) {
		String x = "333.444";
		
		String a;
		String b;
				
		a = x.substring(0,x.indexOf('.'));
		b = x.substring(x.indexOf('.')+1,7);
		
		System.out.println("Исходное число: "+ x);
		System.out.println("Измененное число: " + b +"."+ a);
				
	}
}
