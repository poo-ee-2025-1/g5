package view;

import controller.Controller1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class View extends Application {
    private static Controller1 controller;

    public static void setController(Controller1 c) {
        controller = c;
    }

    @Override
    public void start(Stage stage) throws Exception {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gui_project.fxml"));
            //loader.setController(controller);
            Parent root = loader.load();
            stage.setScene(new Scene(root));
            stage.setTitle("Sistema");
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }}
}
