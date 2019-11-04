package ajedrez.piezas;

import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

public class Dama extends Pieza {
    public Dama(Color color, Posicion posicion) {
        super(color, posicion);
    }

    Tablero tab = Tablero.obtenerInstancia();

    @Override
    public List<Posicion> obtenerJugadasLegales() {
        LinkedList<Posicion> jugadas = new LinkedList<>();
        int fila = obtenerPosicion().obtenerFila();
        int columna = obtenerPosicion().obtenerFila();

        // Arriba
        Pieza p = null;
        for (int i = fila - 1; i >= -1; i--) {
            if (p == null) {
                jugadas.add(new Posicion(i + 1, fila));
            }
        }

        // Abajo
        for (int i = fila + 1; i <= 7; i++) {
            if (p == null) {
                jugadas.add(new Posicion(fila, i));
            }
        }

        // Derecha
        for (int i = columna + 1; i <= 7; i++) {
            if (p == null) {
                jugadas.add(new Posicion(i, columna));
            }
        }

        // Izquierda
        for (int i = columna - 1; i >= 0; i--) {
            if (p == null) {
                jugadas.add(new Posicion(i, columna));
            }
        }

        // Diagonal arriba derecha
        for (int i = fila - 1, j = columna + 1; i >= 0 && j <= 7; i--, j++) {
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            }
        }

        // Diagonal abajo derecha
        for (int i = fila + 1, j = columna + 1; i <= 7 && j <= 7; i++, j++) {
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            }
        }

        // Diagonal arriba izquierda
        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) {
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            }
        }

        // Diagonal abajo izquierda
        for (int i = fila + 1, j = columna - 1; i <= 7 && j >= 0; i++, j--) {
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            }
        }
        return jugadas;

    }
}