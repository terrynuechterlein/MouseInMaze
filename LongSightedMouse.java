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
 * This is the longSightedMouse. It moves randomly unless there is cheese in sight, in which case it moves toward the cheese
 *
 * @author TERRY NUECHTERLEIN 
 * @version 1.0 3/15/20
 */
public class LongSightedMouse extends Mouse
{

    /**
     * Constructor for objects of class LongSightedMouse
     */
    public LongSightedMouse()
    {
        // initialise instance variables
        super();
    }

    public ArrayList<Location> checkCheeseLoc()
    {
        ArrayList<Location>LocList = new ArrayList<Location>();

        Location cheeseLoc = getGrid().getFinishLoc(); 
        Direction cheeseDir = getGrid().getDirection(location(), cheeseLoc);
        int colDif = cheeseLoc.col() - location().col();
        int rowDif = cheeseLoc.row() - location().row();
        if(cheeseLoc.row() == location().row())
        {
            if(cheeseDir.equals(Direction.WEST))
            {
                for(int i=0; i<colDif; ++i)
                {
                    Location path = new Location(location().row(), location().col()-1-i);

                    if(getGrid().isEmpty(path))
                    {
                        LocList.add(path);
                    }
                    else if(!getGrid().isEmpty(path) && path.equals(cheeseLoc))
                    {
                        LocList.add(path);
                    }
                    else
                    {
                        LocList.clear(); 
                        return LocList;
                    }
                }
            }
        }

        else if(cheeseLoc.row() == location().row())
        {
            if(cheeseDir.equals(Direction.EAST))
            {
                for(int i=0; i<colDif; ++i)
                {
                    Location path = new Location(location().row(), location().col()+1+i);

                    if(getGrid().isEmpty(path))
                    {
                        LocList.add(path);
                    }
                    else if(!getGrid().isEmpty(path) && path.equals(cheeseLoc))
                    {
                        LocList.add(path);
                    }
                    else
                    {
                        LocList.clear(); 
                        return LocList;
                    }
                }
            }
        }

        else if(cheeseLoc.row() == location().row())
        {
            if(cheeseDir.equals(Direction.NORTH))
            {
                for(int i=0; i<rowDif; ++i)
                {
                    Location path = new Location(location().row()-1-i, location().col());

                    if(getGrid().isEmpty(path))
                    {
                        LocList.add(path);
                    }
                    else if(!getGrid().isEmpty(path) && path.equals(cheeseLoc))
                    {
                        LocList.add(path);
                    }
                    else
                    {
                        LocList.clear(); 
                        return LocList;
                    }

                }
            }
        }

        else

            for(int i=0; i<rowDif; ++i)
            {
                Location path = new Location(location().row()+1+i, location().col());

                if(getGrid().isEmpty(path) && path.equals(cheeseLoc))
                {
                    LocList.add(path);
                }
                else if(!getGrid().isEmpty(path) && path.equals(cheeseLoc))
                {
                    LocList.add(path);
                }
                else
                {
                    LocList.clear();  
                    return LocList;
                }

            }

        return LocList;
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
        ArrayList<Location> cheeseChecker = checkCheeseLoc();

        ArrayList<Location>emptyNbrs = emptyNeighbors();

        Location cheeseLoc = getGrid().getFinishLoc(); 
        ArrayList<Location>LocList = new ArrayList<Location>();

        if(cheeseChecker.size() == 0)
        {
            Random random = new Random();
            int gen = random.nextInt(emptyNbrs.size());
            LocList.add(emptyNbrs.get(gen));   
        }
        else
        {
            return cheeseChecker;
        }

        return LocList;
    }
}

