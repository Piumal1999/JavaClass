package Day19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class A extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("HeLLo WorLd");

        Button b1 = new Button();
        b1.setText("Click");

        VBox layout = new VBox();
        layout.getChildren().add(b1);

        Scene scene1 = new Scene(layout, 400,300);
        primaryStage.setScene(scene1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
