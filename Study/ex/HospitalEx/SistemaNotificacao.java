package ex.HospitalEx;

import java.util.ArrayList;
import java.util.List;

// Classe para o sistema de notificação de pacientes
public class SistemaNotificacao {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers(Paciente paciente, boolean isEmergencia) {
        for (Observer observer : observers) {
            if (isEmergencia && observer instanceof UTI) {
                observer.update(paciente);
            } else if (!isEmergencia && observer instanceof Enfermaria) {
                observer.update(paciente);
            }
        }
    }
}
