import java.util.Scanner;

public class Tugas2 {
    // Class kosong, atau Anda dapat menambahkan logika lain di sini
}

class TugasHitungBangungunDatar {

    public static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static int hitungKelilingPersegi(int sisi) {
        return 4 * sisi;
    }

    public static int hitungLuasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static int hitungKelilingPersegiPanjang(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");

        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                int sisi = scanner.nextInt();
                int luasPersegi = hitungLuasPersegi(sisi);
                int kelilingPersegi = hitungKelilingPersegi(sisi);
                System.out.println("Luas persegi: " + luasPersegi);
                System.out.println("Keliling persegi: " + kelilingPersegi);
                break;

            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                int panjang = scanner.nextInt();
                System.out.print("Masukkan lebar persegi panjang: ");
                int lebar = scanner.nextInt();
                int luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
                int kelilingPersegiPanjang = hitungKelilingPersegiPanjang(panjang, lebar);
                System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
                System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);
                break;

            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                double luasLingkaran = hitungLuasLingkaran(jariJari);
                double kelilingLingkaran = hitungKelilingLingkaran(jariJari);
                System.out.println("Luas lingkaran: " + luasLingkaran);
                System.out.println("Keliling lingkaran: " + kelilingLingkaran);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
