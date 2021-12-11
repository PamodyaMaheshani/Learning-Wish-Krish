package Observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		Observer observer1 = new ObserverImplementation("Observer 1");
		Observer observer2 = new ObserverImplementation("Observer 2");
		Observer observer3 = new ObserverImplementation("Observer 3");
		Observer observer4 = new ObserverImplementation("Observer 4");
		
		Subject subject = new SubjectImplementation();
		
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);
		subject.registerObserver(observer3);
		subject.registerObserver(observer4);
		
		subject.setState("Status modified");
	}

}
