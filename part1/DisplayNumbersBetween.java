package part1;

import java.util.Scanner;

// 1
// Algortima menampilkan angka diantara 2 nilai yang dimasukan, 
// misal nilai yang di masukan adalah 2 dan 10, maka outputnya adalah : 2 3 4 5 6 7 8 9 10

public class DisplayNumbersBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start, end, i;

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai pertama: ");
        start = scanner.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        end = scanner.nextInt();

        // Menentukan arah pencetakan angka
        if (start <= end) {
            for (i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (i = start; i >= end; i--) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
