package observer;

public class ConcreteObserver extends ABSObserver{

	//Construtor
	public ConcreteObserver(Subject subject) {
		this.subject = subject;
	}
	
	
	@Override
	public void Update() {
		//logica que reage à mudança de estado no objeto observado
		System.out.println("O observador foi notificado. Novo estado do objeto:" + this.subject.getState());
	}

}
