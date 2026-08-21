module ni.edu.uam.calculadorasencilla {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ni.edu.uam.calculadorasencilla to javafx.fxml;
    exports ni.edu.uam.calculadorasencilla;
}