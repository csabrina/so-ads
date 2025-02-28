public class ThreadModificada {
    public static void main(String[] args) {
        // Thread para contar de 1 a 10
        Thread contarThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500); // Pausa de 500ms entre os números
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        // Thread para imprimir letras de A a J
        Thread letrasThread = new Thread(() -> {
            for (char c = 'A'; c <= 'J'; c++) {
                System.out.println(c);
                try {
                    Thread.sleep(500); // Pausa de 500ms entre as letras
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        // Thread para imprimir números pares de 2 a 10
        Thread paresThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        // Thread para imprimir números ímpares de 1 a 9
        Thread imparesThread = new Thread(() -> {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        contarThread.start();
        letrasThread.start();
        paresThread.start();
        imparesThread.start();

        try {
            contarThread.join();
            letrasThread.join();
            paresThread.join();
            imparesThread.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
