package Day19.HomeWork;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Hw6 extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("HomeWork 6");

        Button b1 = new Button("Hoo");

        HBox row1 = new HBox();
        row1.setAlignment(Pos.CENTER);

        row1.getChildren().add(b1);

        Scene s1 = new Scene(row1, 400,300);
        primaryStage.setScene(s1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
