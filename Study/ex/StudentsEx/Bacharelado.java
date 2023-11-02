package ex.StudentsEx;

public class Bacharelado extends Disciplina{
    private double media;

    public Bacharelado(double media){
        this.media = media;
    }

    @Override
    boolean estaAprovado() {
    return media > 6.0;    
    }
    
}
