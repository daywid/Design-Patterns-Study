package ex.HospitalEx;

public class UTI implements Observer {
    @Override
    public void update(Paciente paciente) {
        System.out.println("UTI: Novo paciente admitido na UTI - " + paciente.getNome());
    }
}