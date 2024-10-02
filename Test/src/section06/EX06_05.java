package section06;

public class EX06_05 {
	public static void main(String[] args) {
		// 단일 문자 배열에 단어와 숫자를 섞어 넣는다
		char[] cards = { '1', 'L', 'O', '2', 'V', '3', 'E' };
		String myWord = "";

		for (int i = 0; i < cards.length; i++) {
			// 문자는 아스키코드표에 의해 10진수 숫자로 대응된다.
			int word = cards[i];
			// 65~90 사이는 대문자 A~Z
			// 또는 97~122 사이는 소문자 a~z 이다.
			if ((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) {
				myWord += (char) word;
			}
		}

		System.out.println("단어: " + myWord);
	}
}
