package com.example.comp1011assingment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TableViewController {

    @FXML
    private TableColumn<?, ?> availibleCountriesColumn;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> numOfSubsColumn;

    @FXML
    private TableColumn<?, ?> parentCompanyColumn;

    @FXML
    private TableColumn<?, ?> priceColumn;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> titleColumn;

    @FXML
    void changeToChartsView(ActionEvent event) {

    }

}

