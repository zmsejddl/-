package section13;

public class LocalClassExample {
	private int speed = 10;

	public void getUnit(String unitName) {
		unitName = unitName + " 님";
		class Unit {
			public void move() {
				// unitName에서 오류 발생
				System.out.println(unitName + "이 " + speed + " 속도로 이동합니다.");
			}
		}
		Unit unit = new Unit();
		unit.move();
	}

	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");
	}
}
