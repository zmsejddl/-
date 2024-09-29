package section02;

public class EX02_27 {
	public static void main(String[] args) {
		// int형 -> byte형 강제 형 변환(값이 작을 경우)
		int i = 10;
		byte b = (byte) i;
		System.out.println("[int -> byte] i의 값: " + i + " b의 값: " + b);

		// int형 -> byte형 강제 형 변환(값이 큰 경우)
		int j = 1000;
		byte c = (byte) j; // 강제 형 변환을 하지 않으면 에러 발생.
		System.out.println("[int -> byte] j의 값: " + j + " c의 값: " + c);
	}
}
