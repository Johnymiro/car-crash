package org.academiadecodigo.carcrash.cars;
import org.academiadecodigo.carcrash.field.Position;

public class BMW extends Car {


    public BMW(Position pos){

        super.setPos(pos);
    }


    public String toString(){
        return "B";
    }

    public void move(){

        super.moveCarRight();
        super.moveCarUp();
    }
}
