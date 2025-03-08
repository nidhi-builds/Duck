# Duck
# Duck Behavior Simulation

This Java project implements a Duck behavior simulation using the **Strategy Design Pattern**. It allows different types of ducks to have dynamic behaviors for flying, swimming, and quacking.

## Project Structure

The project follows an **object-oriented approach** with an emphasis on behavior encapsulation.

### Source Files:
- `Duck.java` - Abstract base class representing a duck.
- `MallardDuck.java` - A specific type of duck that can fly and quack.
- `RubberDuck.java` - A rubber duck that squeaks and does not fly.
- `FlyBehaviour.java` - Interface defining the flying behavior.
- `CanFly.java` - Implementation of `FlyBehaviour` for ducks that can fly.
- `CanNotFly.java` - Implementation of `FlyBehaviour` for ducks that cannot fly.
- `QuackBehaviour.java` - Interface defining the quacking behavior.
- `Quack.java` - Implementation for ducks that quack.
- `Squeak.java` - Implementation for rubber ducks that squeak.
- `SwimBehaviour.java` - Interface defining swimming behavior.
- `Swimming.java` - Implementation for ducks that swim.
- `Floating.java` - Implementation for ducks that float but don't swim actively.
- `Main.java` - The entry point of the program, demonstrating duck behaviors.

## How to Run the Project

1. Ensure you have **Java JDK 8 or later** installed.
2. Clone or download the project.
3. Navigate to the `src` directory.
4. Compile all Java files:
   ```sh
   javac *.java
   ```
5. Run the main program:
   ```sh
   java Main
   ```

## Expected Output
The program will create different types of ducks and demonstrate their behaviors by calling their methods for flying, swimming, and quacking.



