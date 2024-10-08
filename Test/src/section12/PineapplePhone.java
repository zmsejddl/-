package section12;

public class PineapplePhone implements Phone {
	int batteryCapacity = 40;
	boolean isOn = false;

	@Override
	public void powerOn() {
		if (batteryCapacity > 30) {
			System.out.println("@@@Power On!!@@@\n");
			isOn = true;
		} else {
			System.out.println("Low Battery...");
		}
	}

	@Override
	public void powerOff() {
		System.out.println("@@@Power Off!!@@@\n");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		if (isOn) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void watchUtube() {
		if (batteryCapacity > 10) {
			System.out.println("--- watching Utube ---");
			batteryCapacity -= 10;
			System.out.println("battery is..." + batteryCapacity + "%\n");
		} else {
			System.out.println("Low battery...");
			powerOff();
		}
	}

	@Override
	public void charge() {
		if (batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("--- charging ---");
			batteryCapacity += 5;
			System.out.println("Charged..." + batteryCapacity + "%\n");
		} else {
			System.out.println("You don't have to charge...");
			System.out.println("It's enough..." + batteryCapacity + "%");
		}
	}

}
