package section03;

public class EX03_12 {
	public static void main(String[] args) {
		int x = 10;
		int y = 1;

		y += x; // y = y + x; -> 1 + 10 = 11
		System.out.println(y); // 11

		y *= x; // y = y * x; -> 11 * 10 = 110
		System.out.println(y); // 110

		y %= x;// y = y % x; -> 110 % 10 = 0
		System.out.println(y); // 0
	}
}
