package java_completo.lerArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFile2 {
    public static void main(String[] args) {

        String path = "c:\\temp\\file.txt";

        //BufferedReader / FileReader - utilizados para ler arquivos
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
