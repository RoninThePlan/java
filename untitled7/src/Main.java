import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Tworzymy pulę wątków (np. 3 wątki)
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Dodajemy zadania do wykonania
        for (int i = 1; i <= 5; i++) {
            int numer = i; // musi być "final" lub "effectively final"
            executor.submit(() -> {
                System.out.println("Wątek " + Thread.currentThread().getName()
                        + " pracuje nad zadaniem " + numer);
                try {
                    // Symulacja pracy
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Wątek " + Thread.currentThread().getName()
                        + " zakończył zadanie " + numer);
            });
        }

        // Kończymy przyjmowanie nowych zadań
        executor.shutdown();
        try {
            // Czekamy max 10 sekund na zakończenie wszystkich zadań
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("Wszystkie zadania zakończone.");
    }
}
