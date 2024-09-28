package section02;

public class EX02_11 {
	public static void main(String[] args) {
		byte num1 = 20;
		// byte num5 = 128; 이 구문은 에러가 발생합니다. 이유가 무엇일까요?
		// byte가 저장할 수 있는 숫자의 범위(-128~127)를 벗어나기 때문에 저장할 수 없습니다.
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
