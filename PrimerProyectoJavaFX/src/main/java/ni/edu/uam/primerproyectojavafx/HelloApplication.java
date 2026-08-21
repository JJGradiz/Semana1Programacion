package ni.edu.uam.primerproyectojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();

        root.setPadding(new Insets(20));
        root.setSpacing(10);

        Label lblTitulo = new Label("Bienvenido a mi primer programa de escritorio");
        root.getChildren().add(lblTitulo);
        Label lblName = new Label("Dime tu Nombre");
        root.getChildren().add(lblName);
        TextField txtName = new TextField();
        root.getChildren().add(txtName);
        Button btnGuardar = new Button("Guardar");
        root.getChildren().add(btnGuardar);

        Scene scene = new Scene(root, 400, 250);
        stage.setTitle("UNIVERSIDAD AMERICANA");
        stage.setScene(scene);
        stage.show();
    }
}
