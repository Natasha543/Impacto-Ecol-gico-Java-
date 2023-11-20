package Ecologico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Utm FCI", 1000);
        Auto auto = new Auto("Mazda", 150);
        Bicicleta bicicleta = new Bicicleta("Tipo 1", 10);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto);
            System.out.println("Impacto ecológico: " + objeto.obtenerImpactoEcologico());
            System.out.println();
        }
    }
}