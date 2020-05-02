/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.UTS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "kursusonline")
public class KursusOnline {
    @Id
    @Column(name = "pesertaid")
    private String PesertaID;
    
    @Column(name = "nama")
    private String Nama;
    
    @Column(name = "tanggallahir")
    private int TanggalLahir;
    
    @Column(name = "jumlahkursus")
    private String JumlahKursus;
    
    @Column(name = "rate")
    private String Rate;
    
    public KursusOnline(){
    }
    
    public KursusOnline(String PesertaID, String Nama, int TanggalLahir,String JumlahKursus, String Rate) {
        this.PesertaID = PesertaID;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.JumlahKursus = JumlahKursus;
        this.Rate = Rate;
    }

    public String getPesertaID() {
        return PesertaID;
    }

    public void setPesertaID(String PesertaID) {
        this.PesertaID = PesertaID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(int TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public String getJumlahKursus() {
        return JumlahKursus;
    }

    public void setJumlahKursus(String JumlahKursus) {
        this.JumlahKursus = JumlahKursus;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String Rate) {
        this.Rate = Rate;
    }
    
    
}
