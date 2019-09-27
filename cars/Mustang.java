package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Mustang extends Car{

    public Mustang(Position pos){

        super.setPos(pos);
    }


    public String toString(){

        return "M";
    }

    public void move(){

        super.moveCarDown();
        super.moveCarRight();
    }
}
