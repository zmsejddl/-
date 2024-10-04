package section10.access2;

import section10.access1.PublicA; //다른 패키지의 클래스를 사용하기 위한 import

public class PublicB { // 클래스 선언
	public static void main(String[] args) {
		PublicA a = new PublicA(10);
		a.printA();
	}
}
