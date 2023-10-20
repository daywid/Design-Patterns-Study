package observer;

public class ConcreteObserver extends ABSObserver{

	//Construtor
	public ConcreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	
	@Override
	public void Update() {
		//logica que reage à mudança de estado no objeto observado
		System.out.println("O observador foi notificado. Novo estado do objeto:" + this.subject.getState());
	}

}
