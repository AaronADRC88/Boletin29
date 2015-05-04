
package boletin29;

public abstract class Barco {
    private String matricula;
    private int eslora;
    private int dias;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int dias) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.dias = dias;
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
