package ajedrez.piezas;

public class Posicion {
    private int fila;
    private int columna;

    public Posicion(int fila, int columna){
        this.fila = fila;
        this.columna = columna;

    }

    public int obtenerFila(){
        return fila;
    }

    public int obtenerColumna(){
        return columna;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Posicion otra = (Posicion) obj;
        return fila == otra.fila && columna == otra.columna;
    }
    public String toString(){
        String devolver = new String("");
        devolver = "la fila es:"+ this.fila +"la columna es:"+ this.columna;
        return devolver;
    }
}