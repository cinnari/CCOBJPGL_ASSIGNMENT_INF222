package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer {
    
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Beep beep... exploring Mercury");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Beep beep... exploring Venus");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Beep beep... exploring Earth");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Beep beep... exploring Mars");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Beep beep... exploring Jupiter");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Beep beep... exploring Saturn");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Beep beep... exploring Uranus");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Beep beep... exploring Neptune");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Beep beep... exploring Pluto");
    }
}