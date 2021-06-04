package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    //        GridPane root=new GridPane();
    //        root.setAlignment(Pos.CENTER);
    //        root.setHgap(10);
    //        root.setVgap(10);
    //        Label greetings=new Label("Welcome to JavaFX..");
    //        greetings.setTextFill(Color.BLUE);
    //        greetings.setFont(Font.font("Times New Roman", FontWeight.BOLD,30));
    //        root.getChildren().add(greetings);
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
