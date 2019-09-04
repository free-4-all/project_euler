# project_euler
This repository was built to maintain my solutions to Project Euler archives.

Conceptually, the program has an "engine" which supports a configurable number of parameters based on a given archive number (which dictates parameter parsing).

This driver class (src/com/mfreeland/problems/ProblemSolver.java) parses the parameters and then initializes an instance of the class which the algorithm is defined within. The classes for each archive are stored in src/com/mfreeland/problems/.

