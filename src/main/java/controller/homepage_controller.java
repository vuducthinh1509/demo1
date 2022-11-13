package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import lombok.SneakyThrows;
import view.main;

import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;


public class homepage_controller implements Initializable {
    @FXML
    private BorderPane borderPane;

    @FXML
    private Pane titlePane;

    @FXML
    private Label titleText;

    @FXML
    private Button homePageButton;

    @FXML
    private Button storageButton;

    @FXML
    private Button exportButton;

    @FXML
    private Button repairButton;

    @FXML
    private Button maintenanceButton;

    @FXML
    private Button managementButton;

    @FXML
    private Button logOutButton;

    @FXML
    private Pane mainPane;

    @SneakyThrows
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Pane trangChuPane =  FXMLLoader.load(main.class.getResource("login_page.fxml"));
        mainPane.getChildren().add(trangChuPane);
    }

}
