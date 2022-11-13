package controller;

import entity.NguoiDung;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import repository.NguoiDungRepository;
import repository.*;
import view.main;

import java.io.IOException;

public class login_controller {

    @FXML
    private Label loginLabel;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button dangnhapButton;
    public NguoiDungRepository NguoiDungRepo = new NguoiDungRepository_impl();

    public void dangNhapButtonOnAction(ActionEvent event) throws IOException {
        if (username.getText().isBlank() == false && password.getText().isBlank() == false) {
            if (NguoiDungRepo.dangnhap(username.getText(), password.getText())) {
                Stage stage = (Stage) dangnhapButton.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("home_page.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("Quản lý bán hàng thiết bị y tế");
                stage.setScene(scene);
//                stage.setMaximized(true);
                stage.setWidth(1400);
                stage.setHeight(780);
                stage.setX(10);
                stage.setY(10);
                stage.show();
            } else {
                loginLabel.setText("Sai tài khoản hoặc mật khẩu");
            }
        } else {
            loginLabel.setText("Vui lòng nhập đầy đủ các trường");
        }
    }
}
