package section13;

interface buttonClickListener {
	public void click();
}

public class AnonymousExample {
	// 버튼 객체를 내부 클래스로 선언
	public class Button {
		private buttonClickListener listener;

		// 리스터를 파라미터를 통해 받는다.
		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}

		// 버튼 클릭 가능
		public void click() {
			if (listener != null) {
				this.listener.click();
			}
		}
	}

	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();

		button.setButtonListener(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
			}
		});

		button.click();
	}
}
