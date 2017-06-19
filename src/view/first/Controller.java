package view.first;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public JFXButton btn;
    private Stage primaryStage;
    public void bringHalf() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../half/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.half.Controller controller = (view.half.Controller)fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setTitle("CC");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
