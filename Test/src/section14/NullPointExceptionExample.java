package section14;

public class NullPointExceptionExample {
	public static void main(String[] args) {

		// 배열을 변수를 만들기만 하고 선언하지 않음
		String[] strArray = null;

		// 생성되지 않은 배열을 출력하려고 함
		System.out.println("strArray[0] = " + strArray[0]);
	}
}
