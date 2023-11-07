// Class: MouseInAMazeApp
//
// Author: Alyce Brady
//
// License Information:
//   This class is free software; you can redistribute it and/or modify
//   it under the terms of the GNU General Public License as published by
//   the Free Software Foundation.
//
//   This class is distributed in the hope that it will be useful,
//   but WITHOUT ANY WARRANTY; without even the implied warranty of
//   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//   GNU General Public License for more details.

import java.util.ArrayList;

import edu.kzoo.grid.display.ColorBlockDisplay;
import edu.kzoo.grid.display.DisplayMap;

/**
 *  Mouse in a Maze Program:<br>
 *    The MouseInAMazeApp class constructs a graphical user interface
 *    for a mouse-in-a-maze program.  Once the graphical user interface
 *    has been constructed, all program control originates from there.
 *
 *  @author Alyce Brady
 *  @version 29 February 2004
 *  
 *  UPDATE
 *  @author Terry Nuechterlein
 *  version 2.0 3/15/20
 **/
public class MouseInAMazeApp
{
    /**
     * This is the main method. It creates a graphical user interface for the program. It also specifies the types of mice supported by the program, and 
     * adds the different mice.
     **/ 
    public static void main(String[] args)
    {
        // Specify classes that know how to draw various objects in a maze;
        // in other words, map grid object classes (like Mouse, Cheese) to
        // display objects (like ColorBlockDisplay objects).
        DisplayMap.associate("edu.kzoo.grid.ColorBlock",
            new ColorBlockDisplay());

        // Specify the types of mouse supported by the program.
        ArrayList<Class> mouseTypes = new ArrayList<Class>();
        mouseTypes.add(Mouse.class);
        mouseTypes.add(TeleporterMouse.class);
        mouseTypes.add(CluelessMouse.class);
        mouseTypes.add(ShortSightedMouse.class);
        mouseTypes.add(LongSightedMouse.class);
        //        mouseTypes.add(ShortSightedMouse.class);

        // Construct the mouse-in-a-maze frame.
        MouseMazeGUI gui = new MouseMazeGUI(mouseTypes);

    }

}
