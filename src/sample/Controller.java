package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public void loginButtonClicked() {
        System.out.println("User logged in");
    }


    // this is called as soon as the view loads
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading user data");
    }
}
