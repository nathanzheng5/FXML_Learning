package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {

    public Button button;

    public void handleButtonClick() {
        System.out.println("button is clicked");
        button.setText("I'm clicked");
    }
}
