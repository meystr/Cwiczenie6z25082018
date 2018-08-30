//6. Zadeklaruj tablicę liczb. Od użytkownika wczytaj 2 indeksy, zamień elementy o podanych indeksach
package pl.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tablica[] = {3, 2, 5, 6, 7, 9, 43, 22, -94, -66, 4, 78};
        System.out.println("Podaj pierwszy index (w zakresie od 1 do " + tablica.length + "): ");
        for (int i = 0; i < tablica.length; i++)
        {
            System.out.print(+ tablica[i] + " ,");

        }
        System.out.println();
            Scanner scanner = new Scanner(System.in);
            int liczba1 = scanner.nextInt();

            System.out.println("Podaj drugi index: ");
            int liczba2 = scanner.nextInt();
            int tmpTab[] = {0};

            tmpTab[0] = tablica[liczba1];
            tablica[liczba1] = tablica[liczba2];
            tablica[liczba2] = tmpTab[0];
            for (int j = 0; j < tablica.length; j++) {
                System.out.print(tablica[j] + " ,");
            }
        }
    }
