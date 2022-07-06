/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package sostance;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author arulh
 */
public class WaitFormController implements Initializable {
    DataKebutuhanList data;
    ArrayList<IsiKebutuhan> simpanKebutuhan = new ArrayList<>();
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tfKebutuhan;
    
    @FXML
    private TextField tfNo;
    
    @FXML
    private TextField tfEditKebutuhan;
    
    @FXML
    private TextField tfAksi;
    
    @FXML
    private TableColumn<DataKebutuhan, String> tcKebutuhan;
    
    @FXML
    private TableColumn<DataKebutuhan, String> tcAksi;
    
    @FXML
    private TableView<DataKebutuhan> tvKebutuhan;
    
    ObservableList DataFormulir = observableArrayList();
    ArrayList<IsiFormulir> SimpanFormulir = new ArrayList<>();
    XStream xstream = new XStream(new StaxDriver());
    
    
    
    void simpanData() {
        String xml = xstream.toXML(SimpanFormulir);
        FileOutputStream outDoc;
        try {
            byte[] data = xml.getBytes("UTF-8");
            outDoc = new FileOutputStream("ListKebutuhan.xml");
            outDoc.write(data);
            outDoc.close();
        } catch (Exception io) {
            System.err.println("An error occurs: " + io.getMessage());
        }
        System.out.println("Data sudah disimpan");
    }
        @FXML
    private void ButtonSimpan(ActionEvent event) throws IOException {
    XStream xstream = new XStream(new StaxDriver());
        
    
        String kebutuhan = tfKebutuhan.getText();
        String aksi = tfAksi.getText();
        
        
        System.out.println(kebutuhan);
        System.out.println(aksi);
        
        
        simpanKebutuhan.add(new IsiKebutuhan(kebutuhan, aksi));
        
        String xml = xstream.toXML(simpanKebutuhan);
        FileOutputStream outDoc;
        try{
            byte[]data = xml.getBytes("UTF-8");
            outDoc = new FileOutputStream("ListKebutuhan.xml");
            outDoc.write(data);
            outDoc.close();
        } catch(Exception io){
            System.err.println("An error occurs: " + io.getMessage());
        }
        System.out.println("Data sudah disimpan");
        
        
       
        data.setData(kebutuhan, aksi);
        tvKebutuhan.setItems(data.getData());
        System.out.println("Sukses menambahkan kebutuhan");

    }
    
    @FXML
    private void buttonTambah(ActionEvent event) {
       String kebutuhan = tfKebutuhan.getText();
       String aksi = tfAksi.getText();
       
       data.setData(kebutuhan, aksi);
       tvKebutuhan.setItems(data.getData());
        System.out.println("Sukses menambahkan kebutuhan");
    }
    
    
    @FXML
    private void buttonEdit(ActionEvent event) {
       
    }
    
    @FXML
    private void buttonDelete(ActionEvent event) {
       TableView.TableViewSelectionModel selectionModel = tvKebutuhan.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.SINGLE);
        int i = selectionModel.getSelectedIndex();

        if (i >= 0) {
            DataFormulir.remove(i);
            SimpanFormulir.remove(i);
        }
        
        simpanData();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcKebutuhan.setCellValueFactory(new PropertyValueFactory<>("Kebutuhan"));
        tcAksi.setCellValueFactory(new PropertyValueFactory<>("Kebutuhan"));

        data = new DataKebutuhanList();
        tvKebutuhan.setItems(data.getData());
        
        simpanData();
        
        for (int i = 0; i < SimpanFormulir.size(); i++) {
            DataFormulir.add(SimpanFormulir.get(i));
        }
        
        tvKebutuhan.setItems(DataFormulir);
            
        
    }    
    
}
