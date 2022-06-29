/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sostance;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author asus
 */
public class SubsidiKebutuhanList {
    private ObservableList<SubsidiKebutuhan> listData;
    
    public SubsidiKebutuhanList(){
        listData = FXCollections.observableArrayList();
    }

    public ObservableList<SubsidiKebutuhan> getListData() {
        return listData;
    }

    public void setData(String nomor, String namaBahan, String stok, String alamatPengambilan){
        listData.add(new SubsidiKebutuhan(nomor, namaBahan, stok, alamatPengambilan));
        
    }
    
    public void setDummy(){
        listData.add(new SubsidiKebutuhan("1", "Beras", "10 karung", "Condong Catur,Sleman"));
        listData.add(new SubsidiKebutuhan("2", "Minyak Goreng", "10 kardus", "Condong Catur,Sleman"));

    }
    
}
