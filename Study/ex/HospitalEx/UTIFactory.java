package ex.HospitalEx;

public class UTIFactory implements ObserverFactory {
    @Override
    public Observer createObserver() {
        return new UTI();
    }
}