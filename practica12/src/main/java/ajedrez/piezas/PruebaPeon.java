package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

public class PruebaPeon {
    public static void main(String[] args) {

        Peon peon0 = new Peon(Color.NEGRO, new Posicion(1, 0));
        System.out.println(peon0.obtenerJugadasLegales());

        Peon peon1 = new Peon(Color.NEGRO, new Posicion(1, 7));
        System.out.println(peon1.obtenerJugadasLegales());

        Peon peon2 = new Peon(Color.NEGRO, new Posicion(1, 3));
        System.out.println(peon2.obtenerJugadasLegales());

        Peon peon3 = new Peon(Color.BLANCO, new Posicion(1, 0));
        System.out.println(peon3.obtenerJugadasLegales());

        Peon peon4 = new Peon(Color.BLANCO, new Posicion(1, 7));
        System.out.println(peon4.obtenerJugadasLegales());

        Peon peon5 = new Peon(Color.BLANCO, new Posicion(1, 3));
        System.out.println(peon5.obtenerJugadasLegales());
    }

}
