package Bridge;

public class BridgeMain {

	public static void main(String[] args) {
		
		TV lgTv = new LGTV();
		TV sonyTv = new SonyTV();
		
		new RemoteControllerImplementation(lgTv).on();
		new RemoteControllerImplementation(lgTv).off();
		new RemoteControllerImplementation(lgTv).tune(10);
		new RemoteControllerImplementation(sonyTv).on();
		new RemoteControllerImplementation(sonyTv).off();
		new RemoteControllerImplementation(sonyTv).tune(20);
	}

}
