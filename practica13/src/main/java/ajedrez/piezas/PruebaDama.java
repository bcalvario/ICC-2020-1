package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;
import ajedrez.Tablero;

public class PruebaDama {
	public static void main(String[] args) {
		Tablero tab = Tablero.obtenerInstancia();
		Pieza p = tab.obtenerPieza(0, 3);
		System.out.println(p.obtenerJugadasLegales());

		System.out.println(" ");

		Pieza p2 = tab.obtenerPieza(7, 3);
		System.out.println(p2.obtenerJugadasLegales());

	}

}