package geometria;

/**
 * Representa un poligono de tres lados. Esta definido por tres puntos en el plano cartesiano.
 * @since 1.0
 */ 

public class Triangulo{

    private Punto a;
    private Punto b;
    private Punto c;

    public static final int EQUILATERO = 0;
    public static final int ESCALENO = 2;
    public static final int ISOSCELES = 1;

    /**
     * Crea un triangulo equilatero de lado 1 con vertices en (0, 0), (1, 0) y (0.5, sin(pi / 3)).
     * @since 1.0
     */
    public Triangulo(){
        a = new Punto(0,0);
        b = new Punto(1,0);
        c = new Punto(0.5,Math.sin(Math.PI/3));
    }

    /**
     * Crea un triangulo con los tres puntos dados.
     * @param a coordenada a
     * @param b coordenada b
     * @param c coordenada c    
     * @since 1.0
     */
    public Triangulo(Punto a, Punto b, Punto c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Determina si los vertices de este triangulo estan alineados.
     * @param a punto que con b y <code>this</code> se determina si estan alineados
     * @param b punto que con c y <code>this</code> se determina si estan alineados
     * @param c punto que con a y <code>this</code> se determina si estan alineados
     * @return <code>true</code> si los vertices del triangulo estan alineados
     * @since 1.0
     */
    public boolean tieneVerticesAlineados(){
        return a.estanAlineados(b,c);
    }
    /** 
    * Regresa el tipo de este triangulo segun la longitud de sus lados; puede ser equilatero, isosceles o escaleno.
    */
    public int tipo(){
        double da = a.distancia(b);
        double db = b.distancia(c);
        double dc = c.distancia(a);

        if(da == db && db == dc){
            return EQUILATERO;
        }
        if(da == db || db == dc || dc == da){
            if(!(da == db && db == dc)){
                return ISOSCELES;
            }
        }
            return ESCALENO;
    
    }

    public Punto geta(){
        return a;
    }

    public Punto getb(){
        return b;
    }

    public Punto getc(){
        return c;
    }


}
