/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sostance;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author asus
 */
public class SubsidiKebutuhan {
    
    private SimpleStringProperty nomor;
    private SimpleStringProperty namaBahan;
    private SimpleStringProperty stok;
    private SimpleStringProperty alamatPengambilan;
    
    public SubsidiKebutuhan(){
        this("", "", "", "");
    }
    public SubsidiKebutuhan(String nomor, String namaBahan, String stok, String alamatPengambilan){
        this.nomor = new SimpleStringProperty(nomor);
        this.namaBahan = new SimpleStringProperty(namaBahan);
        this.stok = new SimpleStringProperty(stok);
        this.alamatPengambilan = new SimpleStringProperty(alamatPengambilan);

    }

    public String getNomor() {
        return nomor.get();
    }

    public String setNomor(String n) {
        this.nomor.set(n);
        return null;
    }

    public String getNamaBahan() {
        return namaBahan.get();
    }

    public String setNamaBahan(String nb) {
        this.namaBahan.set(nb);
        return null;
    }

    public String getStok() {
        return stok.get();
    }

    public String setStok(String s) {
        this.stok.set(s);
        return null;
    }

    public String getAlamatPengambilan() {
        return alamatPengambilan.get();
    }

    public String setAlamatPengambilan(String ap) {
        this.alamatPengambilan.set(ap);
        return null;
    }



    
    
    
}
