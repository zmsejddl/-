import javax.swing.JFrame;

//JFrame을 상속받아서 SwingDemo로 창을 구현합니다.
public class SwingDemo extends JFrame {

	SwingDemo() { // 생성자
		// 창 크기(가로, 세로) 설정
		setSize(300, 200);

		// 프레임을 닫았을 때 프로세스까지 제거되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임이 화면에 보이도록 설정
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo();
	}
}
