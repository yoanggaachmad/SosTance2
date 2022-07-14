/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package sostance;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class DashBoardController implements Initializable {

    @FXML
    BorderPane mainPane;

    @FXML
    private AnchorPane ap;

    @FXML
    private void DashboardButtonAction(ActionEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("DB2");
        mainPane.setCenter(halaman);
        mainPane.requestFocus();

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
        Pane halaman = object.getPane("WaitForm");
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
    private void ListSubsidiKebutuhan(ActionEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("ListSubsidiKebutuhan");
        mainPane.setCenter(halaman);
        mainPane.requestFocus();
    }

    @FXML
    private void DashboardtmptAction(ActionEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("ModalTempatUsaha");
        mainPane.setCenter(halaman);
        mainPane.requestFocus();
    }

    @FXML
    private void close(ActionEvent event) {
        Stage stage = (Stage) ap.getScene().getWindow();

        Alert.AlertType type = Alert.AlertType.CONFIRMATION;
        Alert alert = new Alert(type, "");
        alert.setTitle("Pemberitahuan !");

        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setContentText("Tekan Ok untuk keluar/Cancel untuk membatalkan");
        alert.getDialogPane().setHeaderText("Anda yakin ingin keluar dari aplikasi ini?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            Platform.exit();
            System.out.println("Anda berhasil keluar aplikasi");
            
        } else if (result.get() == ButtonType.CANCEL) {
            System.out.println("Batal keluar aplikasi");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
