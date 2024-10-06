package section11;

public class Bike {
	String riderName;
	int wheel = 2;

	Bike(String riderName) {
		this.riderName = riderName;
	}

	void info() {
		System.out.println(riderName + "의 자전거는 " + wheel + "발 자전거입니다.");
	}

	void ride() {
		System.out.println("씽씽");
	}
}
