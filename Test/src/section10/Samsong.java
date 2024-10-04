package section10;

public class Samsong extends Computer { // 클래스 선언
	@Override
	void powerOn() {
		super.powerOn(); // 부모 클래스(Computer)의 powerOn() 메서드 호출
		System.out.println("아이 러브 삼송");
	}
}
