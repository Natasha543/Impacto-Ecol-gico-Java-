package Ecologico;

public class Auto implements ImpactoEcologico {
    private String modelo;
    private double emisionesCO2;

    public Auto(String modelo, double emisionesCO2) {
        this.modelo = modelo;
        this.emisionesCO2 = emisionesCO2;
    }

    public double obtenerImpactoEcologico() {
        return emisionesCO2 * 0.8;
    }

    public String toString() {
        return "Auto: " + modelo;
    }
}