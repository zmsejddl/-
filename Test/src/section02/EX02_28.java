package section02;

public class EX02_28 {
	public static void main(String[] args) {

		// double형 -> float형 강제 형 변환(float형 범위 내 값)
		double d1 = 1.1234;
		float f1 = (float) d1;
		System.out.println("[double -> float] d1의 값: " + d1 + ", f1의 값: " + f1);

		// double형 -> float형 강제 형 변환(float형 최소값보다 작은 경우)
		double d2 = 1.0e-50;
		float f2 = (float) d2;
		System.out.println("[double -> float] d2의 값: " + d2 + ", f2의 값: " + f2);

		// double형 -> float형 강제 형 변환(float형 최대값보다 큰 경우)
		double d3 = 1.0e100;
		float f3 = (float) d3;
		System.out.println("[double -> float] d3의 값: " + d3 + ", f3의 값: " + f3);

		// double형과 float형의 정밀도 차이
		double d4 = 9.123456789;
		float f4 = (float) d4;
		System.out.println("[정밀도 차이] d4의 값: " + d4 + ", f4의 값: " + f4);
	}
}
