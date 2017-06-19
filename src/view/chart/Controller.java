package view.chart;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.chart.LineChart;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    public JFXButton btn;
    public LineChart chart;
    private Stage primaryStage;
    private File file;
    private String fileType;


    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void bringData(ActionEvent actionEvent) {

    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
