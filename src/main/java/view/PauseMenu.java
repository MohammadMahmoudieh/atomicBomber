package view;

import controller.ApplicationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PauseMenu extends Application {
    Image icon = new Image(getClass().getResourceAsStream("/icon.png"));
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane pane =  fxmlLoader.load(PauseMenu.class.getResource("/pauseMenu.fxml"));
        Scene pauseScene = new Scene(pane,613,418);
        stage.setScene(pauseScene);
        stage.getIcons().add(icon);

        ColorAdjust colorStatus = new ColorAdjust();
        colorStatus.setSaturation(ApplicationController.saturate);
        stage.getScene().getRoot().setEffect(colorStatus);
        stage.show();
        stage.setMinWidth(613);
        stage.setMinHeight(418);
        stage.setMaxWidth(613);
        stage.setMaxHeight(418);
   }
}
