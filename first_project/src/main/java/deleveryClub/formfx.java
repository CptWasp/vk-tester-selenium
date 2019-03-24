package deleveryClub;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class formfx extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        Parent content = FXMLLoader.load(getClass().getResource("formParta.fxml"));
        BorderPane root = new BorderPane();
        root.setCenter(content);
        group.getChildren().add(root);

        primaryStage.setScene(new Scene(group, 400, 400));
        primaryStage.show();
    }
}
