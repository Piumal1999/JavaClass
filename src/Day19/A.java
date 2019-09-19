package Day19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class A extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("HeLLo WorLd");

        Button b1 = new Button();
        b1.setText("Click");

        Button b2 = new Button();
        Button b3 = new Button();
        b2.setText("Don't Click");
        b3.setText("Don't Click");

        HBox row1 = new HBox();
        HBox row2 = new HBox();

        row1.getChildren().add(b1);
        row1.getChildren().add(b2);

        row2.getChildren().add(b1);

        VBox layout = new VBox(); //vertical Box
        layout.getChildren().add(row1);
        layout.getChildren().add(row2);

        Scene scene1 = new Scene(layout, 400,300);
        primaryStage.setScene(scene1);


        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
