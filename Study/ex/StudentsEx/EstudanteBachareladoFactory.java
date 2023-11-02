class EstudanteBachareladoFactory implements EstudanteFactory {
    private double[] medias;

    public EstudanteBachareladoFactory(double[] medias) {
        this.medias = medias;
    }

    @Override
    public Estudante criarEstudante() {
        return new EstudanteBacharelado(medias);
    }
}