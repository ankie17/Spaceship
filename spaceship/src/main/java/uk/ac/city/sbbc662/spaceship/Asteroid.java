package uk.ac.city.sbbc662.spaceship;

import javafx.scene.paint.Paint;

public class Asteroid extends GameObject {

    public Asteroid(){
        super(100, 50);
        this.setFill(Paint.valueOf("orange"));
    }

}
