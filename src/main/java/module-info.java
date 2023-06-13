module com.example.encryptor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.encryptor to javafx.fxml;
    exports com.example.encryptor;
}