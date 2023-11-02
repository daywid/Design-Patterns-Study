package ex.HospitalEx;

public class EnfermariaFactory implements ObserverFactory {
    @Override
    public Observer createObserver() {
        return new Enfermaria();
    }
}