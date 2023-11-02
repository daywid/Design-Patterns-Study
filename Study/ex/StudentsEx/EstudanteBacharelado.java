class EstudanteBacharelado implements Estudante {
    private double[] medias;

    public EstudanteBacharelado(double[] medias) {
        this.medias = medias;
    }

    @Override
    public boolean estaAprovado() {
        for (double mediaDisciplina : medias) {
            if (mediaDisciplina <= 6.0) {
                return false;
            }
        }
        return true;
    }
}