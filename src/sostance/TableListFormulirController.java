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
 * @author Lenovo
 */
public class TableListFormulirController implements Initializable {
@FXML
    private TableView <IsiFormulir>tvDataf;
    
    @FXML 
    private TableColumn <IsiFormulir, String> tcPekerjaan;
    @FXML 
    private TableColumn <IsiFormulir, String> tcAgama;
    @FXML 
    private TableColumn <IsiFormulir, String> tcNamaLengkap;
    
    @FXML 
    private TableColumn <IsiFormulir, String> tcNIK;
    @FXML 
    private TableColumn <IsiFormulir, String> tcKK;
    
    @FXML 
    private TableColumn <IsiFormulir, String> tcAlamat;
    @FXML 
    private TableColumn <IsiFormulir, String> tcRadioButn;
    
    ObservableList <IsiFormulir> dataFormulir = FXCollections.observableArrayList();
    ListIsiFormulir datalistFormulir;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcPekerjaan.setCellValueFactory(new PropertyValueFactory <> ("pekerjaanm"));
        tcAgama.setCellValueFactory(new PropertyValueFactory <> ("Agamam"));
        tcNamaLengkap.setCellValueFactory(new PropertyValueFactory <> ("NamaLengkapm"));
        tcNIK.setCellValueFactory(new PropertyValueFactory <> ("NIKm"));
        tcKK.setCellValueFactory(new PropertyValueFactory <> ("KKm"));
        tcAlamat.setCellValueFactory(new PropertyValueFactory <> ("Alamatm"));
        tcRadioButn.setCellValueFactory(new PropertyValueFactory <> ("RadioButn"));
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream berkasMasuk;
        
        try{
            berkasMasuk = new FileInputStream ("ListTempatFormulir.xml");
            int isi;
            char c;
            String s = "";
            while ((isi = berkasMasuk.read()) != -1){
                c = (char) isi;
                s = s + c;
            }
            datalistFormulir = (ListIsiFormulir) xstream.fromXML(s);
            berkasMasuk.close();
        } catch (Exception e){
            System.err.println("Terjadi kesalahan " + e.getMessage());
        }
        tvDataf.setItems(datalistFormulir.getListDataFormulir());
        datalistFormulir.showData();
    }    
    
}
    
