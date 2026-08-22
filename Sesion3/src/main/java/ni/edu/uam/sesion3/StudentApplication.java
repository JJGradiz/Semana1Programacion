package ni.edu.uam.sesion3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                StudentApplication.class.getResource("/ni/edu/uam/sesion3/hello-view.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 348, 500);
        stage.setTitle("Registro de notas de estudiantes");
        stage.setScene(scene);
        stage.show();
    }
}
