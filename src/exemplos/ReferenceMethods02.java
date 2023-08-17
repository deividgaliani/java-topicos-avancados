package exemplos;

import models.Produto;

import java.util.ArrayList;
import java.util.List;

class Printer {
    public static <T> void printObject(T t){
        System.out.println(t.toString());
    }
}

public class ReferenceMethods02 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse razer", 100.0));
        produtos.add(new Produto("Teclado Redragon", 100.0));
        produtos.add(new Produto("Notebook Dell", 5000.0));

        Thread t1 = new Thread(() -> produtos.forEach(Printer::printObject));
        Thread t2 = new Thread(() -> produtos.forEach(Produto::imprime));
        Thread t3 = new Thread(() -> produtos.forEach(System.out::println));

        t1.start();
        t2.start();
        t3.start();
    }
}
