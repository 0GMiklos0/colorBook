package colorBook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ColorBookApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource(""));
        stage.setScene(new Scene(root));
        stage.setTitle("Color Book");
        stage.setResizable(false);
        stage.show();
    }
}
