package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 *
 */
public class Matriz {

    private double[][] datos;
    private int m, n;

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el numero de filas
     * @param n el numero de columnas
     */
    public Matriz(int m, int n) {
        if (m > 0 && n > 0) {
        this.m = m;
        this.n = n;
        datos = new double[m][n];
        }
    }

    /**
     * Regresa la entrada en la i-esima fila y j-esima columna de esta matriz.
     *
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
        return datos[i][j];
    }

    /**
     * Inserta el dato dado en la i-esima fila y j-esima columna de esta matriz.
     *
     * @param dato el numero que se insertara en esta matriz
     * @param i    la fila donde se insertara <code>dato</code>
     * @param j    la columna donde se insertara <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j) {
        datos[i][j] = dato;             
    }

    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumara esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
    public Matriz sumar(Matriz otra) {
        if (m != otra.m || n != otra.n) return null;

        Matriz resultadoMatriz = new Matriz(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultadoMatriz.datos[i][j] = datos[i][j] + otra.datos[i][j]; 
            }
        }
        return resultadoMatriz;
    }

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c) {
        Matriz resultadoMatriz = new Matriz(m,n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultadoMatriz.datos[i][j] = c * this.datos[i][j]; 
            }
        }
        return resultadoMatriz;
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-esima fila de esta matriz
     */
    public Matriz eliminarFila(int k) {
        Matriz resultadoMatriz = new Matriz(m - 1, n);
        int filaAEliminar = 0;
        
        for(int i = 0; i < m; i++) {
            if(i != k) {
                for(int j = 0; j < n; j++) {
                    resultadoMatriz.asignarEntrada(obtenerEntrada(i, j), filaAEliminar, j);
                }
                filaAEliminar++;
            }
        }
        return resultadoMatriz;
    }

    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * 
     * @return una matriz nueva que resulta de eliminar la k-esima columna de esta matriz
     */
    public Matriz eliminarColumna(int k) {
        Matriz resultadoMatriz = new Matriz(m, n-1);
        for(int i = 0; i < m; i++) {
            int columnaAEliminar = 0;
            for(int j = 0; j < n; j++) {
                if(j != k) {
                    resultadoMatriz.asignarEntrada(obtenerEntrada(i, j), i, columnaAEliminar);
                    columnaAEliminar++;
                }
            }
        }
        return resultadoMatriz;
    }

    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
    public double determinante() {
        if (n != m) return 0.0;

        if (n == 2) return datos[0][0] * datos[1][1] - datos[0][1] * datos[1][0];

        int signo = 1;
        double determinante = 0;
        
        for (int i = 0; i < n; i++) {
            Matriz auxMatriz = eliminarFila(0);
            Matriz finalMatriz = auxMatriz.eliminarColumna(i);
            determinante += obtenerEntrada(0, i) * signo * finalMatriz.determinante();

        }
        return determinante;
    }

    /**
     * Regresa los datos de esta matriz de tal forma que las columnas estan separadas por un espacio
     * y las filas estan separadas por un salto de linea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representacion en <code>String</code> de esta matriz
     */
        @Override
    public String toString() {
        String matrix = "";
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j != n - 1) {
                    matrix += obtenerEntrada(i, j) + " ";
                } else {
                    matrix += obtenerEntrada(i, j);
                }
            }
            if (i != m - 1) {
                matrix += "\n";
            } else {
                matrix += "";
            }
        }
        return matrix;
    }

    /**
     * Regresa <code>true</code> si y solo si <code>obj</code> es una instancia de 
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     *         entrada
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Matriz otra = (Matriz) obj;
        
        if (m != otra.m || n != otra.n) return false;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (datos[i][j] != otra.datos[i][j]) return false;
            }
        }
        return true;
    }
}