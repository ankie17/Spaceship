package uk.ac.city.sbbc662.spaceship;

import javafx.scene.paint.Paint;

public class Spaceship extends GameObject{

    private int shield;

    public Spaceship(){
        super(50, 50);
        this.setFill(Paint.valueOf("green"));
        shield = 100;
    }

    public void hit(GameObject gameObject){
        if (gameObject instanceof Asteroid){
            shield -= 5;
        }
        if (gameObject instanceof Bomb){
            shield -=20;
        }
        if (gameObject instanceof Torpedo){
            shield -=30;
        }

    }

    @Override
    public String toString(){
        return String.format("Sheild at %d percent.", shield);
    }
}
