/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrestest;



public abstract class Ciclista {
    public final int identificador;
    public double tiempoAcumulado;

    public Ciclista(int identificador) {
        this.identificador = identificador;
        this.tiempoAcumulado = 0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(double tiempo) {
        this.tiempoAcumulado = tiempo;
    }

    protected abstract String imprimirTipo();
}
