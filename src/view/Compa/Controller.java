package view.Compa;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller{
    public JFXButton btn;
    public ToggleGroup fileType;
    public JFXRadioButton RadioSondage;
    public JFXButton prec;
    public JFXRadioButton RadioMetre;
    private Stage primaryStage;


    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }


    public void precedant(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../half/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.half.Controller controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setTitle("CC"+"");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void compa(ActionEvent actionEvent) {

    }
}
