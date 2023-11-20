package Ecologico;

public class Edificio implements ImpactoEcologico{

    private String nombre;
    private double consumoCombustible;

    public Edificio(String nombre, double consumoCombustible) {
        this.nombre = nombre;
        this.consumoCombustible = consumoCombustible;
    }



    public double obtenerImpactoEcologico() {
       return consumoCombustible * 0.5;
    }

    public String toString() {
        return "Edificio: " + nombre;
    }
}