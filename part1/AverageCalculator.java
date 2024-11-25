package part1;

import java.util.Scanner;

// 4
// Algoritma menghitung rata-rata dari n bilangan

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i;
        double sum, number, average;

        // Meminta input jumlah bilangan
        System.out.print("Masukkan jumlah bilangan (N): ");
        n = scanner.nextInt();

        // Memeriksa jika N tidak valid
        if (n <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0.");
            return; // Menghentikan program jika input tidak valid
        }

        sum = 0;

        // Meminta input setiap bilangan dan menambahkannya ke total
        for (i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            number = scanner.nextDouble();
            sum += number;
        }

        // Menghitung rata-rata
        average = sum / n;

        // Menampilkan hasil rata-rata
        System.out.println("Rata-rata dari " + n + " bilangan adalah: " + average);

        scanner.close();
    }
}
