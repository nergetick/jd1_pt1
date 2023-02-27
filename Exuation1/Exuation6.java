package Exuation1;

public class Exuation6 {

	public static void main(String[] args) {
		int X = -0;
		int Y = -3;
		boolean result1, result2;
		
		if ((X>=-4 & X<=4) & (Y>=-3 & Y<=0)) {
			result1 = true;
			}			
			else { 
				result1 = false;			
			}
		if ((X>=-2 & X<= 2) & (Y>=0 & Y<=4)) {
			result2 = true;
		}
			else {
				result2 = false;
			}
				
		if (result1 | result2){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		}
		
	}

