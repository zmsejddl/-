import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingDemo extends JFrame {

	JTextField tf_num1 = new JTextField(); // 텍스트 입력 칸 생성
	JTextField tf_num2 = new JTextField();

	SwingDemo() { // 생성자
		setSize(300, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tf_num1.setBounds(50, 50, 40, 40); // 컴포넌트 위치, 크기 설정
		// setBounds(창의 왼쪽에서 50, 위쪽에서 50, 필드 폭 40, 높이 40)
		tf_num2.setBounds(100, 50, 40, 40);

		add(tf_num1);
		add(tf_num2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo();
	}
}
