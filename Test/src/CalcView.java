import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcView extends JFrame {
	JTextField tf_num1 = new JTextField();
	JTextField tf_num2 = new JTextField();

	JButton btn_plus = new JButton("더하기");

	JLabel la_result = new JLabel("결과 출력");

	CalcView() { // 생성자
		setSize(300, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tf_num1.setBounds(50, 50, 40, 40);
		tf_num2.setBounds(100, 50, 40, 40);
		btn_plus.setBounds(150, 50, 80, 40);
		la_result.setBounds(50, 100, 200, 40);

		add(tf_num1);
		add(tf_num2);
		add(btn_plus);
		add(la_result);

		setVisible(true);
	}
}
