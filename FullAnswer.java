package learning;

/*
 *Object Oriented Programming, kelas LA06.
 *Dosen: Anderies
 * 
 * Anggota Kelompok:
 * - Hans Rhesa Andersen	(2502032346)
 * - Ilham Hadi Shahputra	(2502042164)
 * - Di Raja Q. Rabbani		(2502042473)
 * 
 */

public class FullAnswer {
	
	public void reveal() {
		n1();
		n2();
		n3();
		n4();
		n5();
		n6();
		n7();
		n8();
		n9();
		n10();
		n11();
	}
	
	private void n1() {
		System.out.println("1.1");
		
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
		
		System.out.println("\n");
	}
	
	private void n2() {
		System.out.println("1.2");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Welcome to Java");
		}
		
		System.out.println("\n");
	}
	
	private void n3() {
		System.out.println("1.3");
		
		System.out.println("    J     A     V     V     A");
		System.out.println("    J    A A     V   V     A A");
		System.out.println("J   J   AAAAA     V V     AAAAA");
		System.out.println(" J J   A     A     V     A     A");
		
		System.out.println("\n");
	}
	
	private void n4() {
		System.out.println("1.4");
		
		System.out.println("a		a^2		a^3");
        for(int i = 1; i < 5; i++) System.out.println(i + "		" + (int)Math.pow(i,2) + "		" + (int)Math.pow(i, 3));
        
        System.out.println("\n");
	}
	
	private void n5() {
		System.out.println("1.5");
		
		System.out.println(((9.5 * 4.5) - (2.5 * 3))/(45.5 - 3.5));
		
		System.out.println("\n");
	}
	
	private void n6() {
		System.out.println("1.6");
		
		int a = 0;
        for(int i=1; i<10; i++) a += i;
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + a);
        
        System.out.println("\n");
	}
	
	private void n7() {
		System.out.println("1.7");
		
		//1.7 a
		double pi = 0;
        double denom = 3.0;
        double num = 1.0;
        
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) num = num - (1.0/denom);
            else num = num + (1.0/denom);
            
            denom = denom + 2.0;
        }
        pi = 4 * num;
        System.out.println(pi);
        
        //1.7 b
        pi = 0;
        denom = 3.0;
        num = 1.0;
        
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) num = num - (1.0/denom);
            else num = num + (1.0/denom);
            
            denom = denom + 2.0;
        }
        pi = 4 * num;
        System.out.println(pi);
        
        System.out.println("\n");
	}
	
	private void n8() {
		System.out.println("1.8");
		
		double r = 5.5;
        System.out.println("Perimeter = " + 2 * r * Math.PI);
        System.out.println("Area = " + r * r * Math.PI);
        
        System.out.println("\n");
	}
	
	private void n9() {
		System.out.println("1.9");
		
		double width = 4.5;
        double height = 7.9;
        
        System.out.println("Area = " + width*height);
        System.out.println("Perimeter = " + ((2*width) + (2*height)));
        
        System.out.println("\n");
	}
	
	private void n10() {
		System.out.println("1.10");
		
		double km = 14;
        double time = (45.5/60);
        double kph = km / time;
        
        System.out.println("The average speed in kilometer per hour is = " + kph);
        
        double mph = kph / 1.6;
        
        System.out.println("Hence, after conversion, the average speed in miles per hour is = " + mph);
	
        System.out.println("\n");
	}
	
	private void n11() {
		System.out.println("1.11");
		
		int mul = 365;
		long daySec = 86400;
        long current = 312032486;
                
        for(int i = 1; i < 6; i++) {
        	long yearSec = (i*mul) * daySec;
        	long increase = ((yearSec/7) - (yearSec/13) + (yearSec/45));
        	
        	long total = increase + current;

        	System.out.println("Year " + (double) i + " Population: " + (total));
        }
        
        System.out.println("\n");
	}
	
	public static void main(String[] args) {
		
		FullAnswer answers = new FullAnswer();
		
		answers.reveal();
	}
	
}


