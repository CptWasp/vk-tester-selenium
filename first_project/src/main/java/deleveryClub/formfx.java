package deleveryClub;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class formfx extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 400);

        primaryStage.setTitle("Parta");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
