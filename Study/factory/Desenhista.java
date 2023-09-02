package factory;

public class Desenhista {

	//public enum Figura {CIRCULO,RETANGULO}
	
	//public void desenhe(TipoFigura Figura) {
	//	System.out.println(Figura);
	//}
	
	public void desenhe(TipoFigura Figura) {
		
		switch (Figura) {
		
		case CIRCULO: {
			System.out.println(Figura);
		}
		case RETANGULO: {
			System.out.println(Figura);
		}
		default:
			throw new IllegalArgumentException("Unexpected");
		
		}
			
	}
}
