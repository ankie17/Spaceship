package uk.ac.city.sbbc662.spaceship;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private Spaceship spaceship;
    private List<GameObject> enemies;


    public Game(){

        spaceship = new Spaceship();

        Asteroid asteroid = new Asteroid();
        Bomb bomb = new Bomb();
        Torpedo torpedo = new Torpedo();
        enemies= new ArrayList<>();
        enemies.add(asteroid);
        enemies.add(bomb);
        enemies.add(torpedo);
        //gameLoop();
    }

    public void gameLoop(){

            for (GameObject enemy : enemies) {
                enemy.moveLeft();
                hitCheck(enemy);
            }
            System.out.println(spaceship.toString());

    }

    public List<GameObject> getEnemies(){
        return enemies;
    }

    public Spaceship getSpaceship(){
        return spaceship;
    }

    public void hitCheck(GameObject enemy){
        if ((int)enemy.getX() == (int)spaceship.getX() &&
                (int)enemy.getY() == (int)spaceship.getY()){
           spaceship.hit(enemy);
        }
    }




}
