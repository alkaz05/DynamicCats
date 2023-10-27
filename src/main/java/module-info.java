module ipap.dynamiccats {
    requires javafx.controls;
    requires javafx.fxml;


    opens ipap.dynamiccats to javafx.fxml;
    exports ipap.dynamiccats;
}