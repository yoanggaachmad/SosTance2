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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author ROG
 */
public class LoginSostanceController implements Initializable {

    @FXML
    private BorderPane mainPane;

    @FXML
    private TextField tfUsername;

    @FXML
    private TextField tfPassword;

    @FXML
    private Button btMasuk;

    @FXML
    private ImageView ivBackground;

    @FXML
    private void handleActionMasuk(ActionEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("DashBoard");
        mainPane.setCenter(halaman);
        mainPane.requestFocus();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
