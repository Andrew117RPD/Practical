/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrestest;

public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadSprint;

    public Velocista(int identificador, double potenciaPromedio, double velocidadSprint) {
        super(identificador);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;
    }

    @Override
    protected String imprimirTipo() {
        return "Soy un velocista.";
    }
}
