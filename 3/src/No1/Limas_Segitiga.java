/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No1;

/**
 *
 * @author DzulF
 */
public class Limas_Segitiga extends Segitiga {
    double tinggiLimas, vol;
    
    double volumeLimas(){
        vol = ((0.333 * Luas()) * tinggiLimas);
        return vol;
    }
}
