package ni.edu.uam.sesion3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ni.edu.uam.sesion3.dao.StudentDAO;
import ni.edu.uam.sesion3.models.Student;

public class StudentController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCalificacion;

    private final StudentDAO dao = new StudentDAO();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void saveButtonClicked() {
        try {
            String nombre = txtNombre.getText() == null ? "" : txtNombre.getText().trim();
            String calificacionTexto = txtCalificacion.getText() == null ? "" : txtCalificacion.getText().trim();

            if (nombre.isEmpty() || calificacionTexto.isEmpty()) {
                mostrarAlerta("Debes ingresar el nombre y la calificación.");
                return;
            }

            double grade = Double.parseDouble(calificacionTexto);
            if (grade < 0 || grade > 100) {
                mostrarAlerta("La calificación debe estar entre 0 y 100.");
                return;
            }

            dao.add(new Student(nombre, grade));
            welcomeText.setText("Nota guardada: " + nombre + " -> " + grade);
            txtNombre.clear();
            txtCalificacion.clear();
        } catch (NumberFormatException e) {
            mostrarAlerta("La calificación debe ser un número válido.");
        }
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Validación");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
