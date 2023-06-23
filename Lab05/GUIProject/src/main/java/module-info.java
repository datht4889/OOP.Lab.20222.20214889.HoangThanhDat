module com.example.guiproject {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.guiproject;
    opens com.example.guiproject to javafx.fxml;
}