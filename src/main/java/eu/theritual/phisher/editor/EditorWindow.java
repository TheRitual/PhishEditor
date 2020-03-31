package eu.theritual.phisher.editor;

import eu.theritual.phisher.rider.Deck;
import eu.theritual.phisher.rider.Utils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.File;

public class EditorWindow {
    ScreenSize windowSize = new ScreenSize(1000,700, 1000,700,800, 600);
    public EditorWindow(Stage primaryStage) {
        primaryStage.setTitle("Phish Editor");
        primaryStage.setMaxHeight(windowSize.getMaximumHeight());
        primaryStage.setMaxWidth(windowSize.getMaximumWidth());
        primaryStage.setMinHeight(windowSize.getMinimumHeight());
        primaryStage.setMinWidth(windowSize.getMinimumWidth());
        Group root = new Group();
        Scene mainScene = new Scene(root, windowSize.getWidth(), windowSize.getHeight());
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}