package exemplos;

@FunctionalInterface
interface Figura {
    void desenha(Double largura, Double altura);
}

class Quadrado {
    static void desenhaQuadrado(Double altura, Double largura) {
        System.out.println("Desenhando quadrado de altura: " + altura + " largura: " + largura);
    }
}

class Retangulo {
    public void desenhaRetangulo(Double altura, Double largura){
        System.out.println("Desenhando retangulo de altura: " + altura + " largura: " + largura);
    }
}

public class ReferenceMethods {
    public static void main(String[] args) {
        Figura f1 = (a, l) -> System.out.println("Desenhando figura 1, altura: " + a + " largura: " + l);
        f1.desenha(10.0, 5.0);

        Figura f2 = Quadrado::desenhaQuadrado;
        f2.desenha(10.0, 10.0);

        Retangulo ret = new Retangulo();
        Figura f3 = ret::desenhaRetangulo;
        f3.desenha(8.0, 5.0);
    }
}
