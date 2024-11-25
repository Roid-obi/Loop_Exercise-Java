package part1;

import java.util.Scanner;

// 5
// Algoritma menghitung rata-rata dari sejumlah bilangan yang diinput sebelum konfirmasi selesai input

public class AverageCalculatorUntilDone {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int i = 1, n = 0;
        double bil, jumlah = 0, rata;
        char konfirm;

        do {
            // Input bilangan
            System.out.print("Input Bilangan ke-" + i + ": ");
            bil = data.nextDouble();
            jumlah += bil;
            i++;
            n++;

            // Konfirmasi untuk input lagi
            System.out.print("Apakah ingin input angka lagi? (y/t): ");
            konfirm = data.next().charAt(0);
        } while (konfirm == 'y');

        // Menghitung rata-rata
        rata = jumlah / n;
        System.out.println("\nJumlah bilangan: " + jumlah);
        System.out.println("Rata-rata bilangan: " + rata);

        data.close();
    }
}
