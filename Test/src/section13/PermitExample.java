package section13;

public class PermitExample {
	private class InClass {
		public void print() {
			System.out.println("접근을 private로 제한합니다.");
		}
	}

	public InClass getInClass() {
		// 인스턴스 클래스를 선언하여 리턴
		return new InClass();
	}

	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		permit.getInClass().print();
	}
}
