package com.example.splitdish;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ReceiptReviewController {
    @FXML
    private TextField restaurantNameField;

    @FXML
    private TextField taxField;

    @FXML
    private TextField totalField;

    @FXML
    private Button continueButton;

    @FXML
    private void onContinueClick() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("diner-view.fxml")
            );
            Scene scene = new Scene(loader.load(), 390, 700);
            Stage stage = (Stage)continueButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onAddClick() {

    }

    @FXML
    private void onEditClick() {

    }

    @FXML
    private void onDeleteClick(){

    }

}
