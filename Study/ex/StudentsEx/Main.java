public class Main {
    public static void main(String[] args) {
        EstudanteFactory factory1 = new EstudanteMedioFactory(7.5);
        EstudanteFactory factory2 = new EstudanteBachareladoFactory(new double[]{7.0, 8.0, 6.5});
        EstudanteFactory factory3 = new EstudanteMestradoFactory(new char[]{'A', 'B', 'C', 'D'});

        Estudante estudante1 = factory1.criarEstudante();
        Estudante estudante2 = factory2.criarEstudante();
        Estudante estudante3 = factory3.criarEstudante();

        System.out.println("Estudante 1 está aprovado? " + estudante1.estaAprovado());
        System.out.println("Estudante 2 está aprovado? " + estudante2.estaAprovado());
        System.out.println("Estudante 3 está aprovado? " + estudante3.estaAprovado());
    }
}