/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DzulF
 */
public class HitungLimas {
    private int luasalas;
    public int tinggi;
    double volume;
    
    public HitungLimas (){
        luasalas = this.luasalas;
        tinggi = this.tinggi;
        volume = this.volume;
    }
    
    public int getLuasalas(){
        return luasalas;}
    
    public void setLuasalas(int luasalas){
        this.luasalas = luasalas;}
    
    public int getTinggi(){
        return tinggi;}
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;}
    
    public double volumeLimas(){
        volume =  luasalas * tinggi * 1 / 3;
        return volume;}
}
