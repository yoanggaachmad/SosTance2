/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package sostance;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.chart.PieChart;
import javafx.collections.ObservableList;

/**
 *
 * @author arulh
 */
public class FormController implements Initializable {
    ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
    
    @FXML
    private PieChart miski;
    
    @FXML
    private void dashboard(ActionEvent event) {
        System.out.println("kldfljdf");
    }
    
    private void form(ActionEvent event) {
       
    }
    
    private void bansos(ActionEvent event) {
       
    }
    
    private void modal(ActionEvent event) {
       
    }
    
    private void list(ActionEvent event) {
       
    }
    
    private void tempat(ActionEvent event) {
       
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data.add(new PieChart.Data("2010",2880));
        data.add(new PieChart.Data("2011",3230));
        data.add(new PieChart.Data("2012",3580));
        data.add(new PieChart.Data("2013",3850));
        data.add(new PieChart.Data("2014",4250));
        
        miski.setData(data);
    }    
    
}
