package factory;

public class Teste1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String classe_para_instanciar;
		classe_para_instanciar = "factory.Retangulo";
		IForma x = (IForma) Class.forName(classe_para_instanciar).newInstance();
		x.desenhar();
 
	}

}
