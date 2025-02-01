module com.example.caesar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.caesar to javafx.fxml;
    exports com.example.caesar;
}