package Day19.HomeWork;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Hw2 extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("HomeWork 2");

        Button b1 = new Button("hello");
        Button b2 = new Button("hell");
        Button b3 = new Button("ello");
        Button b4 = new Button("helo");

        HBox row1 = new HBox();
        row1.setPrefWidth(50);

        b1.setMinWidth(row1.getPrefWidth());
        b2.setMinWidth(row1.getPrefWidth());
        b3.setMinWidth(row1.getPrefWidth());
        b4.setMinWidth(row1.getPrefWidth());

        row1.getChildren().add(b1);
        row1.getChildren().add(b2);
        row1.getChildren().add(b3);
        row1.getChildren().add(b4);

        Scene s1 = new Scene(row1, 400,300);
        primaryStage.setScene(s1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
