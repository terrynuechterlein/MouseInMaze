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
 * This is the cluelessMouse class. This constructs a mouse that moves randomly in adjacent locations in the maze until it stumbles upon the cheese.
 *
 * @author TERRY NUECHTERLEIN 
 * @version 1.0 3/15/20
 */
public class CluelessMouse extends Mouse
{

    public CluelessMouse()
    {
        // initialise instance variables
        super();
    }
    
    public ArrayList<Location> emptyNeighbors()
    {
        ArrayList<Location> empty = grid().neighborsOf(location());  //arraylist that stores all the neighbors of the mouse's current location.
        
        ArrayList<Location> emptyNbrs = new ArrayList<Location>();   
        Location cheeseLoc = getGrid().getFinishLoc();

        for ( Location loc : empty )
        {
            if ( getGrid().isEmpty(loc) || loc.equals(cheeseLoc))
                emptyNbrs.add(loc);                                  //adds empty locations from the "empty" arrayList and stores it in the new arraylist
        }
        return emptyNbrs; 
    }
    

    public ArrayList<Location> getNextLocation()
    {
        ArrayList<Location>emptyNbrs = emptyNeighbors();
        
        ArrayList<Location>LocList = new ArrayList<Location>();
     
        
        Random random = new Random();
        int gen = random.nextInt(emptyNbrs.size());
        LocList.add(emptyNbrs.get(gen));
        
        return LocList;

    }
}

