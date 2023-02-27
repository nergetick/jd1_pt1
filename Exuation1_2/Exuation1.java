package Exuation1_2;

public class Exuation1 {

	public static void main(String[] args) {
		int Degree1;
		int Degree2;
		int Degree3;
		
		Degree1 = 70;
		Degree2 = 20;
		Degree3 = 180-Degree1-Degree2;
		
		
		
		if (Degree3>0) {
			System.out.println("Такой треугольник существует.");
			if (Degree3==90||Degree1==90||Degree2==90) {
				System.out.println("Треугольик прямоугольный");
			}
			else {
				System.out.println("Треугольник не прямоугольный");				
			}
		}
		else {
			System.out.println("Такого трейгольника не существует");
		}
			

	}

}
