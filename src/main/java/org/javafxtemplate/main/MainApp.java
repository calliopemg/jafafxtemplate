package org.javafxtemplate.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Entrypoint class for the application - launches the JavaFX UI.
 */
public class MainApp extends Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);
    private Boolean clicked = false;

    public Boolean buttonWasClicked() {
        return clicked;
    }

    /**
     * Main CLI entrypoint of the application.
     *
     * @param args Command line arguments supplied to the program
     */
    public static void main(final String[] args) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("main entrypoint with args: " + String.join(", ", args));
        }

        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
        LOGGER.info("JavaFX application started");

        primaryStage.setTitle("Some fancy window title");

        final Button button = new Button("Click me");
        button.setOnAction(e -> {
            clicked = true;
            LOGGER.info("Hello world - button was clicked!!");
        });

        final Label label = new Label("Hello world!");

        final VBox layout = new VBox();
        layout.getChildren().addAll(label, button);

        final Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
