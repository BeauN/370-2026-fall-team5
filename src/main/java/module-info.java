module com.example.splitdish {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.splitdish to javafx.fxml;
    exports com.example.splitdish;
}