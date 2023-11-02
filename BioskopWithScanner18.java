import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();

                    boolean kursiTerisi = true;
                    while (kursiTerisi) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input.nextInt();
                        input.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil disimpan.");
                                kursiTerisi = false;
                            } else {
                                System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Baris atau kolom tidak valid. Harap masukkan baris (1-4) dan kolom (1-2) yang valid.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih. Keluar dari program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid. Harap pilih menu 1, 2, atau 3.");
                    break;
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = input.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
