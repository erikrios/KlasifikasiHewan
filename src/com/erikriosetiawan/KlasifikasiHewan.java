package com.erikriosetiawan;

import java.util.ArrayList;
import java.util.Scanner;

public class KlasifikasiHewan {


    // Deklarasi objek dari kelas HewanKarnivora, HewanHerbivora, dan HewanOmnivora
    private static HewanKarnivora hewanKarnivora = new HewanKarnivora();
    private static HewanHerbivora hewanHerbivora = new HewanHerbivora();
    private static HewanOmnivora hewanOmnivora = new HewanOmnivora();

    // Deklarasi objek dari kelas ArrayList untuk menyimpan data
    private static ArrayList dataKarnivora = new ArrayList();
    private static ArrayList dataHerbivora = new ArrayList();
    private static ArrayList dataOmnivora = new ArrayList();

    // Deklarasi objek dari kelas Scanner untuk meminta input user
    private static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] args) {

        judulProgram();
        konfirmasiProgram();
    }

    private static void judulProgram() {
        System.out.printf("%s\n", "======== PROGRAM KLASIFIKASI HEWAN =======");
        System.out.printf("\t\t%s\n", "---------------------------");
        System.out.printf("\t%s\n\t%s\n", "Dibuat Oleh : Erik Rio Setiawan", "Pada Tanggal : 11 Maret 2019");
        System.out.printf("%S\n", "==========================================");
    }

    private static void konfirmasiProgram() {
        String jawab;
        boolean kondisi = true;
        outer:
        while (kondisi){
            System.out.printf("%s\n", "Selamat datang di Program Klasifikasi Hewan, Apakah Anda ingin menjalankan program ini? (Y / T)");
        System.out.printf("%s", "Jawab : ");
        jawab = inputUser.nextLine();
        if (jawab.equalsIgnoreCase("Y")) {
            tanyaJenisHewan();
        } else if (jawab.equalsIgnoreCase("T")) {
            return;
        } else {
            System.out.printf("%s\n", "Jawaban Anda salah! mohon coba kembali!");
            continue outer;
        }
    }
    }

    private static void tanyaJenisHewan() {
        String pilihan;
        boolean kondisi = true;
        outer:
        while (kondisi) {
        System.out.printf("%s\n\t%s\n\t%s\n\t%s\n", "1. Jenis Hewan", "a. Karnivora", "b. Herbivora", "c. Omnivora");
        System.out.printf("%s", "Masukkan Pilihan : ");
        pilihan = inputUser.nextLine();
        if (pilihan.equalsIgnoreCase("a")) {
            String jenisHewan, namaHewan;
            int jumlahKaki;
            double beratBadan;
            dataKarnivora.add(hewanKarnivora.jenisHewan());
            dataKarnivora.add(hewanKarnivora.namaHewan(tanyaNamaHewan()));
            dataKarnivora.add(hewanKarnivora.jumlahKaki(tanyaJumlahKaki()));
            dataKarnivora.add(hewanKarnivora.beratBadan(tanyaBeratBadan()));
            jenisHewan = (String) dataKarnivora.get(0);
            namaHewan = (String) dataKarnivora.get(1);
            jumlahKaki = (int) dataKarnivora.get(2);
            beratBadan = (double) dataKarnivora.get(3);
            tanyaTampilkanData();
            tampilkanData(jenisHewan, namaHewan, jumlahKaki, beratBadan);
            kondisi = false;
        } else if (pilihan.equalsIgnoreCase("b")) {
            String jenisHewan, namaHewan;
            int jumlahKaki;
            double beratBadan;
            dataHerbivora.add(hewanHerbivora.jenisHewan());
            dataHerbivora.add(hewanHerbivora.namaHewan(tanyaNamaHewan()));
            dataHerbivora.add(hewanHerbivora.jumlahKaki(tanyaJumlahKaki()));
            dataHerbivora.add(hewanHerbivora.beratBadan(tanyaBeratBadan()));
            jenisHewan = (String) dataHerbivora.get(0);
            namaHewan = (String) dataHerbivora.get(1);
            jumlahKaki = (int) dataHerbivora.get(2);
            beratBadan = (double) dataHerbivora.get(3);
            tanyaTampilkanData();
            tampilkanData(jenisHewan, namaHewan, jumlahKaki, beratBadan);
            kondisi = false;
        } else if (pilihan.equalsIgnoreCase("c")) {
            String jenisHewan, namaHewan;
            int jumlahKaki;
            double beratBadan;
            dataOmnivora.add(hewanOmnivora.jenisHewan());
            dataOmnivora.add(hewanOmnivora.namaHewan(tanyaNamaHewan()));
            dataOmnivora.add(hewanOmnivora.jumlahKaki(tanyaJumlahKaki()));
            dataOmnivora.add(hewanOmnivora.beratBadan(tanyaBeratBadan()));
            jenisHewan = (String) dataOmnivora.get(0);
            namaHewan = (String) dataOmnivora.get(1);
            jumlahKaki = (int) dataOmnivora.get(2);
            beratBadan = (double) dataOmnivora.get(3);
            tanyaTampilkanData();
            tampilkanData(jenisHewan, namaHewan, jumlahKaki, beratBadan);
            kondisi = false;
        } else {
            System.out.printf("%s\n", "Pilihan salah, coba kembali!");
            continue outer;
        }
    }
    }

    private static String tanyaNamaHewan() {
        String namaHewan;
        System.out.printf("%s", "2. Masukkan Nama Hewan : ");
        namaHewan = inputUser.nextLine();
        return namaHewan;
    }

    private static int tanyaJumlahKaki() {
        int jumlahKaki;
        System.out.printf("%s", "3. Masukkan Jumlah Kaki : ");
        jumlahKaki = inputUser.nextInt();
        return jumlahKaki;
    }

    private static double tanyaBeratBadan() {
        double beratBadan;
        System.out.printf("%s", "4. Masukkan Berat Badan : ");
        beratBadan = inputUser.nextDouble();
        return beratBadan;
    }

    private static String tanyaTampilkanData() {
        String tampilkanData = null;
        boolean kondisi = true;
        outer:
        while (kondisi) {
            System.out.printf("%s", "Apakah Anda ingin menampilkan data Anda? (Y/T) : ");
            tampilkanData = inputUser.nextLine();
            if (tampilkanData.equalsIgnoreCase("Y")) {
                kondisi = false;
            } else if (tampilkanData.equalsIgnoreCase("T")){
                kondisi = false;
            } else {
                continue outer;
            }
        }

        return tampilkanData;
    }

    private static void tampilkanData(String jenisHewan, String namaHewan, int jumlahKaki, double beratBadan) {
        if (tanyaTampilkanData().equalsIgnoreCase("Y")) {
            System.out.printf("%s\n","======== Data Klasifikasi Hewan ========");
            System.out.printf("%s%s\n", "1. Jenis Hewan : ", jenisHewan);
            System.out.printf("%s%s\n", "2. Nama Hewan : ", namaHewan);
            System.out.printf("%s%d\n", "3. Jumlah Kaki: ", jumlahKaki);
            System.out.printf("%s%f %s\n", "4. Berat Badan : ", beratBadan, "kg");
        } else if (tanyaTampilkanData().equalsIgnoreCase("T")) {
            return;
        } else {
            System.out.printf("%s\n", "Pilihan salah! coba kembali.");
        }
    }

}
