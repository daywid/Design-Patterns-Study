package factory;

public class Consumidor {

	public static void main(String[] args) {
		
		//Criar um circulo usando a fabrica de circulos.
		IFabricaFormas circuloFactory = new FabricaCirculo();
		IForma bolota = circuloFactory.criarforma();
		bolota.desenhar();
		
		//Criar um retangulo usando a fabrica de retangulos.
		IFabricaFormas retanguloFactory = new FabricaRetangulo();
		IForma caixote = retanguloFactory.criarforma();
		caixote.desenhar();

	}

}
