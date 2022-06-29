/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package sostance;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
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
       
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcKebutuhan.setCellValueFactory(new PropertyValueFactory<>("Kebutuhan"));
        tcAksi.setCellValueFactory(new PropertyValueFactory<>("Kebutuhan"));

        data = new DataKebutuhanList();
        tvKebutuhan.setItems(data.getData());
    }    
    
}
