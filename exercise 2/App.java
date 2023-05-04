import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet mars = new Mars();
        Planet jupiter = new Jupiter();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet neptune = new Neptune();
        Planet pluto = new Pluto();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer android = new AndroidExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        pluto.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        jupiter.accept(rover);
        pluto.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);

        mars.accept(android);
        saturn.accept(android);
        mercury.accept(android);
        venus.accept(android);
        earth.accept(android);
        jupiter.accept(android);
        pluto.accept(android);
        uranus.accept(android);
        neptune.accept(android);
    }
}
    

