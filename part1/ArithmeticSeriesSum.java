package part1;
import java.util.Scanner;

// 6
// Algoritma penjumlahan deret aritmatika (Un=a+(n-1)b),
// dengan perulangan bukan dengan rumus Sn!

public class ArithmeticSeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, n, sum, currentTerm, i;

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai suku pertama (a): ");
        a = scanner.nextInt();
        System.out.print("Masukkan beda (b): ");
        b = scanner.nextInt();
        System.out.print("Masukkan jumlah suku (n): ");
        n = scanner.nextInt();

        sum = 0;

        // Menghitung penjumlahan deret aritmatika menggunakan perulangan
        for (i = 0; i < n; i++) {
            currentTerm = a + (i * b);
            sum += currentTerm;
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan deret aritmatika adalah: " + sum);

        scanner.close();
    }
}
