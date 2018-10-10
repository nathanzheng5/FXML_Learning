package sample;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * TODO: CLASS JAVA DOC HERE
 */
public class DialogController implements Initializable {
    public Label dialogLabel;
    public Button dialogButton;
    public TextField dialogTextField;

    private ReadOnlyObjectWrapper<String> text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        text = new ReadOnlyObjectWrapper<>();
    }

    public String getText() {
        return text.get();
    }

    public ReadOnlyObjectWrapper<String> textProperty() {
        return text;
    }

    public void buttonClicked(ActionEvent actionEvent) {
        System.out.println("button clicked");
        Stage stage = (Stage) dialogButton.getScene().getWindow();
        text.setValue(dialogTextField.getText());
        stage.close();
    }

    @FXML
    void setText(ActionEvent actionEvent) {
//        text.setValue(dialogTextField.getText());
    }
}
