/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifianjoe.latihanmvc.controller;

import edu.rifianjoe.latihanmvc.model.PelangganModel;
import edu.rifianjoe.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 * Nama : Rifian Joe Premilenio
 * NIM : 10118013
 * Kelas : IF-01
 * @author Rifian
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelepon = view.getTxtTelepon().getText();
        
        if (nama.equals("") && email.equals("") && noTelepon.equals("")){
            
        } else {
            
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelepon = view.getTxtTelepon().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong"); 
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong"); 
        } else if (noTelepon.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No. Telepon Masih Kosong"); 
        } else {
            model.simpanForm();
        }
            
        {
            
        }
        
    }
}
