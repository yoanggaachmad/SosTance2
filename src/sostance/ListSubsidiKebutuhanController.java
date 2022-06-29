/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package sostance;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
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
//    ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();

    @FXML
    private PieChart pcSubsidiKebutuhan;
    
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
    
    SubsidiKebutuhanList data1;
    
    
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
//        data.add(new PieChart.Data)("HatckBack", 40));
data.add(new PieChart.Data("2010",2880));
        data.add(new PieChart.Data("2011",3230));
        data.add(new PieChart.Data("2012",3580));
        data.add(new PieChart.Data("2013",3850));
        data.add(new PieChart.Data("2014",4250));
        
                pcSubsidiKebutuhan.setData(data);

        
        System.out.println("TambahButton is Clicked");
    }
//    @FXML
//    private void handleKurangAction(ActionEvent){
//        data.remove(3);
//        System.out.println("KurangButton is Clicked");
//    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data.add(new PieChart.Data("Sedan", 50));
        // TODO

        tcnomor.setCellValueFactory(new PropertyValueFactory<>("nomor"));
        tcnamaBahan.setCellValueFactory(new PropertyValueFactory<>("nama bahan"));
                tcstok.setCellValueFactory(new PropertyValueFactory<>("stok"));

        tcalamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        
        data1 = new SubsidiKebutuhanList();
        data1.setDummy();
        tvlistKebutuhanSubsidi.setItems(data1.getListData());
    }

}
