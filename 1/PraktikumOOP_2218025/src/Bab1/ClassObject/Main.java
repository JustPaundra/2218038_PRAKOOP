/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1.ClassObject;

/**
 *
 * @author DzulF
 */
public class Main {
    public static void main(String[] args){
        // membuat objek
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama Kendaraan\t: " + mobil.nama);
        System.out.println("Warna Kendaraan\t: " + mobil.warna);
        System.out.println("Merek Kendaraan\t: " + mobil.merk);
        System.out.println("Jumlah Roda\t: " + mobil.jmlRoda(4) + "\n");
        System.out.println("Cara kendaraan bergerak : ");
        System.out.println("Saat maju : ");
        mobil.KendaraanMaju();
        System.out.println("Saat mundur : ");
        mobil.KendaraanMundur();
        System.out.println("Saat berhenti : ");
        mobil.KendaraanBerhenti();
    }
}
