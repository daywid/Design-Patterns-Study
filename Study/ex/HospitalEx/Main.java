package ex.HospitalEx;

public class Main {
    public static void main(String[] args) {
        SistemaNotificacao sistema = new SistemaNotificacao();
        
        ObserverFactory enfermariaFactory = new EnfermariaFactory();
        ObserverFactory utiFactory = new UTIFactory();
        
        sistema.adicionarObserver(enfermariaFactory.createObserver());
        sistema.adicionarObserver(utiFactory.createObserver());
        
        Paciente paciente1 = new Paciente("Paciente 1");
        Paciente paciente2 = new Paciente("Paciente 2");
        
        // Atendimento de emergência (notificar UTI)
        sistema.notificarObservers(paciente1, true);
        
        // Atendimento convencional (notificar enfermaria)
        sistema.notificarObservers(paciente2, false);
    }
}
