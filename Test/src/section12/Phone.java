package section12;

public interface Phone {
	abstract void openingLogo();

	abstract void powerOn(); // <- 공통 구현부가 사라짐

	abstract void powerOff(); // <- 공통 구현부가 사라짐

	abstract void charge(); // <- 새로운 메서드 추가
}
