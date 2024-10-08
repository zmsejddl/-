package section12;

public class BluetoothMIC implements Microphone, Speaker {
	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래를 부릅니다.");
	}

	@Override
	public void music() {
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
	}
}
