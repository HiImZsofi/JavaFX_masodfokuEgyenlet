module com.example.javafx_hazi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_hazi to javafx.fxml;
    exports com.example.javafx_hazi;
}