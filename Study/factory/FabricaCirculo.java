package factory;

public class FabricaCirculo implements IFabricaFormas{

	@Override
	public IForma criarforma() {
		
		return new Circulo();
	}

}
