package Ecologico;
public class Bicicleta implements ImpactoEcologico {
    private String tipo;
    private int produccionCO2;

    public Bicicleta(String tipo, int produccionCO2) {
        this.tipo = tipo;
        this.produccionCO2 = produccionCO2;
    }

    public double obtenerImpactoEcologico() {
        return produccionCO2 * 0;
    }

    public String toString() {
        return "Bicicleta: " + tipo;
    }
}