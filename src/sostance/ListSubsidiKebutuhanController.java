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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author arulh
 */
public class ListSubsidiKebutuhanController implements Initializable {
    @FXML
    private Button dashboard;
    
    @FXML
    private Button pengisianFormulir;
    
    @FXML
    private Button pengajuanBantuanSosial;
    
    @FXML
    private Button pengajuanBantuanModalUsaha;
    
    @FXML
    private Button listKebutuhanSubsisdi;
    
    @FXML
    private Button penyediaanModalTempatUsaha;
    
    @FXML
    private Button menu;
    
    @FXML
    private Button exit;
    
    @FXML
    private Button kembali;
    
    @FXML
    private Button selanjutnya;
    
    @FXML
    private Button setting;
    
    @FXML
    private TableColumn<SubsidiKebutuhan, String> tcnomor;
    
    
    @FXML
    private TableColumn<SubsidiKebutuhan, String> tcnamaBahan;
    
    @FXML
    private TableColumn<SubsidiKebutuhan, String> tcalamat;
    
    @FXML
    private TableColumn<SubsidiKebutuhan,String> tcstok;
    
    @FXML
    private TableView<SubsidiKebutuhan> tvlistKebutuhanSubsidi;
    
    SubsidiKebutuhanList data;
    
    
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        tcnomor.setCellValueFactory(new PropertyValueFactory<>("nomor"));
        tcnamaBahan.setCellValueFactory(new PropertyValueFactory<>("nama bahan"));
                tcstok.setCellValueFactory(new PropertyValueFactory<>("stok"));

        tcalamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        
        data = new SubsidiKebutuhanList();
        data.setDummy();
        tvlistKebutuhanSubsidi.setItems(data.getListData());
    }

}
