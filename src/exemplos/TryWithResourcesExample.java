package exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        try {
            readFile("src/assets/messages.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Exemplo de bloco Try com recurso (Closeable)
    public static void readFile(String path) throws IOException {
        String linha = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
        }
    }
}
