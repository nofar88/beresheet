# Bereshit

## The purpose of the assignment
Our goal was to land the spaceship in the most efficient manner in which the spaceship lands at a speed of 2.5 meters per second or less, and that it has as much fuel as possible left.

## Way of thinking
We took the lecturer's code, to which we added a PID control whose purpose is to help us land the spaceship without it crashing. The PID controller took as input the height of the spacecraft at each point in time, with the aim of reaching 0 height while monitoring the power of the engine.

## PID structure
The PID controller consists of 3 components:
- P - the error range (the current distance from the moon) multiplied by the constant p0
- I - the sum of all errors multiplied by the constant i0
- D - the derivative of the current error in relation to the previous error multiplied by the constant d0
  The returned value allows us to increase or decrease the gas intensity (the NN parameter).

## The results of the experiment
A graph of alt versus time:
![enter image description here](https://github.com/nofar88/beresheet/blob/master/graphs/alt.png?raw=true)

A graph of fuel versus time:
![enter image description here](https://github.com/nofar88/beresheet/blob/master/graphs/fuel.png?raw=true)

A graph of vertical speed versus time:
![enter image description here](https://github.com/nofar88/beresheet/blob/master/graphs/vs.png?raw=true)

The spacecraft landed in VS of 2.055m/s and with 20.0299 liters of fuel.
