package ajedrez.piezas;

import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

/**
 * @author Berenice Calvario Gonzalez
 */

public class Dama extends Pieza {
    public Dama(Color color, Posicion posicion) {
        super(color, posicion);
    }

    @Override
    public List<Posicion> obtenerJugadasLegales() {
        LinkedList<Posicion> jugadas = new LinkedList<>();
        Tablero tab = Tablero.obtenerInstancia();
        int fila = obtenerPosicion().obtenerFila(), columna = obtenerPosicion().obtenerColumna();

        // Arriba
        for (int i = fila - 1; i >= -1; i--) { // Una dama se puede comer a la otra dama?
            Pieza p = tab.obtenerPieza(i + 1, columna);
            if (p == null) {
                jugadas.add(new Posicion(i + 1, columna));
            } else {
                if (p.obtenerColor() != obtenerColor()) {
                    jugadas.add(new Posicion(i + 1, columna));

                }
            }
        }

        // Abajo
        for (int i = fila + 1; i <= 8; i++) {
            Pieza p = tab.obtenerPieza(i - 1, columna);
            if (p == null) {
                jugadas.add(new Posicion(i - 1, columna));
            } else {
                if (p.obtenerColor() != obtenerColor()) {
                    jugadas.add(new Posicion(i - 1, columna));
                }
            }
        }

        // Derecha
        for (int i = columna + 1; i <= 8; i++) {
            Pieza p = tab.obtenerPieza(fila, i - 1);
            if (p == null) {
                jugadas.add(new Posicion(fila, i - 1));
            } else {
                if (p.obtenerColor() != obtenerColor()) {
                    jugadas.add(new Posicion(fila, i - 1));
                }
            }
        }

        // Izquierda
        for (int i = columna - 1; i >= -1; i--) {
            Pieza p = tab.obtenerPieza(fila, i + 1);
            if (p == null) {
                jugadas.add(new Posicion(fila, i + 1));
            } else {
                if (p.obtenerColor() != obtenerColor()) {
                    jugadas.add(new Posicion(fila, i + 1));
                }
            }
        }

        // Diagonal superior derecha
        for (int i = fila - 1, j = columna + 1; i >= 0 && j <= 7; i--, j++) {
            Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else {
                if (p.obtenerColor() != obtenerColor()) {
                    jugadas.add(new Posicion(i, j));
                }
            }
        }

        // Diagonal inferior derecha
        for (int i = fila + 1, j = columna + 1; i <= 7 && j <= 7; i++, j++) {
            Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else {
                if (p.obtenerColor() != obtenerColor()) {
                    jugadas.add(new Posicion(i, j));
                }
            }
        }

        // Diagonal superior izquierda
        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) {
            Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else {
                if (p.obtenerColor() != obtenerColor()) {
                    jugadas.add(new Posicion(i, j));
                }
            }
        }
        // Diagonal inferior izquierda
        for (int i = fila + 1, j = columna - 1; i <= 7 && j >= 0; i++, j--) {
            Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else {
                if (p.obtenerColor() != obtenerColor()) {
                    jugadas.add(new Posicion(i, j));
                }
            }
        }

        return jugadas;
    }
}
