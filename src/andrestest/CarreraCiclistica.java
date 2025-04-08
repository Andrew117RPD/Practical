/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrestest;

public class CarreraCiclistica {
    public static void main(String[] args) {
        Velocista v1 = new Velocista(101, 65, 45);
        Escalador e1 = new Escalador(201, 10.5f, 30f);
        Contrarrelojista c1 = new Contrarrelojista(301, 50);

        v1.setTiempoAcumulado(120);
        e1.setTiempoAcumulado(130);
        c1.setTiempoAcumulado(140);

        Equipo equipo = new Equipo("Movistar", "España");
        equipo.agregarCiclista(v1);
        equipo.agregarCiclista(e1);
        equipo.agregarCiclista(c1);

        equipo.sumarTiempoEquipo();
        equipo.mostrarEquipo();
    }
}

