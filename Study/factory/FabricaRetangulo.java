package factory;

public class FabricaRetangulo implements IFabricaFormas{

	@Override
	public IForma criarforma() {
	
		return new Retangulo();
	}

}
