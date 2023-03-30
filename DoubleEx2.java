package chapter2;

public class DoubleEx2 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		/* 1에 0.1을 10000번 더해서 1001이 나와야 하지만
		부동 소수점 방식의 오류로 1001.000000000159의 값이 나온다. */

		System.out.println(dnum);
	}
}
