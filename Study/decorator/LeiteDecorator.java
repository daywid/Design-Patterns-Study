package decorator;

public class LeiteDecorator extends ABSDecorator{

	public LeiteDecorator(iBebida bebida) {
		super(bebida);
	}

	@Override
	public String Descricao() {
		return bebida.Descricao() + " com leite ";
	}

	@Override
	public Double Preco() {
		return bebida.Preco() + 0.5;
	}

	
	
}
