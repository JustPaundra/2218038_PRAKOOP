/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;
/**
 *
 * @author 62821
 */
// Transaksi merupakan kelas yang merepresentasikan transaksi bahan pokok dengan implementasi StokInterface
public class Transaksi extends GudangBahanPokok implements StokInterface {
    private Date tanggalTransaksi; // Atribut untuk menyimpan tanggal transaksi
    private double totalHarga;     // Atribut untuk menyimpan total harga transaksi

    // Konstruktor untuk menciptakan objek Transaksi dengan atribut namaGudang, kapasitas, bahan, tanggalTransaksi, dan totalHarga.
    public Transaksi(String namaGudang, int kapasitas, String bahan, Date tanggalTransaksi, double totalHarga) {
        super(namaGudang, kapasitas, bahan); // Memanggil konstruktor kelas induk (GudangBahanPokok)
        this.tanggalTransaksi = tanggalTransaksi; // Menginisialisasi atribut tanggalTransaksi
        this.totalHarga = totalHarga;             // Menginisialisasi atribut totalHarga
    }

    // Metode getter untuk mengakses atribut tanggalTransaksi
    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    // Metode getter untuk mengakses atribut totalHarga
    public double getTotalHarga() {
        return totalHarga;
    }

    // Implementasi metode cekStokMinimum dari interface StokInterface
    @Override
    public boolean cekStokMinimum(String namaBahan, int batasMinimum) {
        int stok = getStok(namaBahan);
        return stok < batasMinimum;
    }
}

