/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Dzuna
 */
class Mahasiswa {
    String dataNIM, dataNama, dataJenisKelamin, dataProdi, dataAngkatan, dataAlamat;
    
    void dataNIM(String text) {
        dataNIM = text;
    }

    void dataNama(String text) {
        dataNama = text;}

    void dataJenisKelamin(String text) {
        dataJenisKelamin = text;}

    void dataProdi(String text) {
        dataProdi = text;}

    void dataAngkatan(String text) {
        dataAngkatan = text;}

    void dataAlamat(String text) {
        dataAlamat = text;}

    String cetakNIM() {
        return dataNIM;}

    String cetakNama() {
        return dataNama;}

    String cetakJenisKelamin() {
        return dataJenisKelamin;}

    String cetakProdi() {
        return dataProdi;}

    String cetakAlamat() {
        return dataAlamat ;}

    String cetakAngkatan() {
        return dataAngkatan;}
    
}
