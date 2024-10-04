package section10.access2;

import section10.access1.*;

public class NotChild { // 클래스 선언
	void accessTest() {
		Parent p2 = new Parent();
		// p2.accessProtected(); 에러:
		// The method accessProtected() from the type Parent is not visible
	}
}
