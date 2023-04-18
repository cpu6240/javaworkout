package chapter4;

public class ex4_4 {
	public static void main(String[] args) {
	
		int a;
		int b;
		
		for (a = 0; a < 4; a++) {
			for (b = 0; b <= a; b++) {
			System.out.printf("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int c;
		
		for (a = 0; a < 4; a++) {
			for (b = a; b <= 4-1; b++) {
				System.out.printf(" ");
			}
			
			for (c = 0; c <= (a*2); c++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for (a = 0; a < 4; a++) {
			for (b = a; b < 4; b++) {
				System.out.printf(" ");
			}
			
			for (c = 0; c <= (a*2); c++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
		for (a = 4-1; a > 0; a--) {
			for (b = a; b <= 4; b++) {
				System.out.printf(" ");
			}
			
			for (c = 0; c <= ((a-1) * 2); c++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
