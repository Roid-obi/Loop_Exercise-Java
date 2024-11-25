package part2;
import java.util.Scanner;

// 4
// Algoritma Menghitung KPK dari 2 bilangan integer
// (tidak menggunakan fungsi KPK yg tersedia di java)

public class KPK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, maxVal;

        // Membaca input dari pengguna
        System.out.print("Masukkan bilangan pertama (A): ");
        A = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua (B): ");
        B = scanner.nextInt();

        // Menghitung KPK
        maxVal = Math.max(A, B); // Memulai dari bilangan terbesar
        while (true) {
            if (maxVal % A == 0 && maxVal % B == 0) {
                System.out.println("KPK dari " + A + " dan " + B + " adalah: " + maxVal);
                break;
            }
            maxVal++; // Coba nilai berikutnya
        }
        
        scanner.close();
    }
}
