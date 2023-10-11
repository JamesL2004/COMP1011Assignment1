package com.example.comp1011assingment1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.ScatterChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChartViewController implements Initializable {

    @FXML
    private ScatterChart<?, ?> scatterChart;

    @FXML
    void changeToTableView(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "table-view.fxml" );
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

