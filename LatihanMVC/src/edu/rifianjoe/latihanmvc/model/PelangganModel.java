/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifianjoe.latihanmvc.model;

import edu.rifianjoe.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 * Nama : Rifian Joe Premilenio
 * NIM : 10118013
 * Kelas : IF-01
 * @author Rifian
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String noTelepon;
    
    private PelangganListener pelangganlistener;

    public PelangganListener getPelangganlistener() {
        return pelangganlistener;
    }

    public void setPelangganlistener(PelangganListener pelangganlistener) {
        this.pelangganlistener = pelangganlistener;
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganlistener!=null) {
            pelangganlistener.onChange(this);
            
        }
        
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelepon("");
        
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
        
    }
    
}
