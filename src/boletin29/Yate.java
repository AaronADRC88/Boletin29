package boletin29;

public class Yate extends Barco {

    private int potencia, nCamarotes;

    public Yate(int potencia, int nCamarotes, String matricula, int eslora, int dias) {
        super(matricula, eslora, dias);
        this.potencia = potencia;
        this.nCamarotes = nCamarotes;
    }

    public Yate(int potencia, int nCamarotes) {
        this.potencia = potencia;
        this.nCamarotes = nCamarotes;
    }

    public Yate() {
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getnCamarotes() {
        return nCamarotes;
    }

    public void setnCamarotes(int nCamarotes) {
        this.nCamarotes = nCamarotes;
    }

    @Override
    public String toString() {
        return "Yate\nmatricula " + this.getMatricula() + "\neslora " + this.getEslora() + "\ndias " + this.getDias() + "\npotencia=" + potencia + "\nCamarotes=" + nCamarotes;
    }

}
