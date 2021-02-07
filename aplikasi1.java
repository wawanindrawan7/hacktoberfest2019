package latihan1;

import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        String Pilih_ket = "";
        do {
            int Pilih;
            double sisi, panjang, tinggi, lebar, luas = 0;
            String Rumus = "", Nama_bangun = "";
            System.out.println("APLIKASI Mencari Luas dan Volume");
            System.out.println("=================================");
            System.out.println("1. Rumus Persegi");
            System.out.println("2. Rumus Persegi Panjang");
            System.out.println("3. Rumus Kubus");
            System.out.println("4. Rumus Balok");
            System.out.println("5. Keluar");
            System.out.println("=================================");
            System.out.print("Masukan Nomer Pilihan : ");
            Pilih = X.nextInt();
            switch (Pilih) {
                case 1:
                    System.out.println("Menghitung Persegi");
                    System.out.println("=================================");
                    System.out.print("Masukan Luas Sisi :");
                    sisi = X.nextDouble();
                    luas = sisi * sisi;
                    Nama_bangun = "Persegi";
                    Rumus = "Luas = Sisi X sisi";
                    break;
                case 2:
                    Nama_bangun = "Persegi Panjang";
                    System.out.println("Menghitung Luas Persegi Panjang");
                    System.out.println("=================================");
                    System.out.print("Masukan Luas Panjang :");
                    panjang = X.nextDouble();
                    System.out.print("Masukan Luas Lebar :");
                    lebar = X.nextDouble();
                    Rumus = "Luas = Panjang X lebar";
                    luas = panjang * lebar;
                    break;
                case 3:
                    Nama_bangun = "Kubus";
                    System.out.println("Menghitung Kubus");
                    System.out.println("=================================");
                    System.out.print("Masukan Luas Sisi :");
                    sisi = X.nextDouble();
                    Rumus = "Luas = Sisi X sisi";
                    luas = sisi * sisi * sisi;
                    break;
                case 4:
                    Nama_bangun = "Balok";
                    System.out.println("Menghitung Luas Persegi Panjang");
                    System.out.println("=================================");
                    System.out.print("Masukan Luas Panjang :");
                    panjang = X.nextDouble();
                    System.out.print("Masukan Luas Lebar :");
                    lebar = X.nextDouble();
                    System.out.print("Masukan Luas Tinggi :");
                    tinggi = X.nextDouble();
                    Rumus = "Volume = Panjang X Lebar X Tinggi";
                    luas = panjang * lebar * tinggi;
                    break;
                default:
                    System.out.println("Menu Tidak tersedia");
            }
            System.out.println("");
            System.out.println("Tampilkan Hasil");
            System.out.println("================");
            System.out.println("Nama Bangun :" + Nama_bangun);
            System.out.println("Rumus       :" + Rumus);
            System.out.println("Luas/Volume :" + luas);
            System.out.println("=========================");
            System.out.println("Apakah Anda Ingin Mencoba lagi");
            Pilih_ket = X.next();
        } while (Pilih_ket.equalsIgnoreCase("Y"));

    }
}
