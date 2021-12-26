package Strategy;

public abstract class Duck {
	
	IFlyBehaviour iFlyBehaviour;
	IQuackBehaviour iQuackBehaviour;
	
	public abstract void display();
	
	public void performFly() {
		iFlyBehaviour.fly();
	}
	
	public void performQuack() {
		iQuackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float even decoy.. ");
	}
	
	public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
		this.iFlyBehaviour = flyBehaviour;
	}
	
	public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
		this.iQuackBehaviour = quackBehaviour;
	}

}
