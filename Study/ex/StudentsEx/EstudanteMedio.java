class EstudanteMedio implements Estudante {
    private double media;

    public EstudanteMedio(double media) {
        this.media = media;
    }

    @Override
    public boolean estaAprovado() {
        return media > 7.0;
    }
}