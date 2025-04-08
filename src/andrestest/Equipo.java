/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrestest;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private static double sumaTiempos;
    private String pais;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
        sumaTiempos = 0;
    }

    public void agregarCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public void sumarTiempoEquipo() {
        for (Ciclista c : ciclistas) {
            sumaTiempos += c.getTiempoAcumulado();
        }
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre + " | País: " + pais);
        for (Ciclista c : ciclistas) {
            System.out.println("Ciclista ID: " + c.getIdentificador() + " - " + c.imprimirTipo());
        }
        System.out.println("Tiempo total del equipo: " + sumaTiempos + " minutos");
    }
}
