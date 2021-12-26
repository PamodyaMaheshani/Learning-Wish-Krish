package Strategy;

public class RealDuck extends Duck{
	
	public RealDuck() {
		iQuackBehaviour = new Quack();
		iFlyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a real duck ..");
		
	}	

}