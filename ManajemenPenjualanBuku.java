/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Kholid
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Buku {
    private String judul;
    private double hargaBeli;
    private double hargaJual;
    private int stok;

    public Buku(String judul, double hargaBeli, double hargaJual, int stok) {
        this.judul = judul;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(double hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok buku tidak mencukupi.");
        }
    }
}

class BukuFiksi extends Buku {
    public BukuFiksi(String judul, double hargaBeli, double hargaJual, int stok) {
        super(judul, hargaBeli, hargaJual, stok);
    }
}

class BukuNonFiksi extends Buku {
    public BukuNonFiksi(String judul, double hargaBeli, double hargaJual, int stok) {
        super(judul, hargaBeli, hargaJual, stok);
    }
}

class Majalah extends Buku {
    private int nomorEdisi;

    public Majalah(String judul, double hargaBeli, double hargaJual, int stok, int nomorEdisi) {
        super(judul, hargaBeli, hargaJual, stok);
        this.nomorEdisi = nomorEdisi;
    }

    public int getNomorEdisi() {
        return nomorEdisi;
    }

    public void setNomorEdisi(int nomorEdisi) {
        this.nomorEdisi = nomorEdisi;
    }
}

public class ManajemenPenjualanBuku {
    private double modalAwal;
    private double modalBerjalan;
    private double keuntungan;
    private List<Buku> daftarBuku;

    public ManajemenPenjualanBuku(double modalAwal) {
        this.modalAwal = modalAwal;
        this.modalBerjalan = modalAwal;
        this.keuntungan = 0.0;
        this.daftarBuku = new ArrayList<>();
    }

    public void tampilkanMenu() {
        System.out.println("Silahkan pilih menu:");
        System.out.println("1) Beli Buku   2) Jual Buku   3) Lihat Stok Buku   4) Lihat Laporan Keuangan   5) Exit");
        System.out.println();
    }

    public void beliBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jenis buku (1. Buku Fiksi, 2. Buku Non-Fiksi, 3. Majalah): ");
        int jenis = scanner.nextInt();

        switch (jenis) {
            case 1:
                beliBukuFiksi();
                break;
            case 2:
                beliBukuNonFiksi();
                break;
            case 3:
                beliMajalah();
                break;
            default:
                System.out.println("Jenis buku tidak valid.");
                break;
        }
    }

    public void jualBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor buku yang dijual: ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku >= 1 && nomorBuku <= daftarBuku.size()) {
            Buku buku = daftarBuku.get(nomorBuku - 1);
            System.out.print("Masukkan jumlah stok buku yang dijual: ");
            int jumlah = scanner.nextInt();

            if (buku.getStok() >= jumlah) {
                buku.kurangiStok(jumlah);
                double hargaJual = buku.getHargaJual();
                keuntungan += (hargaJual * jumlah);
                modalBerjalan += (hargaJual * jumlah);
                System.out.println("Buku terjual dengan harga: " + hargaJual);
            } else {
                System.out.println("Stok buku tidak mencukupi.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
    }

    public void lihatStokBuku() {
        System.out.println("Stok Buku:");
        System.out.println("No\tJudul\t\tStok");
        System.out.println("----------------------------------");
        if (!daftarBuku.isEmpty()) {
            for (int i = 0; i < daftarBuku.size(); i++) {
                Buku buku = daftarBuku.get(i);
                System.out.println((i + 1) + "\t" + buku.getJudul() + "\t\t" + buku.getStok());
            }
        } else {
            System.out.println("Tidak ada buku yang tersedia.");
        }
        System.out.println();
    }

    public void lihatLaporanKeuangan() {
        System.out.println("Modal Awal: " + modalAwal);
        System.out.println("Modal Berjalan: " + (modalAwal + keuntungan));
    }

    public void beliBukuFiksi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku fiksi: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan harga beli buku fiksi: ");
        double hargaBeli = scanner.nextDouble();
        System.out.print("Masukkan harga jual buku fiksi: ");
        double hargaJual = scanner.nextDouble();
        System.out.print("Masukkan jumlah stok buku fiksi: ");
        int stok = scanner.nextInt();

        BukuFiksi bukuFiksi = new BukuFiksi(judul, hargaBeli, hargaJual, stok);
        daftarBuku.add(bukuFiksi);
        modalBerjalan -= (hargaBeli * stok);
        System.out.println("Buku fiksi berhasil dibeli.");
    }

    public void beliBukuNonFiksi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku non-fiksi: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan harga beli buku non-fiksi: ");
        double hargaBeli = scanner.nextDouble();
        System.out.print("Masukkan harga jual buku non-fiksi: ");
        double hargaJual = scanner.nextDouble();
        System.out.print("Masukkan jumlah stok buku non-fiksi: ");
        int stok = scanner.nextInt();

        BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judul, hargaBeli, hargaJual, stok);
        daftarBuku.add(bukuNonFiksi);
        modalBerjalan -= (hargaBeli * stok);
        System.out.println("Buku non-fiksi berhasil dibeli.");
    }

    public void beliMajalah() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul majalah: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan harga beli majalah: ");
        double hargaBeli = scanner.nextDouble();
        System.out.print("Masukkan harga jual majalah: ");
        double hargaJual = scanner.nextDouble();
        System.out.print("Masukkan jumlah stok majalah: ");
        int stok = scanner.nextInt();
        System.out.print("Masukkan nomor edisi majalah: ");
        int nomorEdisi = scanner.nextInt();

        Majalah majalah = new Majalah(judul, hargaBeli, hargaJual, stok, nomorEdisi);
        daftarBuku.add(majalah);
        modalBerjalan -= (hargaBeli * stok);
        System.out.println("Majalah berhasil dibeli.");
    }

    public static void main(String[] args) {
        double modalAwal = 1000000;
        ManajemenPenjualanBuku manajemen = new ManajemenPenjualanBuku(modalAwal);
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        System.out.println("*****************");
        System.out.println("* Sistem Penjualan Buku");
        System.out.println("* Kevin Dwi Mahendra (22201204)");
        System.out.println("*****************");
        System.out.println();

        do {
            manajemen.tampilkanMenu();
            System.out.print("Pilihan Menu: ");
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    manajemen.beliBuku();
                    break;
                case "2":
                    manajemen.jualBuku();
                    break;
                case "3":
                    manajemen.lihatStokBuku();
                    break;
                case "4":
                    manajemen.lihatLaporanKeuangan();
                    break;
                case "5":
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println();
        } while (!pilihan.equals("5"));
    }
}