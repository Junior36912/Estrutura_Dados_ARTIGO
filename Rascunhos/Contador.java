package Rascunhos;

public class Contador {
    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            // ...
        }

        System.out.println("O loop levou " + (System.nanoTime() - start) + " milissegundos para ser executado.");
    }
}