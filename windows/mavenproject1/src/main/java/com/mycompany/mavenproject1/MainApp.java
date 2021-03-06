package com.mycompany.mavenproject1;

        
    import static javafx.application.Application.launch;
    import javafx.application.Application;
    import static javafx.application.Application.launch;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.TextField;
    import javafx.scene.image.Image;
    import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLController controller = new FXMLController();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");
        
        Image anotherImage = new Image("file:icondark.jpg");
        stage.getIcons().add(anotherImage);
        stage.setTitle("Parta");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}