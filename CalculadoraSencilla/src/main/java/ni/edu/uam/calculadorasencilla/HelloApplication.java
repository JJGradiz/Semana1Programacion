package ni.edu.uam.calculadorasencilla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding(new Insets(20));

        Label lblTitulo = new Label("Calculadora Sencilla");
        Label lblNumero1 = new Label("Número 1:");
        TextField txtNumero1 = new TextField();
        Label lblNumero2 = new Label("Número 2:");
        TextField txtNumero2 = new TextField();
        Label lblResultado = new Label("Resultado: 0");

        Button btnSumar = new Button("Sumar");
        Button btnRestar = new Button("Restar");
        Button btnMultiplicar = new Button("Multiplicar");
        Button btnDividir = new Button("Dividir");

        // Eventos de los botones
        btnSumar.setOnAction(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            lblResultado.setText("Resultado: " + (numero1 + numero2));
        });

        btnRestar.setOnAction(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            lblResultado.setText("Resultado: " + (numero1 - numero2));
        });

        btnMultiplicar.setOnAction(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            lblResultado.setText("Resultado: " + (numero1 * numero2));
        });

        btnDividir.setOnAction(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            if (numero2 != 0) {
                lblResultado.setText("Resultado: " + (numero1 / numero2));
            } else {
                lblResultado.setText("Error: División entre cero");
            }
        });

        // Agrupación de botones
        HBox buttons = new HBox(10);
        buttons.getChildren().addAll(btnSumar, btnRestar, btnMultiplicar, btnDividir);

        // Agregar elementos al contenedor raíz (VBox)
        root.getChildren().addAll(
                lblTitulo,
                lblNumero1, txtNumero1,
                lblNumero2, txtNumero2,
                buttons,
                lblResultado
        );

        // Crear la escena y mostrar la ventana
        Scene scene = new Scene(root, 350, 250);
        stage.setTitle("Calculadora JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}