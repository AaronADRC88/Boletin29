package boletin29;

public class Metodos {

    public Metodos() {
    }

    public static String creaMatricula() {
        String matricula = "";
        int[] nMat = {4};
        int i;
        for (i = 0; i < nMat.length; i++) {
            nMat[i] += (int) (Math.random() * 9);
            break;
        }
        matricula += String.valueOf(nMat[i]);
        matricula += String.valueOf(nMat[i]);
        matricula += String.valueOf(nMat[i]);
        matricula += String.valueOf(nMat[i]);
        return matricula;
    }

    public static float calculaPrezoVel() {
        float prezo = ((Formulario.velero.getEslora() * 10) + (Formulario.velero.getnMastiles())) * Formulario.velero.getDias();

        return prezo;
    }

    public static float calculaPrezoDep() {
        float prezo = ((Formulario.depor.getEslora() * 10) + (Formulario.depor.getPotencia())) * Formulario.depor.getDias();
        return prezo;
    }

    public static float calculaPrezoIat() {
        float prezo = ((Formulario.iate.getEslora() * 10) + (Formulario.iate.getPotencia()) + (Formulario.iate.getnCamarotes())) * Formulario.iate.getDias();
        return prezo;
    }

}
