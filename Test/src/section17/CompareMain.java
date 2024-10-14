package section17;

public class CompareMain {
	public static void main(String[] args) {
		// 인터페이스 객체 선언 시 람다식을 이용해 함수를 구현
		CompareNumber compare = (num01, num02) -> {
			return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
		};

		int num01 = 10;
		int num02 = 20;
		int result = compare.compareTo(num01, num02);

		if (result > 0) {
			System.out.println("num01이 num02 보다 크다");
		} else if (result < 0) {
			System.out.println("num01이 num02 보다 작다");
		} else {
			System.out.println("num01과 num02 같다");
		}
	}
}
