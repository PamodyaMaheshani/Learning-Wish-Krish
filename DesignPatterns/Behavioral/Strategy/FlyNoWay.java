package Strategy;

public class FlyNoWay implements IFlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I cannot fly");		
	}

}