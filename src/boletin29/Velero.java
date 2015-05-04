package boletin29;

public class Velero extends Barco {

    private int nMastiles;

    public Velero() {
    }

    public Velero(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    public Velero(int nMastiles, String matricula, int eslora, int dias) {
        super(matricula, eslora, dias);
        this.nMastiles = nMastiles;
    }

    public int getnMastiles() {
        return nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    @Override
    public String toString() {
        return "Velero" + "\nmatricula " + super.getMatricula() + "\neslora " + super.getEslora() + "\ndias " + super.getDias() + "\nnumero de mastiles=" + nMastiles ;
    }

}
