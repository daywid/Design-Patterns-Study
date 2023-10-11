package GerenciamentoInventario;

public class ElectronicsFactory implements ProductFactory {
    @Override
    public Product createProductA() {
        return new Notebook();
    }

    @Override
    public Product createProductB(){
        return new Smartphone();
    }
}