package part2;
import java.util.Scanner;

// 5
// Algoritma Menghitung FPB dari 2 bilangan integer
// (tidak menggunakan fungsi FPB yg tersedia di java)

public class FPB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inisialisasi
        int A, B, fpb, i;

        // Membaca input dari pengguna
        System.out.print("Masukkan bilangan pertama (A): ");
        A = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua (B): ");
        B = scanner.nextInt();

        // Menghitung FPB menggunakan algoritma iterasi
        fpb = 1;
        for (i = 1; i <= Math.min(A, B); i++) {
            if (A % i == 0 && B % i == 0) {
                fpb = i; // i adalah pembagi bersama terbesar
            }
        }

        // Menampilkan hasil
        System.out.println("FPB dari " + A + " dan " + B + " adalah: " + fpb);

        scanner.close();
    }
}
