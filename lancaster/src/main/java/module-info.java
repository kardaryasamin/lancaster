module com.example.lancaster {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lancaster to javafx.fxml;
    exports com.example.lancaster;
}