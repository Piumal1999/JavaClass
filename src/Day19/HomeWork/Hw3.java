package Day19.HomeWork;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hw3 extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("HomeWork 3");

        VBox col1 = new VBox();
        col1.setPrefWidth(50);

        Button b1 = new Button("hello");
        Button b2 = new Button("hell");
        Button b3 = new Button("ello");
        Button b4 = new Button("helo");

        b1.setMinWidth(col1.getPrefWidth());
        b2.setMinWidth(col1.getPrefWidth());
        b3.setMinWidth(col1.getPrefWidth());
        b4.setMinWidth(col1.getPrefWidth());

        col1.getChildren().add(b1);
        col1.getChildren().add(b2);
        col1.getChildren().add(b3);
        col1.getChildren().add(b4);

        Scene s1 = new Scene(col1, 400,300);
        primaryStage.setScene(s1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
