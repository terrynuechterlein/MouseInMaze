import edu.kzoo.grid.ColorBlock;
import java.awt.Color;
import edu.kzoo.util.NamedColor;
import java.util.ArrayList;
import edu.kzoo.grid.Location;
/**
 * This is the teleporter mouse. This mouse finds the location of the cheese, and teleports directly to it.
 *
 * @author TERRY NUECHTERLEIN 
 * @version 1.0 3/15/20
 */
public class TeleporterMouse extends Mouse
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Teleporter
     */
    public TeleporterMouse()
    {
        // initialise instance variables
        super();

    }

    
    public ArrayList<Location> getNextLocation()
    {
      ArrayList<Location>LocList = new ArrayList<Location>();
      Location cheeseLoc = getGrid().getFinishLoc();
      LocList.add(cheeseLoc);
      return LocList;
    }
    
    

}
