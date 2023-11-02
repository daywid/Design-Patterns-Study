package ex.StudentsEx;

public class Mestrado extends Disciplina{
    private char conceito;

    public Mestrado(char conceito) {
        this.conceito = conceito;
    }

    @Override
    boolean estaAprovado() {
        return conceito == 'A' || conceito == 'B' || conceito == 'C';
        }

    
}
