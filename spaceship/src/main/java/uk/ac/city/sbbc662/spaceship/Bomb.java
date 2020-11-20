package uk.ac.city.sbbc662.spaceship;

import javafx.scene.paint.Paint;

public class Bomb extends GameObject {

    public Bomb(){
        super (150, 50);
        this.setFill(Paint.valueOf("orangered"));
    }
}
