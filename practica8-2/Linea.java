/**
  Clase para crear líneas rectas en el plano Cartesiano
  Objetivo: ilustrar la relación de agregación entre objetos.
  @author Berenice Calvario González
  @see     Punto
*/
class Linea {
                        //Estructura
  private Punto p1;
  private Punto p2;
  /**
   * Constructor por omisión
   */
  Linea () { 
    p1 = new Punto(0,0); 
    p2 = new Punto(1,1);  
  }
  /**
   * Constructor de una línea a partir de dos puntos
   * @param p1Ini -- punto de origen
   * @param p2Ini -- segundo punto
   */
  Linea (Punto p1Ini, Punto p2Ini) {
    p1 = p1Ini; 
    p2 = p2Ini;
  }
  /**
   * Constructor de copia
   * @param l -- Línea que se toma para crear una nueva
   */
  Linea (Linea l) { 
    p1 = l.p1; 
    p2 = l.p2;
  }
  /**
   * Determina la ecuación de una recta que pasa por 2 puntos
   * @return String -- La ecuación de la recta
   */
    public String pasaPorDosPuntos(){

    }

/**
 * Devuelve la pendiente de una recta.
 * @return double - La pendiente de la recta.
 */
  public double pendiente() {
    double divisor = p2.obtenerX() - p1.obtenerX();

    return (divisor != 0) ? (p2.obtenerY() - p1.obtenerY())/divisor
	: Double.POSITIVE_INFINITY;            //Recta paralela al eje Y
  }

/**
 * Devuelve la ordenada al origen 
 * @return 
 */

  }
/**
 * Determina si un punto pertenece a la recta
 * @param 
 * @return 
 **/
  public boolean contiene(Punto p) {  

  }
/**
 * Determina si dos líneas son la misma 
 * @param l1 -- Línea con la que se comparará la línea original
 * @return true si son la misma línea y false en otro caso
 */
  public boolean equals(Linea l1) {  

  }

/**
 * Determina si dos líneas son paralelas 
 * @param l1 -- Línea con la que se comparará la línea original
 * @return true si ambas líneas son paralelas y false en otro caso
 */
  public boolean esParalelaA(Linea l1) {  
      

  }
/**
 * Determina si dos líneas son perpendiculares 
 * @param l1 -- Línea con la que se comparará la línea original
 * @return true si ambas líneas son paralelas y false en otro caso
 */
  public boolean esPerpendicularA(Linea l1) {  
      return true;
  }
  /**
   * Determina el punto de intersección entre dos líneas 
   * @param l1 - la segunda línea
   * @return Punto - punto de intesercción
   */
  public Punto interseccion(Linea l1) { 
      return null;
  }
}

