/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 62821
 */
public class Pemasok extends GudangBahanPokok {
    private String alamat;
    private String nomorTelepon;

    public Pemasok(String namaGudang, int kapasitas, String bahan, String alamat, String nomorTelepon) {
        super(namaGudang, kapasitas, bahan);
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    @Override
    public boolean cekStokMinimum(String namaBahan, int batasMinimum) {
        int stok = getStok(namaBahan);
        return stok < batasMinimum;
    }
}

