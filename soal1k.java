package learning;

public class soal1k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double second = 365.0*86400;
//		double current = 312032486;
//		double increase = (second/7) - (second/13) + (second/45);
//		for(double i = 1; i < 6; i++) System.out.println("Year " + (int)i + " Population: " + (current + i * increase));
		
		int mul = 365;
		long daySec = 86400;
        long current = 312032486;
                
        for(int i = 1; i < 6; i++) {
        	long yearSec = (i*mul) * daySec;
        	long increase = ((yearSec/7) - (yearSec/13) + (yearSec/45));
        	
        	long total = increase + current;

        	System.out.println("Year " + (double) i + " Population: " + (total));
        }
	}

}