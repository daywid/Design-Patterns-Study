class EstudanteMestradoFactory implements EstudanteFactory {
    private char[] conceitos;

    public EstudanteMestradoFactory(char[] conceitos) {
        this.conceitos = conceitos;
    }

    @Override
    public Estudante criarEstudante() {
        return new EstudanteMestrado(conceitos);
    }
}