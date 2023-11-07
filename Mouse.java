import edu.kzoo.grid.ColorBlock;
import java.awt.Color;
import edu.kzoo.util.NamedColor;
import java.util.ArrayList;
import edu.kzoo.grid.Location;
import edu.kzoo.grid.GridObject;
import edu.kzoo.grid.Grid;
import edu.kzoo.util.Debug;
import edu.kzoo.grid.Direction;
import edu.kzoo.util.RandNumGenerator;
import java.util.Random;
/**
 * Write a description of class Mouse here.
 *
 * @author Terry Nuechterlein
 */
public abstract class Mouse extends ColorBlock
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Mouse
     */
    public Mouse()
    {
        // initialise instance variables
        super(new NamedColor(Color.BLUE));
    }

    public Maze getGrid()
    {
        return (Maze)grid(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void move()
    {
        ArrayList<Location>nextLoc = getNextLocation();
        Location cheeseLoc = getGrid().getFinishLoc();

        for(Location c: nextLoc)
        {
            if(!c.equals(location()))
            {
                if(c.equals(cheeseLoc))
                {
                    getGrid().remove(cheeseLoc);
                }
                changeLocation(c);
            }
            else
            {
                Debug.println("Target reached");
            }
        }   
    }

    public abstract ArrayList<Location> getNextLocation();
}
