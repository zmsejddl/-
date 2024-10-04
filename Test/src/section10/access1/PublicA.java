package section10.access1;

public class PublicA { // 클래스 선언
	DefaultC dc = new DefaultC(); // 같은 패키지이기 때문에 객체 생성 가능

	void methodA() {
		dc.variableC = 20; // public으로 선언된 필드도 객체를 통해 접근 가능
	}
}
