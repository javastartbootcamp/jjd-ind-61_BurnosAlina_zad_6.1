package pl.javastart.task;

import java.util.Scanner;

public class Numbers {

    private Scanner scanner = new Scanner(System.in);
    private int x;

    void guessNumber() {
        do {
            System.out.println("Podaj liczbę");
            x = scanner.nextInt();
            printClues();
        } while (!(x >= 100 && x <= 200 && x % 3 == 0));
        System.out.println("Twoja liczba jest ok");
        scanner.close();
    }

    private void printClues() {
        if (x < 100) {
            System.out.println("Podana liczba jest za mała");
        } else if (x >= 100 && x <= 200 && x % 3 != 0) {
            System.out.println("Liczba nie jest podzielna przez 3");
        } else if (x > 200) {
            System.out.println("Podana liczba jest za duża");
        }
    }
}
