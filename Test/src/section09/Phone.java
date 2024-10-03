package section09;

public class Phone { // 클래스 선언
	String brand;
	int series;
	String color = "검정색"; // 필드 기본값 초기화

	Phone(String b, int s, String c) {
		brand = b;
		series = s;
		color = c;
	}

	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
