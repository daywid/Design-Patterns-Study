package observer;

public class Consumidor_do_observer {

	public static void main(String[] args) {
	
		Subject observado = new Subject();
		ABSObserver observador1 = new ConcreteObserver(observado);
		ABSObserver observador2 = new ConcreteObserver(observado);
		observado.setState(10);
		
		
		
		
		
		
		
		
		
		
	}

}
