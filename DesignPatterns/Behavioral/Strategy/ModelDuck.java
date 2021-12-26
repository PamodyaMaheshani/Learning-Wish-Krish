package Strategy;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		iQuackBehaviour = new Quack();
		iFlyBehaviour = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am a model duck ..");
		
	}	

}
