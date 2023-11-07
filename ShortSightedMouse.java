import edu.kzoo.grid.ColorBlock;
import java.awt.Color;
import edu.kzoo.util.NamedColor;
import java.util.ArrayList;
import edu.kzoo.grid.Location;
import edu.kzoo.grid.GridObject;
import edu.kzoo.grid.Grid;
import edu.kzoo.grid.Direction;
import edu.kzoo.util.RandNumGenerator;
import java.util.Random;
/**
 * This is the shortSightedMouse. It moves randomly unless there is cheese in sight within one unit,in which case it moves to (and eats) the cheese
 *
 * @author TERRY NUECHTERLEIN 
 * @version 1.0 3/15/20
 */
public class ShortSightedMouse extends Mouse
{

    /**
     * Constructor for objects of class ShortSightedMouse
     */
    public ShortSightedMouse()
    {
         // initialise instance variables
        super();
    }

    public ArrayList<Location> emptyNeighbors()
    {
        ArrayList<Location> empty = grid().neighborsOf(location());

        ArrayList<Location> emptyNbrs = new ArrayList<Location>();
        Location cheeseLoc = getGrid().getFinishLoc();

        for ( Location loc : empty )
        {
            if ( getGrid().isEmpty(loc) || loc.equals(cheeseLoc))
                emptyNbrs.add(loc);
        }
        return emptyNbrs; 
    }

    public ArrayList<Location> getNextLocation()
    {
        ArrayList<Location>emptyNbrs = emptyNeighbors();

        ArrayList<Location>LocList = new ArrayList<Location>();

        Location cheeseLoc = getGrid().getFinishLoc(); 
        
        
        Direction cheeseDir = getGrid().getDirection(location(), cheeseLoc);
        Location firstCell = getGrid().getNeighbor(location(), cheeseDir);
        Location secondCell = getGrid().getNeighbor(firstCell, cheeseDir);
        
        if(!cheeseLoc.equals(secondCell))
        {
            Random random = new Random();
            int gen = random.nextInt(emptyNbrs.size());
            LocList.add(emptyNbrs.get(gen));   
        }
        else
        {
          LocList.add(firstCell);
          LocList.add(secondCell);
        }

        return LocList;
    }
}
