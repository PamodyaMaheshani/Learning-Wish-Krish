package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubjectImplementation implements Subject{
	
	private String state;
	List<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);		
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);	
	}

	@Override
	public void setState(String state) {
		this.state = state;
		notifyObservers();		
	}

	@Override
	public String getState() {
		return this.state;
	}
	

	private void notifyObservers() {
		Iterator<Observer> iterator = observerList.iterator();
		while (iterator.hasNext()) {
			Observer observer = (Observer)iterator.next();
			observer.update(this);
		}
		
	}	

}
