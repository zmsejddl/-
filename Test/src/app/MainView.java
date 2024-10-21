package app;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainView extends JFrame {
	JButton btn_game = new JButton("게임 시작");
	JButton btn_rank = new JButton("랭킹 확인");

	public MainView() {
		// 레이아웃 설정
		setLayout(new FlowLayout());

		add(btn_game);
		add(btn_rank);
		setSize(600, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
