package view.second;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public JFXButton btn;
    public ToggleGroup fileType;
    public JFXRadioButton RadioSondage;
    public JFXRadioButton RadioMetre;
    public JFXRadioButton GPS;
    public JFXComboBox<String> villeCombo;
    private Stage primaryStage;


    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void bringThird() throws IOException {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        String description = getDescription();
        File file = directoryChooser.showDialog(primaryStage);
        if (file!=null){
        System.out.println(file.toString());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../third/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.third.Controller controller = (view.third.Controller) fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        controller.setFileType(description);
        primaryStage.setScene(new Scene(root));
        controller.setVille(villeCombo.getValue());
        controller.setFile(file);
        }
    }


    public String getDescription() {
        if (GPS.isSelected())return "GPS";
        if (RadioMetre.isSelected())return "RadioMetre";
        if (RadioSondage.isSelected())return "RadioSondage";
        return null;
    }

    public void activateCity(ActionEvent actionEvent) {
        btn.setDisable(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        villeCombo.getItems().addAll("AGAD","AJAC","ALAC","BEME","CASA","CASC","CEU1"
        ,"COBA","DAKH","FES1","FLRS","FUNC","IZAN","KECH","MALL","MAS1","MELI","OUAR","OUJD","PDEL"
        ,"RABT","RBAT","SFER","TANG","VILL");
    }
    public void precedant(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../half/sample.fxml"));
        Parent root = fxmlLoader.load();
        view.half.Controller controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setTitle("CC");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
