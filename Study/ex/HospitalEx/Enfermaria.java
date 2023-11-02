package ex.HospitalEx;

public class Enfermaria implements Observer {
    @Override
    public void update(Paciente paciente) {
        System.out.println("Enfermaria: Novo paciente admitido na enfermaria - " + paciente.getNome());
    }
}