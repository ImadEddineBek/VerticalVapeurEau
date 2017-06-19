package view.third;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public JFXTextArea text;
    public JFXButton btn;
    private Stage primaryStage;
    private File file;
    private String fileType;
    private String ville;
    private String fileContent;
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void bringData(ActionEvent actionEvent) {

    }

    public void setFile(File file) {
        this.file = file;
        fileContent = check(file);
    }

    private String check(File file) {
        String tt = "";
        if (file.isDirectory()){ for (File file1 : file.listFiles()) {
           tt+= check(file1);
        }
        return tt;
        }else{StringBuilder text1 = new StringBuilder();
            try {
                List<String> strings = Files.readAllLines(file.toPath());
                for (int i = 0; i < strings.size(); i++) {
                    String s = strings.get(i);
                    if (s.contains(ville)) {
                        s= fix(s);
                        String[] split = s.split(" ");
                        text1.append(split[1]);
                        text1.append("/");
                        text1.append(split[2]);
                        text1.append("/");
                        text1.append(split[3]);
                        text1.append("\t");
                        text1.append(split[4]);
                        text1.append("H ");
                        text1.append(split[5]);
                        text1.append("M ");
                        text1.append(split[6]);
                        text1.append("S\t");
                        text1.append(split[10]);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            text.setText(text.getText()+text1.toString()+"\n");
            String s = text1.toString() + "\n";
            System.out.println(file.toString());
            return s;
        }
    }
    private String fix(String s) {
        s = s.trim();
        char[] chars = s.toCharArray();
        String t = "";
        for (int i = 0; i < chars.length-1; i++) {
            if (!(chars[i]==' '&&chars[i+1]==' ')){
                t+=chars[i];
            }
        }t+=chars[chars.length-1];
        return t;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void save(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(primaryStage);
        ArrayList<String> strings = new ArrayList<>();
        strings.add(fileContent);
        try {
            Files.write(file.toPath(),strings);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
