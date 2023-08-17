package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberThreads {
    public static void main(String[] args) {
        int targetNumber = 5789;
        List<Thread> threads = createRandomNumberThreads(targetNumber, 5);

        for (Thread thread : threads) {
            thread.start();
        }

        // Espera todas as threads terminarem
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todas as threads terminaram.");
    }

    public static List<Thread> createRandomNumberThreads(int target, int numThreads) {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
                Random random = new Random();
                int generatedNumber;

                do {
                    generatedNumber = random.nextInt(10000);
//                    System.out.println("Thread " + Thread.currentThread().getId() + ": " + generatedNumber);
                } while (generatedNumber != target);

                System.out.println("Thread " + Thread.currentThread().getId() + " encontrou o número!");

                // Interrompe todas as threads quando um número é encontrado
                threads.forEach(t -> t.interrupt());
            });

            threads.add(thread);
        }

        return threads;
    }
}
