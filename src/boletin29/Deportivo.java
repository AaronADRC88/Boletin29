package boletin29;

public class Deportivo extends Barco {

    private int potencia;

    public Deportivo() {
    }

    public Deportivo(int potencia) {
        this.potencia = potencia;
    }

    public Deportivo(int potencia, String matricula, int eslora, int dias) {
        super(matricula, eslora, dias);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Deportivo" + "\nmatricula " + super.getMatricula() + "\neslora " + super.getEslora() + "\ndias " + super.getDias() + "\npotencia=" + potencia;
    }

}
