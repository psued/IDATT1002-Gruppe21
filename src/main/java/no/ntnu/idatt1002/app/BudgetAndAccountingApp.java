package no.ntnu.idatt1002.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import no.ntnu.idatt1002.app.gui.ScreenBuilder;

/**
 * Use this class to start the application
 * 
 * @author nilstes
 */
public class BudgetAndAccountingApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Region sceneRoot = new ScreenBuilder().build();
        Scene scene = new Scene(sceneRoot);
        primaryStage.setScene(scene);
        // scene.getStylesheets().add("/css/default.css");
        primaryStage.show();
    }

}
