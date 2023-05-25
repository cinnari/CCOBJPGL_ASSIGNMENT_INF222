package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.*;

public class DrinkController1 {

    @FXML
    Button cokebtn, carabtn, icebtn, milkbtn, whiskeybtn;

    Caramel caramel = new Caramel();
    Coke coke = new Coke();
    IcedTea icedtea = new IcedTea();
    Milkshake milkshake = new Milkshake();
    Whiskey whiskey = new Whiskey();

    public void initialize() {

        caramel.setColor("light brown");
        caramel.setTaste("sweet");
        caramel.setSmell("coffee aroma");

        coke.setColor("black");
        coke.setTaste("sweet/fizzy");
        coke.setSmell("none");

        icedtea.setColor("dark red");
        icedtea.setTaste("sweet");
        icedtea.setSmell("leafy aroma");

        milkshake.setColor("pink");
        milkshake.setTaste("sweet");
        milkshake.setSmell("fruity aroma");

        whiskey.setColor("deep brown");
        whiskey.setTaste("bitter");
        whiskey.setSmell("woody aroma");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(cokebtn)) {
            alert.setContentText("Coke is " + coke.getColor() + ", it is also " + coke.getTaste() + ", it also has" + coke.getSmell());
        }

        if (sourceButton == carabtn) {
            alert.setContentText("Caramel Macchiato is" + caramel.getColor()  + " and " + caramel.getTaste() + ", it also has" + caramel.getSmell());
        }

        if (sourceButton == icebtn) {
            alert.setContentText("Lolo " + icedtea.getColor()  + " and " + icedtea.getTaste() + ", it also has" + icedtea.getSmell());
        }

        if (sourceButton == milkbtn) {
            alert.setContentText("Terter " + milkshake.getColor()  + " and " + milkshake.getTaste() + ", it also has" + milkshake.getSmell());
        }

        if (sourceButton == whiskeybtn) {
            alert.setContentText("Bugoy " + whiskey.getColor()  + " and " + whiskey.getTaste() + ", it also has" + whiskey.getSmell());
        }

        alert.showAndWait();

    }

}
