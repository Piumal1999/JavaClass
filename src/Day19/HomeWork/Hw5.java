package Day19.HomeWork;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Hw5 extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("HomeWork 5");

        Button b1 = new Button("hello");
        Button b2 = new Button("hey");

        b1.setMinWidth(50);
        b2.setMinWidth(200);

        HBox row1 = new HBox();

        row1.getChildren().add(b1);
        row1.getChildren().add(b2);

        Scene s1 = new Scene(row1, 400,300);
        primaryStage.setScene(s1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
