package java_completo.lerArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFile3 {
    public static void main(String[] args) {


        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "c:\\temp\\out.txt";

        //Sobreescreve o arquivo e acrescenta as informacoes do zero - porem perde as informacoes antigas
        //try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

        // Para acrescentar as informações no mesmo arquivo com o true
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }

}
