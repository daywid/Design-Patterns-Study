package decorator;

public class AcucarDecorator extends ABSDecorator{

	public AcucarDecorator(iBebida bebida) {
		super(bebida);
	}

	@Override
	public String Descricao() {

		return bebida.Descricao() + " com açucar "; 
	}

	@Override
	public Double Preco() {
		return bebida.Preco() + 0.1;
	}

}
