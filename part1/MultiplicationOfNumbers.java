package part1;

import java.util.Scanner;

// 7
// Mengkalikan n bilangan yang diinputkan (misal n=3 bilangan :yang diinput 5,3,4 maka hasilnya 5*3*4=60)

public class MultiplicationOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, product, i, number;

        // Meminta input jumlah bilangan
        System.out.print("Masukkan jumlah bilangan (N): ");
        n = scanner.nextInt();

        // Memeriksa jika N tidak valid
        if (n <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0.");
            return; // Menghentikan program jika input tidak valid
        }

        product = 1;

        // Meminta input setiap bilangan dan mengalikannya
        for (i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            number = scanner.nextInt();
            product *= number;
        }

        // Menampilkan hasil perkalian
        System.out.println("Hasil perkalian dari " + n + " bilangan adalah: " + product);

        scanner.close();
    }
}
