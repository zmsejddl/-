package section11;

class Animal {

}

class Pig extends Animal {

}

class Cow extends Animal {

}

class Farm {
	void sound(Animal animal) {
		if (animal instanceof Pig) {
			System.out.println("꿀꿀");
		} else {
			System.out.println("음메");
		}
	}
}

public class EX11_15 {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}
}
