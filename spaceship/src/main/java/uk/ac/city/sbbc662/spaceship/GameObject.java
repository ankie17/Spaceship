package uk.ac.city.sbbc662.spaceship;

import javafx.scene.shape.Circle;

public class GameObject extends Circle {



    public GameObject(int x, int y){
        super(x, y,10);

    }

    public void moveRight(){
        this.setCenterX(getCenterX() +1);
    }

    public void moveLeft(){
        this.setCenterX(getCenterX() -1);
    }

    public void moveUp(){
        this.setCenterY(getCenterY() -1);
    }

    public void moveDown(){
        this.setCenterY(getCenterY() -1);
    }

    public double getX(){
        return getCenterX();
    }

    public double getY(){
        return getCenterY();
    }
}
