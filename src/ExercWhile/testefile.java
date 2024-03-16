package ExercWhile;

import java.io.*;

public class testefile {
    public static void main(String[] args) throws IOException {
        String arquivo = "src/file/arquivo.txt";

        try (

                FileWriter fileWriter = new FileWriter(arquivo,true);
                FileReader fileReader =  new FileReader(arquivo);
             BufferedReader br = new BufferedReader(fileReader);
                BufferedWriter bw = new BufferedWriter(fileWriter);
                )

        {
            bw.write("oi");
            String linha;
            while ((linha= br.readLine()) != null){
                System.out.println(linha);

            }



        } catch (IOException e){
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }

    }

}
