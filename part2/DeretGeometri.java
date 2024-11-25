package part2;
import java.util.Scanner;

// 3
// Algoritma menghitung jumlah deret geometri (Un=a.r^(n-1))
// dengan perulangan bukan dengan rumus Sn

public class DeretGeometri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // inisialisai
        double a, r, sum, term;
        int n, i;

        // Membaca input dari pengguna
        System.out.print("Masukkan nilai a (suku pertama): ");
        a = scanner.nextDouble();
        System.out.print("Masukkan nilai r (rasio): ");
        r = scanner.nextDouble();
        System.out.print("Masukkan nilai n (jumlah suku): ");
        n = scanner.nextInt();

        // Menghitung jumlah deret geometri
        sum = 0;  // Inisialisasi jumlah
        term = a; // Suku pertama
        for (i = 1; i <= n; i++) {
            sum += term; // Tambahkan suku ke jumlah
            term *= r; // Hitung suku berikutnya
        }

        // Menampilkan hasil
        System.out.println("Jumlah deret geometri adalah: " + sum);

        scanner.close();
    }
}
