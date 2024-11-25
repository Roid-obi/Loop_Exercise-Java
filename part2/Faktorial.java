package part2;
import java.util.Scanner;

// 1
// Algortima menghitung n!( n faktorial)
// (tidak menggunakan fungsi faktorial yg tersedia di java)

public class Faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inisialisasi
        int n, faktorial, i;

        // Membaca input dari pengguna
        System.out.print("Masukkan angka n: ");
        n = scanner.nextInt();

        // Menghitung n!
        faktorial = 1;
        for (i = 1; i <= n; i++) {
            faktorial *= i;  // faktorial = faktorial * i
        }

        // Menampilkan hasil
        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);

        scanner.close();
    }
}
