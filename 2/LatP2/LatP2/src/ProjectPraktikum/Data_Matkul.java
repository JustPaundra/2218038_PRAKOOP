/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum;

/**
 *
 * @author DzulF
 */
public class Data_Matkul {
    String kode_mk,nama_mk,dosen_pengampu;
    int jml_sks;    
    
    public Data_Matkul(String kd, String mk, String dsn, int jmlsks){ 
        this.kode_mk = mk;
        this.nama_mk = kd;
        this.dosen_pengampu = dsn;
        this.jml_sks = jmlsks;
    }
}
