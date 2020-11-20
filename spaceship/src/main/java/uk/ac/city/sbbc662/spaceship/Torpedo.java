package uk.ac.city.sbbc662.spaceship;

import javafx.scene.paint.Paint;

public class Torpedo extends GameObject{

    public Torpedo(){
        super(200, 50);
        this.setFill(Paint.valueOf("red"));
    }

}
