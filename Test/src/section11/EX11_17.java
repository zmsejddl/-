package section11;

class Animal {
	void cry() { // <- 텅 빈 메서드

	}
}

class Pig extends Animal {
	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
}

class Cow extends Animal {
	@Override
	void cry() {
		System.out.println("음메");
	}
}

class Farm {
	void sound(Animal animal) {
		animal.cry(); // <- 매개변수 참조 객체의 오버라이딩된 메서드를 호출
	}
}

public class EX11_17 {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}
}
