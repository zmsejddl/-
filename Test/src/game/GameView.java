package game;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameView extends JFrame {
	JLabel la_notice = new JLabel("숫자 3개를 입력하세요.");

	JTextField tf_num1 = new JTextField(1);
	JTextField tf_num2 = new JTextField(1);
	JTextField tf_num3 = new JTextField(1);

	JButton btn_submit = new JButton("제출");
	JTextArea ta_result = new JTextArea("<결과 안내>\n");

	JButton btn_exit = new JButton("게임 종료");

	public GameView() {
		setTitle("게임 실행");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);

		// 창 가로, 창 세로, 폭, 높이
		la_notice.setBounds(240, 10, 300, 30);

		tf_num1.setBounds(200, 40, 50, 50);
		tf_num2.setBounds(270, 40, 50, 50);
		tf_num3.setBounds(340, 40, 50, 50);

		btn_submit.setBounds(200, 90, 190, 30);
		ta_result.setBounds(200, 130, 200, 200);
		btn_exit.setBounds(470, 10, 80, 30);
		add(la_notice);
		add(tf_num1);
		add(tf_num2);
		add(tf_num3);
		add(btn_submit);
		add(ta_result);
		add(btn_exit);
		setSize(600, 400);
		setVisible(true);
	}

	public void addResult(String result) {
		ta_result.append(result);
	}

	// 게임이 종료되면: 텍스트 필드, 버튼 비활성화
	public void stop() {
		tf_num1.setEnabled(false);
		tf_num2.setEnabled(false);
		tf_num3.setEnabled(false);
		btn_submit.setEnabled(false);
	}
}
