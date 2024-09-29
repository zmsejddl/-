package section03;

public class EX03_06 {
	public static void main(String[] args) {
		int x = 1;

		System.out.println(x++); // x(=1)가 먼저 출력되고 난 후
		System.out.println(x); // x에 +1dl 더해져 2가 됨
		System.out.println(++x); // x(=2)에 +1이 더해져 3이 된 x가 출력
	}
}
