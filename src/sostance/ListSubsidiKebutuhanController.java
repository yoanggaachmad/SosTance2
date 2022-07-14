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
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author arulh
 */
public class ListSubsidiKebutuhanController implements Initializable {

    @FXML
    BorderPane mainPane;

    XStream xs = new XStream(new StaxDriver());
    ArrayList<Data> tvList = new ArrayList<>();

    ObservableList dataAll = observableArrayList();
    ObservableList<PieChart.Data> data = FXCollections.observableArrayList();

    @FXML
    private PieChart pcSubsidiKebutuhan;
    
    @FXML
    private ComboBox cbalamat;

    @FXML
    private Button kembali;

    @FXML
    private Button selanjutnya;

    @FXML
    private ImageView ivSubsidi;

    @FXML
    private TableColumn<SubsidiKebutuhan, String> tcnomor;

    @FXML
    private TableColumn<SubsidiKebutuhan, String> tcnamaBahan;

    @FXML
    private TableColumn<SubsidiKebutuhan, String> tcalamat;

    @FXML
    private TableColumn<SubsidiKebutuhan, String> tcstok;

    @FXML
    private TableView<SubsidiKebutuhan> tvlistKebutuhanSubsidi;

    SubsidiKebutuhanList data1;

//    @FXML
//    private void handleKurangAction(ActionEvent){
//        data.remove(3);
//        System.out.println("KurangButton is Clicked");
//    }
    void bukaXML2() {
        FileInputStream input = null;
        try {
            input = new FileInputStream("listData.xml");
            int isi;
            char charnya;
            String stringnya;
            stringnya = "";
            while ((isi = input.read()) != -1) {
                charnya = (char) isi;
                stringnya = stringnya + charnya;
            }
            tvList = (ArrayList<Data>) xs.fromXML(stringnya);
            System.out.println(tvList.size());
        } catch (Exception e) {
            System.err.println("test: " + e.getMessage());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    void saveXml() {
        ArrayList<Data> data = new ArrayList<>();

        data.add(new Data("beras", "10 karung", "Banguntapan", "Bantul"));
        data.add(new Data("minyak", "15 liter", "Banguntapan", "Bantul"));
        data.add(new Data("minyak", "25 liter", "Imogiri", "Bantul"));
        data.add(new Data("beras", "17 karung", "Imogiri", "Bantul"));
        data.add(new Data("gula", "25 kg", "Parangtritis", "Bantul"));
        data.add(new Data("beras", "25 karung", "Parangtritis", "Bantul"));

        data.add(new Data("telur", "20 lusin", "Malioboro", "Yogyakarta"));
        data.add(new Data("beras", "20 karung", "Malioboro", "Yogyakarta"));
        data.add(new Data("beras", "12 karung", "Jalan Magelang", "Yogyakarta"));
        data.add(new Data("minyak", "28 karung", "Jalan Magelang", "Yogyakarta"));
        data.add(new Data("beras", "19 karung", "Kota Baru", "Yogyakarta"));
        data.add(new Data("gula", "10 kg", "Kota Baru", "Yogyakarta"));
        data.add(new Data("beras", "28 karung", "Kota Lama", "Yogyakarta"));
        data.add(new Data("minyak", "17 liter", "Kota Lama", "Yogyakarta"));

        data.add(new Data("minyak", "25 liter", "Kaliurang", "Sleman"));
        data.add(new Data("telur", "25 lusin", "Kaliurang", "Sleman"));
        data.add(new Data("beras", "28 karung", "Gamping", "Sleman"));
        data.add(new Data("gula", "28 kg", "Gamping", "Sleman"));
        data.add(new Data("beras", "28 karung", "Gamping", "Sleman"));
        data.add(new Data("gula", "14 kg", "Godean", "Sleman"));
        data.add(new Data("beras", "28 karung", "Godean", "Sleman"));

        data.add(new Data("beras", "25 karung", "Wates", "Kulon Progo"));
        data.add(new Data("gula", "25 kg", "Wates", "Kulon Progo"));
        data.add(new Data("beras", "15 karung", "Lendah", "Kulon Progo"));
        data.add(new Data("minyak", "25 liter", "Kali Bawang", "Kulon Progo"));
        data.add(new Data("beras", "23 karung", "Kali Bawang", "Kulon Progo"));
        data.add(new Data("beras", "35 karung", "Temon", "Kulon Progo"));

        XStream xSt = new XStream(new StaxDriver());
        String xml = xSt.toXML(data);
        FileOutputStream output = null;
        try {
            output = new FileOutputStream("listData.xml");
            byte[] bytes = xml.getBytes("UTF-8");
            output.write(bytes);
        } catch (Exception e) {
            System.err.println("Perhatian: " + e.getMessage());
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @FXML
    void masukAlamat() {

        System.out.println(cbalamat.getValue());
        System.out.println(tvList.size());
        for (int i = 0; i < tvList.size(); i++) {

//            dataAll.add(((IdeBisnis) tv.get(i)));
            Data x = (Data) tvList.get(i);
            String y = x.getAlamat();
            if (cbalamat.getValue().equals("Sleman")) {
                if (tvList.get(i).getKota().equals("Sleman")) {
                    dataAll.clear();

                    for (Data data2 : tvList) {
                        if (data2.getKota().equals("Sleman")) {
                            dataAll.add(data2);

                        }
                    }

                }
            } else if (cbalamat.getValue().equals("Yogyakarta")) {
                if (tvList.get(i).getKota().equals("Yogyakarta")) {
                    dataAll.clear();
                    for (Data data2 : tvList) {
                        if (data2.getKota().equals("Yogyakarta")) {
                            dataAll.add(data2);

                        }

                    }

                }
            } else if (cbalamat.getValue().equals("Bantul")) {
                if (tvList.get(i).getKota().equals("Bantul")) {
                    dataAll.clear();
                    for (Data data2 : tvList) {
                        if (data2.getKota().equals("Bantul")) {
                            dataAll.add(data2);

                        }
                    }

                }
            } else if (cbalamat.getValue().equals("Kulon Progo")) {
                if (tvList.get(i).getKota().equals("Kulon Progo")) {
                    dataAll.clear();
                    for (Data data2 : tvList) {
                        if (data2.getKota().equals("Kulon Progo")) {
                            dataAll.add(data2);

                        }
                    }

                }
            }

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bukaXML2();
        saveXml();
//        masukAlamat();
        System.out.println(tvList.size());
        data.add(new PieChart.Data("2010", 2880));
        data.add(new PieChart.Data("2011", 3230));
        data.add(new PieChart.Data("2012", 3580));
        data.add(new PieChart.Data("2013", 3850));
        data.add(new PieChart.Data("2014", 4250));
        pcSubsidiKebutuhan.setData(data);

//            String y = x.getKategori();
//            switch (y) {
//                case "Kuliner":
//                    dataKuliner.add((IdeBisnis) ib.get(i));
//                    break;
//                case "Fashion":
//                    dataFashion.add((IdeBisnis) ib.get(i));
//                    break;
//                case "Kerajinan":
//                    dataKerajinan.add((IdeBisnis) ib.get(i));
//                    break;
//                case "Agrobisnis":
//                    dataAgro.add((IdeBisnis) ib.get(i));
//                    break;
//            }
        cbalamat.setValue("");
        cbalamat.getItems().addAll("Sleman", "Yogyakarta", "Bantul", "Kulon Progo");

//        // TODO
//
        tcnamaBahan.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tcstok.setCellValueFactory(new PropertyValueFactory<>("banyak"));
        tcalamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));

//        data1 = new SubsidiKebutuhanList();
//        data1.setDummy();
        tvlistKebutuhanSubsidi.setItems(dataAll);
//        
//    
    }

}
