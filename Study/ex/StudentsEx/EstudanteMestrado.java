class EstudanteMestrado implements Estudante {
    private char[] conceitos;

    public EstudanteMestrado(char[] conceitos) {
        this.conceitos = conceitos;
    }

    @Override
    public boolean estaAprovado() {
        for (char conceito : conceitos) {
            if (conceito == 'D') {
                return false;
            }
        }
        return true;
    }
}