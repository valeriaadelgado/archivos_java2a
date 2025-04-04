
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Files {

    int countFileLines(String fileName){
        File file;
        FileReader reader;
        BufferedReader bufer;
        int numLines = 0;

        try{
            file = new File("C://Archivos//" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
            while ( (bufer.readLine()) != null ){
                numLines++;
            }
            reader.close();
        }catch( Exception e ){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return numLines;
    }
    
    public String[] fileToIntArray(String fileName){
        File file; // apuntar a un archivo físico del dd
        FileReader reader; // llave con permiso de solo lectura
        BufferedReader bufer; // para recuperar info del archivo
        String linea; // una linea del archivo
        int[] array = null; // arreglos del numero resultante
        int i=0; // índice
        int t; //tamaño
        try{
            t = countFileLines(fileName);
            array = new String[t];
            file = new File("C://archivos//" + fileName);
            reader =  new FileReader(file); //abrir el archivo en modo de solo lectura
            bufer = new BufferedReader(reader);
            //leer cada líne del archivo y almacenarla en un arreglo de enteros
            while ( (linea = bufer.readLine()) != null ){
                array[i] = linea;
                i++;
            }
            reader.close();
        } catch( Exception e){
            System.out.println("Error al leer el archivo " + e.toString());
        }
        return array;
    }
    //crear un archivo con info de un arreglo
    public void writeIntArrayToFile(String fileName, int[] array){
        FileWriter file;
        PrintWriter writer;
        try{
            file = new FileWriter("c://archivos//" + fileName);
            writer = PrintWriter(file);
            for ( intt unDato : array )
                writer.println(unDato);
            file.close();
        }catch (Exception e) {
            System.out.printl("eerro al crear el archivo: " + e.toString());
        }
    }
}