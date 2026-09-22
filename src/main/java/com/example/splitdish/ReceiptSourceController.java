package com.example.splitdish;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import java.io.File;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class ReceiptSourceController {
    @FXML
    private ImageView receiptImageView;

    @FXML
    private Button continueButton;

    @FXML
    protected void onUploadClick() {
        FileChooser fileChooser = new FileChooser();

        //restricting the file extension types
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(
                "Image Files",
                "*.png", "*.jpg", "*.jpeg"
            )
        );

        Stage stage = (Stage) receiptImageView.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if(selectedFile != null) {
            System.out.println(selectedFile.getAbsolutePath());

            //converting the file to something setImage understands
            Image image = new Image(selectedFile.toURI().toString());
            //setting the image
            receiptImageView.setImage(image);

            //allow the user to continue if the image selected is correct
            continueButton.setDisable(false);
        }
    }

}
