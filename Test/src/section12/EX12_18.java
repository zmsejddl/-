package section12;

public class EX12_18 {
	public static void main(String[] args) {
		BluetoothMIC bm = new BluetoothMIC();

		bm.music();
		bm.sing();
		Microphone m = bm;
		Speaker s = bm;
	}
}
