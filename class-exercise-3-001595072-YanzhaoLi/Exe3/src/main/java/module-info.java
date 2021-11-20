module com.example.exe1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exe1 to javafx.fxml;
    exports com.example.exe1;
}