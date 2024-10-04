package section10;

public class EX10_09 { // 클래스 선언
	public static void main(String[] args) {
		Samsong s = new Samsong();
		s.powerOn(); // Samsong 클래스에서 오버라이딩된 메서드가 호출
		s.powerOff(); // Computer 클래스의 메서드가 호출

		Computer c = new Computer();
		c.powerOn(); // Computer 클래스의 메서드가 호출
		c.powerOff(); // Computer 클래스의 메서드가 호출
	}
}
