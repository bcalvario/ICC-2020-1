import java.util.Scanner;

/**
 * @author: Berenice Calvario Gonzalez
 * @version: 27/08/2019
 */

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declracion.
		String nombreCompleto = new String(); //Declaracion.
		String fechaNacimiento = new String(); //Declaracion.
	
		System.out.println("Introduce tu nombre completo:");
		nombreCompleto = scanner.nextLine(); //Lee el nombre.
		nombreCompleto = nombreCompleto.trim(); //Elimina blancos del final de la cadena.
		String nombreFinal = nombreCompleto; //a nombre final se le asigna la cadena de nombreCompleto.

		System.out.println("\nIntroduce tu fecha de nacimiento en formato dd/mm/aaaa");
		fechaNacimiento = scanner.nextLine(); //Lee la fecha de nacimiento.
		fechaNacimiento = fechaNacimiento.trim(); //Elimina los blancos del final de la cadena.

		String rfc; //Declaracion.
	
		int a1 = nombreCompleto.indexOf(" "); //Devuelve la posicion donde empieza la subcadena " ".
		String al1 = nombreCompleto.substring(0,a1); //Devuelve la cadena desde la posicion 0 hasta a1 y se declarar una nueva variable antes.
		nombreCompleto = nombreCompleto.substring(a1); //A nombreCompleto se le asigna la subcadena formada anteriormente con nombreCompleto.

		nombreCompleto = nombreCompleto.trim(); //Elimina blancos del final de la cadena.
		a1 = nombreCompleto.indexOf(" "); //Asigna a a1 la posicion donde empieza la subcadena " ".
		rfc = nombreCompleto.substring(0,2); //A rfc se le asigna la subcadena que empieza en 0 hasta 2.
		nombreCompleto = nombreCompleto.substring(a1); //A nombreCompleto se le asigna la subcadena fromada anteriormente con nombreCompleto.

		nombreCompleto = nombreCompleto.trim(); //Elimina los blancos del final de la cadena.
		a1 = nombreCompleto.indexOf(" "); //A a1 se le asigna la posicion donde empieza la subcadena " ".
		rfc += nombreCompleto.substring(0,1); //A rfc se le suma la subcadena que va de la posicion 0 a 1 de nombreCompleto.
		rfc += al1.substring(0,1); //A rfc se le suma la subcadena que va de la posicion 0 a 1 de al1.

		String rfcf; //Declaracion
		//anio, mes, dia

		String a2 = fechaNacimiento.substring(8,10); //Declaracion de a2 a la cual se le asigna la subcadena que va de la posicion 8 a 10 de fechaNacimiento.
		String a3 = fechaNacimiento.substring(3,5); //Declaracion de a3 a la cual se le asigna la subcadena que va de la posicion 3 a 5 de fechaNacimiento.
		String a4 = fechaNacimiento.substring(0,2); //Declaracion de a4 a la cual se le asigna la subcadena que va de la posicion 0 a 2 de fechaNacimiento.
		rfcf = a2 + a3 + a4; //A rfcf se le asigna a2 concatenado a a3 concatenado a a4.
		

		System.out.println("\nEl RFC de " + nombreFinal + " es: " + rfc.toUpperCase() +""+ rfcf); //rfc.toUpperCase devuelve la cadena en mayusculas.
		
	}

}