package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private int State;
	private List<ABSObserver> observers = new ArrayList<>();
	
	public int getState() {
		return State;
	}
	
	public void setState(int state) {
		State = state;
		//Notificar
		this.notifyAllObservers();
	}
	
	public void notifyAllObservers() {
		for(ABSObserver observer : observers) {
			observer.Update();
		}
	}
	
	public void attach(ABSObserver observer) {
		this.observers.add(observer);
	}
	
	public void detach(ABSObserver observer) {
		this.observers.remove(observer);
	}
}
