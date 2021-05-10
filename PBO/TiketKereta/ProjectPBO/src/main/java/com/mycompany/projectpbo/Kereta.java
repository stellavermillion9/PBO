/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectpbo;

/**
 *
 * @author USER
 */
public class Kereta{
        private String nama;
        private int harga, jumlah;
        
        //getter
        public String getNama(){
            return nama;
        }
        
        public int getHarga(){
            return harga;
        }
        
        public int getJumlah(){
            return jumlah;
        }
        
        //setter
        public void setNama(String nama){
            this.nama = nama;
        }
        
        public void setHarga(int harga){
            this.harga = harga;
        }
        
        public void setJumlah(int jumlah){
            this.jumlah = jumlah;
        }
    }
