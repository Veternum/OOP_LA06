package learning;

public class soal1g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double tally = 1;
		
		for(double i = 1; i < 6; i++) {
			tally += 2;
			if (i%2 == 0) a += (1/tally);
			else a -= (1/tally);
		}
		System.out.println("A = " + (4 * a));

		double b = 1;
		tally = 1;
		
		for(double i = 1; i < 7; i++) {
			tally += 2;
			if (i%2 == 0) b += (1/tally);
			else b -= (1/tally);
		}
		System.out.println("B = " + (4 * b));
	}

}