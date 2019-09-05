
/**
 * @author: Berenice Calvario Gonzalez
 * @version: 4/09/2019
 */


public class HeyJude {
    public static void main (String[] args) {

        String hj = " Hey Jude, "; //Declaracion de variables
            String don = "don't ";
                String mb = "make it bad ";
                    String tb = " Take a sad song and make it better ";
                String ba = "be afraid "; 
                    String f = " You were made to go out and get her ";
                String ld = "let me down ";
                    String yh = " You have found her, now go and get her";

            String rt = " Remember to ";
                String lh = "let her into your heart ";
                String ls = "let her under your skin ";

            String ty = " Then you ";
                String cs = "can start ";
                String beg = "begin ";
                    String tob = "to make it better ";

            String better = " better";
        String na = " na";
        String oh = ", oh";

        int i = 1; //Declaramos una variable de tipo entero con el nombre de i inicializada con 1 para usarlo en el while

        while (i <= 7) { // While para indicar el parrafo de la cancion
            if (i == 3 || i == 5 || i == 7){ //Condicional para indicar que en el parrado 3, 5 y 7 va la cadena
                int j = 1; //Declaramos una variable de tipo entero con el nombre de j inicializada con 1 para usarlo en un while
                while (j < 11) { //Usamos while para imprimir 10 veces la cadena na
                    System.out.print(na); //Imprimimos 10 veces la cadena na
                    j++; //Incrementamos j para no entrar en un bucle

                }
                if (i == 7){ //Condicional para indicar el parrafo 7
                    String hj2 = hj; //Declaramos una nueva cadena con el nombre hj2 y le asignamos la cadena hj
                    int x = hj2.indexOf(","); //Declaramos la varible x de tipo entero y le asignamos el valor de la posicion en la que se encuentra la subcadena "," de la cadena hj2
                    hj2 = hj2.substring(0,x); //A hj2 le asignamos la subcadena que va de 0 a x-1
                    System.out.print(hj2); //Imprimimos la hj2
                }
                System.out.println(""); // Imprimimos la cadena "" con println para dejar una linea en blanco
            } else {
                System.out.print(hj + don); //Imprimimos la cadena hj concatenada con la cadena don
                if (i == 1 || i == 6){ //Usamos el condicional if para buscar el parrafo 1 y 6
                    System.out.println(mb); //Imprimimos la cadena mb
                    System.out.println(tb); //Imprimimos la cadena tb
                    System.out.print(rt); //Imprimimos la cadena rt
                    if (i == 1){ //Usamos el condicional if para buscar el parrrafo 1
                        System.out.println(lh); //Imprimimos la cadena lh
                        System.out.println(ty + cs + tob); //Imprimimos la cadena ty concatenada con cs concatenada a tob
                    }
                    else{
                        System.out.println(ls); //Imprimimos la cadena ls
                        System.out.println(ty + beg + tob); //Imprimimos la cadena ty concatenada a beg concatenada a tob

                        int k = 0; //Declaramos una variable de tipo entero llamada k y la inicializamos con 0
                        while (k++ < 5){ // While para imprimir cinco veces la cadena better
                            System.out.print(better); //Se imprime cinco veces la cadena better
                        }
                        System.out.println(oh); //Imprimimos la cadena oh
                    }
                }
            }
            if (i == 2){ //Usamos el condicional if para indicas el parrafo dos
                        System.out.println(ba); //Imprimimos la cadena ba
                        System.out.println(f); //Imprimimos la cadena f
                        System.out.println(rt + ls); //Imprimimos la cadena rt concatenada con ls
                        System.out.println(ty + beg + tob); //Imprimimos la cadena ty concatenada con beg concatenada con tob

                    } else {
                        if (i == 4){ //Usamos el condicional if para indicar el parrafo cuatro
                            System.out.println(ld); //Imprimimos la cadena ld
                        }
                        
                    }
            if (i == 4){ //Usamos el condicional if para indicar el parrafo cuatro
                System.out.println(yh); //Imprimimos la cadena yh
                System.out.println(rt + lh); //Imprimimos la cade rt concatenada con la cadena lh
                System.out.println(ty + cs + tob); //Imprimimos la cadena ty concatenada a cs concatenada a tob
            }
            i++;
        System.out.println(""); //Imprimimos la cadena "" para tener un espacio entre cada parrafo
        }
    }
}

