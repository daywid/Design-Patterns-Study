package decorator;

public class Cafe implements iBebida {

	@Override
	public String Descricao() {
		
		return "Café";
	}

	@Override
	public Double Preco() {
		
		return 3.0;
	}

	
	
}
