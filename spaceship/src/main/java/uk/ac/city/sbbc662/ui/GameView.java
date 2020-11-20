package uk.ac.city.sbbc662.ui;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import uk.ac.city.sbbc662.spaceship.Game;
import uk.ac.city.sbbc662.spaceship.GameObject;
import uk.ac.city.sbbc662.spaceship.Spaceship;

import java.util.List;

public class GameView extends Application {


    @Override
    public void start(Stage stage){
        Game game = new Game();

        Pane root = new Pane();
        Spaceship spaceship = game.getSpaceship();
        root.getChildren().add(spaceship);
        List<GameObject> enemies = game.getEnemies();
        root.getChildren().addAll(enemies);
        Label status = new Label(spaceship.toString());
        status.setLayoutX(0);
        status.setLayoutY(0);
        root.getChildren().add(status);
        Scene scene = new Scene(root, 250, 100);
        stage.setTitle("Spaceship");
        stage.setScene(scene);
        stage.show();

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(20),
                new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent t) {
                        //move the spaceship
                        for (GameObject enemy : enemies){
                            enemy.moveLeft();
                            game.hitCheck(enemy);
                        }
                        status.setText(spaceship.toString());

                    }
                }));
        timeline.setCycleCount(200);
        timeline.play();





    }
}
