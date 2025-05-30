package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private ComboBox<String> categoryBox;

    @FXML
    private TableColumn<Data, String> categoryCol;

    @FXML
    private TextArea commentArea;

    @FXML
    private TableColumn<Data, String> commentCol;

    @FXML
    private TableView<Data> dataTable;

    @FXML
    private TableColumn<Data, Date> dateCol;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<Data, Integer> idCol;

    @FXML
    private TableColumn<Data, String> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<Data, Integer> priceCol;

    @FXML
    private TextField priceField;

    private ArrayList<Data> data = new ArrayList<>();

    @FXML
    void initialize() throws FileNotFoundException{
        data = FileHandler.readFile();
        this.initTable();
        this.initComboBox();
    }

    @FXML
    void addNewRecord(ActionEvent event) throws IOException {
        String category = this.categoryBox.getSelectionModel().getSelectedItem();
        int id = data.get(data.size()-1).getId()+1;
        String chefName = this.nameField.getText();
        LocalDate localdate = this.datePicker.getValue();
        Date date = Date.valueOf(localdate);
        int price = Integer.parseInt(this.priceField.getText());
        String comment = this.commentArea.getText();
        data.add(new Data(id,chefName,date,category,price,comment));
        FileHandler.writeFile(data);
    }

    void initTable() {
        this.idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.nameCol.setCellValueFactory(new PropertyValueFactory<>("chefname"));
        this.dateCol.setCellValueFactory(new PropertyValueFactory<>("datum"));
        this.categoryCol.setCellValueFactory(new PropertyValueFactory<>("kategoria"));
        this.priceCol.setCellValueFactory(new PropertyValueFactory<>("osszeg"));
        this.commentCol.setCellValueFactory(new PropertyValueFactory<>("megjegyzes"));
        ObservableList<Data> obsData = FXCollections.observableArrayList(data);
        this.dataTable.getItems().setAll(obsData);
    }
    void initComboBox() {
        this.categoryBox.getItems().setAll("Travel","Ingredients","Accomodation","Equipment","Other");
    }

}
