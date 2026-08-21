module ni.edu.uam.ejemplo_g1_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.ejemplo_g1_1 to javafx.fxml;
    exports ni.edu.uam.ejemplo_g1_1;
}