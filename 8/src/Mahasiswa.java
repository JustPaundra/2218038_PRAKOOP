/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 62821
 */
public class Mahasiswa {
    String nim, nama,JenisKelamin, prodi, angkatan,alamat;
    void dataNIM(String Nim){
        this.nim = Nim;
    }    
    void dataNama(String Nama){
        this.nama = Nama;
    }
    void dataJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }  
    void dataProdi(String Prodi){
        this.prodi = Prodi;
    }
    void dataAngkatan(String angkatan){
        this.angkatan = angkatan;
    }
    void dataAlamat(String alamat){
        this.alamat = alamat;
    }  
    
    String cetakNIM(){
        return nim;
    }
    String cetakNama(){
        return nama;
    }
    String cetakJenisKelamin(){
        return JenisKelamin;
    }
    String cetakProdi(){
        return prodi;
    }
    String cetakAngkatan(){
        return angkatan;
    }
    String cetakAlamat(){
        return alamat;
    }
}
