
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Files {
    
    public int[] fileToIntArray(String fileName){
        File file; // apuntar a un archivo físico del dd
        FileReader reader; // llave con permiso de solo lectura
        BufferedReader bufer; // para recuperar info del archivo
        String linea; // una linea del archivo
        int[] array = null; // arreglos del numero resultante
        int i=0; // índice
        int t; //tamaño
        try{
            t = countFileLines(fileName);
            array = new int[t];
            file = new File("C://archivos//" + fileName);
            reader =  new FileReader(file);
            bufer = new BufferedReader(reader);
        
        } catch( Exception e){
            System.out.println("Error al leer el archivo " + e.toString());
        }
    }
    
}