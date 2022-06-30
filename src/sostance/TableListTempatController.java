/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sostance;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ROG
 */
public class TableListTempatController implements Initializable {

    @FXML
    private Button edit;
    
    @FXML
    private TableView <IsiTempatUsaha>tvData;
    
    @FXML 
    private TableColumn <IsiTempatUsaha, String> tcProvinsi;
    
    @FXML 
    private TableColumn <IsiTempatUsaha, String> tcKabupaten;
    
    @FXML 
    private TableColumn <IsiTempatUsaha, String> tcKota;
    
    @FXML 
    private TableColumn <IsiTempatUsaha, String> tcKecamatan;
    
    @FXML 
    private TableColumn <IsiTempatUsaha, String> tcKelurahan;
    
    @FXML 
    private TableColumn <IsiTempatUsaha, String> tcAlamat;
    
    @FXML
    private TableColumn <IsiTempatUsaha, String> tcTipe;
    
    ObservableList <IsiTempatUsaha> dataTempat = FXCollections.observableArrayList();
    
    ListIsiTempatUsaha dataListTempat;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcProvinsi.setCellValueFactory(new PropertyValueFactory <> ("provinsi"));
        tcKabupaten.setCellValueFactory(new PropertyValueFactory <> ("kabupaten"));
        tcKota.setCellValueFactory(new PropertyValueFactory <> ("kota"));
        tcKecamatan.setCellValueFactory(new PropertyValueFactory <> ("kecamatan"));
        tcKelurahan.setCellValueFactory(new PropertyValueFactory <> ("kelurahan"));
        tcAlamat.setCellValueFactory(new PropertyValueFactory <> ("alamat"));
        tcTipe.setCellValueFactory(new PropertyValueFactory <> ("tipe"));
        
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream berkasMasuk;
        try{
            berkasMasuk = new FileInputStream ("ListTempatUsaha.xml");
            int isi;
            char c;
            String s = "";
            while ((isi = berkasMasuk.read()) != -1){
                c = (char) isi;
                s = s + c;
            }
            dataListTempat = (ListIsiTempatUsaha) xstream.fromXML(s);
            berkasMasuk.close();
        } catch (Exception e){
            System.err.println("Terjadi kesalahan " + e.getMessage());
        }
        tvData.setItems(dataListTempat.getListDataTempat());
        dataListTempat.showData();
    }    
    
}
