package part1;

import java.util.Scanner;

// 2
// Algoritma untuk mencetak karakter dari suatu inputan dan akan ber akhir jika nilai dari input bernilai ‘x’ atau ‘X’
// (input ‘a’ akan tercetak a dilayar dst sampai menginput ‘x’ atau ‘X’ baru keluar program)

public class PrintCharactersUntilX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;

        // Loop untuk terus meminta input sampai 'x' atau 'X' dimasukkan
        while (true) {
            System.out.print("Masukkan karakter (masukkan 'x' atau 'X' untuk keluar): ");
            inputChar = scanner.next().charAt(0); // Membaca karakter pertama dari input pengguna

            // Memeriksa apakah karakter input adalah 'x' atau 'X'
            if (inputChar == 'x' || inputChar == 'X') {
                System.out.println("Program selesai.");
                break; // Keluar dari loop
            }

            // Mencetak karakter yang dimasukkan
            System.out.println("Karakter yang dimasukkan: " + inputChar);
        }

        scanner.close();
    }
}
