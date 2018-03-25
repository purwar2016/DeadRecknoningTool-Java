package mainApp;

import data.GlobalConstants;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * MainApp
 */
public class MainApp extends Application {

    Controller controller;
    View view;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        primaryStage.setTitle(GlobalConstants.APP_NAME);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

        view = new View(root, this);
        controller = new Controller(this);
    }

    public Controller getController() {
        return controller;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public View getView() {
        return view;
    }
}