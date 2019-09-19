package Day19.HomeWork;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Hw4 extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("HomeWork 4");

        Button b1 = new Button("usje");
        Button b2 = new Button("hell");
        Button b3 = new Button("ello");
        Button b4 = new Button("helo");
        Button b5 = new Button("lelo");
        Button b6 = new Button("okel");
        Button b7 = new Button("kcjd");
        Button b8 = new Button("ajdi");
        Button b9 = new Button("oedi");
        Button b10 = new Button("ksue");
        Button b11 = new Button("jurd");
        Button b12 = new Button("porj");
        Button b13 = new Button("juer");
        Button b14 = new Button("sune");
        Button b15 = new Button("irej");
        Button b16 = new Button("uwye");

        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();

        b1.setMinWidth(55);
        b2.setMinWidth(55);
        b3.setMinWidth(55);
        b4.setMinWidth(55);
        b5.setMinWidth(55);
        b6.setMinWidth(55);
        b7.setMinWidth(55);
        b8.setMinWidth(55);
        b9.setMinWidth(55);
        b10.setMinWidth(55);
        b11.setMinWidth(55);
        b12.setMinWidth(55);
        b13.setMinWidth(55);
        b14.setMinWidth(55);
        b15.setMinWidth(55);
        b16.setMinWidth(55);

        row1.getChildren().add(b1);
        row1.getChildren().add(b2);
        row1.getChildren().add(b3);
        row1.getChildren().add(b4);

        row2.getChildren().add(b5);
        row2.getChildren().add(b6);
        row2.getChildren().add(b7);
        row2.getChildren().add(b8);

        row3.getChildren().add(b9);
        row3.getChildren().add(b10);
        row3.getChildren().add(b11);
        row3.getChildren().add(b12);

        row4.getChildren().add(b13);
        row4.getChildren().add(b14);
        row4.getChildren().add(b15);
        row4.getChildren().add(b16);

        VBox layout = new VBox();
        layout.getChildren().add(row1);
        layout.getChildren().add(row2);
        layout.getChildren().add(row3);
        layout.getChildren().add(row4);

        Scene s1 = new Scene(layout, 400,300);
        primaryStage.setScene(s1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
