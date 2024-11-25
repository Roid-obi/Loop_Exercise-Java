package part2;
import java.util.Scanner;

// 2
// Algoritma menghitung X pangkat Y
// (tidak menggunakan fungsi pangkat yg tersedia di java)

public class Pangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inisialisasi
        int X, Y, hasil, i;

        // Membaca input dari pengguna
        System.out.print("Masukkan nilai X: ");
        X = scanner.nextInt();
        System.out.print("Masukkan nilai Y: ");
        Y = scanner.nextInt();

        // Menghitung X pangkat Y
        hasil = 1;
        for (i = 1; i <= Y; i++) {
            hasil *= X;  // hasil = hasil * X
        }

        // Menampilkan hasil
        System.out.println(X + " pangkat " + Y + " adalah: " + hasil);
        
        scanner.close();
    }
}
