package view.Compa.radiometre;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller{
    private Stage primaryStage;


    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }


    public void precedant(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../Compa/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.Compa.Controller controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setTitle("CC"+"");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void compa(ActionEvent actionEvent) {

    }
}
