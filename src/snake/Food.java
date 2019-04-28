package snake;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Sjaak Smetsers <s.smetsers@cs.ru.nl>
 */
public class Food extends Circle {
    private int foodX = 0, foodY = 0;

    public Food () {
        super( World.UNIT / 2, World.UNIT / 2, World.UNIT / 2, Color.BLUE );
    }
    
    public boolean foundAt( int x, int y ){
        return foodX == x && foodY == y;
    }
    
    public void moveTo( int x, int y ){
        foodX = x;
        foodY = y;
        setTranslateX(foodX * World.UNIT);
        setTranslateY(foodY * World.UNIT);
    }
}
