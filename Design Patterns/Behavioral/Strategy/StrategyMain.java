package Strategy;

public class StrategyMain {

	public static void main(String[] args) {
		
		System.out.println("Start Real Duck");
		Duck real = new RealDuck();
		real.performFly();
		real.performQuack();
		
		System.out.println("\nStart Model Duck");
		Duck model = new ModelDuck();
		
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPower());
		model.performFly();
		
		model.performQuack();
		model.setQuackBehaviour(new ModelQuack());
		model.performQuack();
	}

}
