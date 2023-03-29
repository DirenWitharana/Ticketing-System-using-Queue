module com.example.dsa_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.dsa_fx to javafx.fxml;
    exports com.example.dsa_fx;
}