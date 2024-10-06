package section11;

public class ComputerRoom {
	Computer computer1;
	Computer computer2;

	void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
	}

	void allPowerOff() {
		computer1.powerOff();
		computer2.powerOff();
	}
}
