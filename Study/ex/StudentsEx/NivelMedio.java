package ex.StudentsEx;

public class NivelMedio extends Disciplina{

    private double media;

    @Override
    boolean estaAprovado() {
        return media >7.0;    
    }
    
}
