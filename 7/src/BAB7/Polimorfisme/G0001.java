/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author DzulF
 */
public class G0001 extends Pembayaran{
    public String name, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public G0001(){
        this.name="Wijianto";
        this.kode="G0001";
        this.saldo=500000;
        this.alamat="Batu, Jl. Singosari no 22";}
    

    @Override
    double cekKode(String input) {
        if (input.compareTo(kode)==0){
            diskon = 0.2;
        } else {
            diskon = 0;
        } return diskon;}

    @Override
    double hitPembayaran(double bayar) {
        diskon = bayar * diskon;
        total = bayar - diskon;
        return diskon;}
    
    double potSaldo(){
    return this.saldo-total;}

    @Override
    void tampilkanMember() {
        System.out.println("Member G0001 dengan diskon 10%");}
}
