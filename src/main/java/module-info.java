module com.example.hwl3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hwl3 to javafx.fxml;
    exports com.example.hwl3;
}