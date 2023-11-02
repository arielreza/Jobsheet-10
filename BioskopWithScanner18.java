import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
    Scanner input18 = new Scanner(System.in);

    int baris, kolom;
    String nama, next;

    String[][] penonton = new String[4][2];

    while (true) {
        System.out.print("Masukkan nama: ");
        nama = input18.nextLine();
        System.out.print("Masukkan baris: ");
        baris = input18.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = input18.nextInt();
        input18.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input penonton lainnya? (y/n): ");
        next = input18.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }
        
    }

    }
}
