package exemplos;

public class ThreadExample {
    public static void main(String[] args) {

        //instanciando um Runnable
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 em execução");
            }
        });

        //função anonima (lambda)
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 em execução");
            Figura f1 = (largura, altura) -> System.out.println("Desenhando figura com largura " + largura + " e altura " + altura);
            f1.desenha(5.0, 10.0);
        });

        t1.start();
        t2.start();
    }
}
