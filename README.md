﻿# MouseInMaze

Designs a program to simulate mice moving through a maze until they find cheese.  A mouse always starts at the starting position, and moves one unit at a time. 

## Strategies

- **Clueless Mouse**: Moves randomly throughout the maze.
- **Short-Sighted Mouse**: Moves randomly unless cheese is one unit away.
- **Long-Sighted Mouse**: Moves randomly unless cheese is 2 units away, then moves toward the cheese.
- **Teleporter Mouse**: finds the cheese and teleports directly to it.

## Installation

1. Ensure Java and Visual Studio Code are installed (you can use any IDE of your choice).
2. Install the Java Extension Pack for Visual Studio Code.
3. Clone this repository.
4. Open the project in Visual Studio Code.

## Usage

The program reads a maze configuration file that includes the starting position and the location of the cheese. It then constructs mice with different movement strategies, letting each mouse run its course until it finds the cheese.

### Running the Simulation

- Use the provided `MazeFileMenu.java` to open a grid file and start the simulation.
- Observe the graphical display showing the maze's state and the mouse's position after each move.
- Upon finding the cheese, the program reports the number of units the mouse took to succeed.

## Acknowledgments

- Alyce Brady, for the foundational code and maze logic.
- Terry Nuechterlein, for contributions to the mouse movement strategies.
