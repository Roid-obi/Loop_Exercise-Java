package part1;

import java.util.Scanner;

// 3
// Algoritma penjumlahan deret ke N bil asli pertama.(misal n=4 maka hasilnya =1+2+3+4=10)

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i, sum;

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai N: ");
        n = scanner.nextInt();

        sum = 0;

        // Menjumlahkan deret bilangan dari 1 hingga N
        for (i = 1; i <= n; i++) {
            sum += i;
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan deret hingga " + n + " adalah: " + sum);

        scanner.close();
    }
}
