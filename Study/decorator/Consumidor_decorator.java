package decorator;

public class Consumidor_decorator {

	public static void main(String[] args) {
		
		//Criar o componente concreto
		iBebida cafe = new Cafe();
		System.out.println("pedido 1: " + cafe.Descricao() + " " + cafe.Preco());
		
		cafe = new AcucarDecorator(cafe);
		System.out.println("pedido 2: " + cafe.Descricao() + " " + cafe.Preco());
		
		cafe = new LeiteDecorator(cafe);
		System.out.println("pedido 3: " + cafe.Descricao() + " " + cafe.Preco());
		
		
	}

}
