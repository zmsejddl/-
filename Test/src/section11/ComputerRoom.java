package section11;

public class ComputerRoom {
	Samsong computer1;
	Samsong computer2;

	void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
	}

	void allPowerOff() {
		computer1.powerOff();
		computer2.powerOff();
	}
}
