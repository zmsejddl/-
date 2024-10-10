package section14;

public class EX14_04 {
	public static void main(String[] args) {
		int result = 0;

		try {
			result = 10 / 0;
			System.out.println("나누기 결과: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 할 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
