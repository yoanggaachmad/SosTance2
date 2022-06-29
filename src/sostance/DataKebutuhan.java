/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sostance;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author arulh
 */
public class DataKebutuhan {
    private SimpleStringProperty kebutuhan;
    private SimpleStringProperty aksi;
    
    public DataKebutuhan(){
        this("","");
    }

    public DataKebutuhan(String kebutuhan, String aksi) {
        this.kebutuhan = new SimpleStringProperty (kebutuhan);
        this.aksi = new SimpleStringProperty (aksi);
    }
    
    public String getKebutuhan(){
        return kebutuhan.get();
    }
    
    public void setKebutuhan(String Kb){
        this.kebutuhan.set(Kb);
    }
    
    public String getAksi(){
        return aksi.get();
    }
    
    public void setAksi(String action){
        this.aksi.set(action);
    }
    
}
