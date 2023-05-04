package Explorers;
import Planets.Mercury;
import Planets.Mars;
import Planets.Saturn;
import Planets.Neptune;
import Planets.Pluto;
import Planets.Earth;
import Planets.Planet;
import Planets.Uranus;
import Planets.Venus;
import Planets.Jupiter;
public interface Explorer{


     void visit(Mercury mercury);
    
     void visit(Mars mars);
     
     void visit(Saturn saturn);
    
     void visit(Neptune neptune);
   
     void visit(Pluto pluto);
    
     void visit(Earth earth);
    
     void visit(Jupiter jupiter);
    
     void visit(Venus venus);
    
     void visit(Uranus uranus);

    default void visit (Planet planet) {
        System.out.println("Landed an unknown planet...");
    }
}

