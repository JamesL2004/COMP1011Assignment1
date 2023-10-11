package com.example.comp1011assingment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    @FXML
    private TableColumn<Platform, String> availibleCountriesColumn;

    @FXML
    private TableColumn<Platform, Integer> idColumn;

    @FXML
    private TableColumn<Platform, Integer> numOfSubsColumn;

    @FXML
    private TableColumn<Platform, String> parentCompanyColumn;

    @FXML
    private TableColumn<Platform, Double> priceColumn;

    @FXML
    private TableView<Platform> tableView;

    @FXML
    private TableColumn<Platform, String> titleColumn;

    @FXML
    void changeToChartsView(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "chart-view.fxml" );
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        availibleCountriesColumn.setCellValueFactory(new PropertyValueFactory<>("availibleCountries"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("platformId"));
        numOfSubsColumn.setCellValueFactory(new PropertyValueFactory<>("subCount"));
        parentCompanyColumn.setCellValueFactory(new PropertyValueFactory<>("parentCompany"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        try {
            tableView.getItems().addAll(DBUtility.getPlatforms());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

