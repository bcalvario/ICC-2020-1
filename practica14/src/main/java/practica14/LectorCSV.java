package practica14;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectorCSV {

    public static List<String[]> leer(String ruta) throws IOException {
        List <String> lineas;
        
        List <String[]> resultados = new ArrayList<String[]>();

        try {    
            lineas = Files.readAllLines(Paths.get(ruta));

            for (String linea : lineas) {
                String[] resultado = linea.split(",", -1);
                resultados.add(resultado);
                
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        for(String[] r : resultados){
            for(String s : r){
                System.out.println(s);
            }
        }
        return resultados;
    }

}