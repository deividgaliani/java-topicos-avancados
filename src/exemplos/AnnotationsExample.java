package exemplos;

import models.Produto;
import models.Voltagem;

public class AnnotationsExample {
    public static void main(String[] args) {
        Voltagem[] volts = Produto.class.getAnnotationsByType(Voltagem.class);

        for(Voltagem v : volts){
            System.out.println(v.tensao());
        }
    }
}
