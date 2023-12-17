/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab1.Bab2.Bab3;

/**
 *
 * @author DzulF
 */
public class Keaktifan_Mahasiswa extends Penilaian {
    int nilai_keaktifan;
    
    public Keaktifan_Mahasiswa(){
        this.nilai_keaktifan = 0;
    }
    
    @Override
    double nilaiKeaktifan(){
        return ((nilai_keaktifan * 0.1) + nilaiAkhir());
    }
}
