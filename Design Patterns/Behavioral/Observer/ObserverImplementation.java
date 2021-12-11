package Observer;

public class ObserverImplementation implements Observer{
	
	private String id;
	private String state;
	
	public ObserverImplementation(String id) {
		this.id = id;
	}
	
	@Override
	public void update (Subject subject) {
		this.state = subject.getState();
		System.out.println("Observer recieved state change of subject ID is = " + this.id + " Status : " + this.state);
	}

}
