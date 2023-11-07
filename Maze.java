import edu.kzoo.grid.BoundedGrid;
import edu.kzoo.grid.Location;
import edu.kzoo.grid.GridObject;
import edu.kzoo.grid.Grid;
/**
 * Write a description of class Maze here.
 *
 * @author Terry Nuechterlein
 */
public class Maze extends BoundedGrid
{
    // instance variables - replace the example below with your own
    private Location startLoc;
    private Location finishLoc;
    
    

    /**
     * Constructor for objects of class Maze
     */
    public Maze(int rows, int cols)
    { 
      super(rows, cols);
      startLoc= startLoc;
      finishLoc= finishLoc;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Location getStartLoc()
    {
        // put your code here
        return startLoc;
    }
    
    public Location getFinishLoc()
    {
       return finishLoc; 
    }
    
    public void setStartLoc(Location loc)
    {
     startLoc= loc;   
    }
    
    public void setFinishLoc(Location loc)
    {
      finishLoc= loc;  
    }
}
