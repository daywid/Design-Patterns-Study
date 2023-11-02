class EstudanteMedioFactory implements EstudanteFactory {
    private double media;

    public EstudanteMedioFactory(double media) {
        this.media = media;
    }

    @Override
    public Estudante criarEstudante() {
        return new EstudanteMedio(media);
    }
}