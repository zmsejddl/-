package section05;

public class EX05_03 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + "=" + (i * j) + "\t");
			}

			System.out.println(); // 단 별로 줄바꿈
		}
	}
}
