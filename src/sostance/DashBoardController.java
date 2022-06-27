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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


/**
 *
 * @author Lenovo
 */
public class DashBoardController implements Initializable {
    
    @FXML
    BorderPane mainPane;
    
   @FXML
    private void DashboardButtonAction(ActionEvent event) {
       
    }
    
    @FXML
    private void PengisianButtonAction(ActionEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("Form");
        mainPane.setCenter(halaman);
        mainPane.requestFocus();
    }
    
    @FXML
    private void BansosButtonAction(ActionEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("BantuanSosial");
        mainPane.setCenter(halaman);
        mainPane.requestFocus();
    }
    
    @FXML
    private void modalButtonAction(ActionEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("ModalTempatUsaha");
        mainPane.setCenter(halaman);
        mainPane.requestFocus();
    }
    
    @FXML
    private void ListButtonAction(ActionEvent event) {
       
    }
    
    @FXML
    private void penyediaanButtonAction(ActionEvent event) {
       
    }
    
    @FXML
    private void FormulirAction(ActionEvent event) {
       
    }
    
    @FXML
    private void DashboardPengajuanAction(ActionEvent event) {
       
    }
    
    @FXML
    private void DashboardListAction(ActionEvent event) {
       
    }
    
    @FXML
    private void DashboardmodalAction(ActionEvent event) {
       
    }
    
    @FXML
    private void DashboardtmptAction(ActionEvent event) {
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
