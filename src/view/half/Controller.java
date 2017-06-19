package view.half;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public JFXButton prec;
    public JFXButton visu;
    public JFXButton comp;
    private Stage primaryStage;
    public void bringSecond() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../second/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.second.Controller controller = (view.second.Controller)fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.getIcons().add(new Image("..\\..\\images\\logo.jpg"));
        primaryStage.setTitle("CC");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void precedant(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../first/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.first.Controller controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setTitle("CC");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void bringSecondVisu(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../second/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.second.Controller controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setTitle("CC");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void bringSecondComp(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../Compa/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.Compa.Controller controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setTitle("CC");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
