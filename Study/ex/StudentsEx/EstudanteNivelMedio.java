package ex.StudentsEx;

// Implementação da fábrica para Estudantes de nível médio
class EstudanteNivelMedioFactory implements EstudanteFactory {
    @Override
    public iEstudante criarEstudante() {
        return new EstudanteNivelMedio();
    }
}