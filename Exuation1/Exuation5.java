package Exuation1;

public class Exuation5 {

	public static void main(String[] args) {
		int T = 500000;
		
		int H;
		int M;
	    int S;
	    
	    H = T/3600;
	    M = T/60 - H*60;
	    S = T-H*3600-M*60;
	    
	    System.out.println("Исходное время: " + T + " с");
	    System.out.println(H + "часов " +  M + "минут " + S + "секунд.");		

	}

}
