package exemplos;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Example {

    public static void main(String[] args) {
        String text = "The Base64 class in Java 8!";

        try {
            String encodedText = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
            System.out.println(encodedText);
            String decodedText = new String(Base64.getDecoder().decode(encodedText), StandardCharsets.UTF_8);
            System.out.println(decodedText);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
