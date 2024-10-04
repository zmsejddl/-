package section10.access1;

public class PublicA { // 클래스 선언
	public int a;

	private PublicA(int a) {
		this.a = a;
	}

	public void printA() {
		System.out.println("PublicA클래스의 printA() 메서드입니다.");
	}
}
