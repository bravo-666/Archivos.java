import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Files {
    
    public int[] fileToIntArray(String fileNmae){
        File file; //apuntar un archivo fisico del disco duro
        FileReader reader; // llave con persimo de solo lectura
        BufferedReader bufer; //para revuperar informacion del archivo
        String linea; //una linea del archivo
        int[] array = null; //arreglo de numeros resultante
        int i=0; //indice
        int t; //tamano
        try {
            t = countFileLines(fileName);
            array = new int[t]; //creacion del arreglo 
            file = new File("D:\\Archivos\\" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
        } catch (Exception e) {
            System.out.println("error al leer el archivo: " + e.toString());
        }

        }
    }
