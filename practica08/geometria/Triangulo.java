Package geometria;

/**
 * Representa un poligono de tres lados. Esta definido por tres puntos en el plano cartesiano.
 * @since 1.0
 */ 

public class Triangulo{

    private double a;
    private double b;
    private double c;

    public static final int EQUILATERO = 0;
    public static final int ESCALENO = 2;
    public static final int ISOSCELES = 1;

    /**
     * Crea un triangulo equilatero de lado 1 con vertices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
     * @since 1.0
     */
    public Triangulo(){
        a = (0,0);
        b = (1,0);
        c = (0.5,Math.sin(Math.PI/3));
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
        a.distacia()
        return;
    }
    /** 
    * Regresa el tipo de este triangulo segun la longitud de sus lados; puede ser equilatero, isosceles o escaleno.
    */
    public int tipo(){
        if (t.tipo() == Triangulo.EQUILATERO){
            System.out.println("es equilatero");
        } else {
            if (t.tipo() == Triangulo.ISOSCELES){
                System.out.println("es isosceles");
            } else {
                (t.tipo() == Triangulo.ESCALENO){
                    System.out.println("es escaleno");
                }
            }
        }
    }



}
