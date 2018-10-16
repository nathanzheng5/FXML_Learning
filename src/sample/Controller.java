package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button showDialogButton;
    public ToggleGroup toggleGroup;

    public void loginButtonClicked() {
        System.out.println("User logged in");
    }


    // this is called as soon as the view loads
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading user data");
    }

    public void showDialog(ActionEvent actionEvent) {
        try {
            final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dialog.fxml"));
            final Parent root = fxmlLoader.load();
            final DialogController dialogController = fxmlLoader.getController();
            dialogController.textProperty().addListener((observable, oldValue, newValue) -> {
                System.out.println("dialog text = " + newValue);
            });

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("ABC");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void toggleButtonClicked(ActionEvent actionEvent) {
        final Toggle selectedToggle = toggleGroup.getSelectedToggle();
        System.out.println("Selected toggle " + selectedToggle);
        System.out.println("Selected ? " + (selectedToggle == null ? "No" : "Yes"));
    }
}
