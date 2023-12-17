/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author 62821
 */
public abstract class GudangBahanPokok {

    // Atribut-atribut privat untuk menyimpan data gudang
    private String nama_gudang;  // Nama gudang
    private String bahan;        // Jenis bahan yang disimpan
    private int kapasitas;       // Kapasitas maksimum gudang
    private Map<String, Integer> stok_bahan; // Stok bahan dalam gudang

     //* Konstruktor untuk membuat objek gudangbahanpokok.
     
    public GudangBahanPokok(String nama_gudang, int kapasitas, String bahan) {
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas gudang harus lebih dari 0");
        }
        this.nama_gudang = nama_gudang;
        this.kapasitas = kapasitas;
        this.bahan = bahan;
        this.stok_bahan = new HashMap<>();
    }
    public String getNamaGudang() {
        return nama_gudang;
    }

    public String getBahan() {
        return bahan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public Map<String, Integer> getStokBahan() {
        return stok_bahan;
    }

    // Metode pertama untuk menambah stok barang
    public int tambahStok(String namaBahan, int jumlah) {
        if (stok_bahan.containsKey(namaBahan)) {
            int stokSebelumnya = stok_bahan.get(namaBahan);
            int stokBaru = stokSebelumnya + jumlah;
            stok_bahan.put(namaBahan, stokBaru);
            return stokBaru;
        } else {
            stok_bahan.put(namaBahan, jumlah);
            return jumlah;
        }
    }

    // Metode overloading kedua untuk menambah stok barang dengan satuan tambahan
    public int tambahStok(String namaBahan, int jumlah, String satuan) {
        if (stok_bahan.containsKey(namaBahan)) {
            int stokSebelumnya = stok_bahan.get(namaBahan);
            int stokBaru = stokSebelumnya + jumlah;
            stok_bahan.put(namaBahan, stokBaru);
            System.out.println("Stok barang dengan satuan tambahan berhasil ditambahkan.");
            return stokBaru;
        } else {
            stok_bahan.put(namaBahan, jumlah);
            System.out.println("Stok barang dengan satuan tambahan berhasil ditambahkan.");
            return jumlah;
        }
    }

    // Metode overloading ketiga untuk menambah stok barang dengan harga tambahan
    public int tambahStok(String namaBahan, int jumlah, double harga) {
        if (stok_bahan.containsKey(namaBahan)) {
            int stokSebelumnya = stok_bahan.get(namaBahan);
            int stokBaru = stokSebelumnya + jumlah;
            stok_bahan.put(namaBahan, stokBaru);
            System.out.println("Stok barang dengan harga tambahan berhasil ditambahkan.");
            return stokBaru;
        } else {
            stok_bahan.put(namaBahan, jumlah);
            System.out.println("Stok barang dengan harga tambahan berhasil ditambahkan.");
            return jumlah;
        }
    }
    // Metode abstrak untuk mengecek stok minimum
    public abstract boolean cekStokMinimum(String namaBahan, int batasMinimum);

    // Metode untuk mendapatkan stok suatu bahan
    public int getStok(String namaBahan) {
        return stok_bahan.getOrDefault(namaBahan, 0);
    }
}
