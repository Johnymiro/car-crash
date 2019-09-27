package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Fiat extends Car {


    public Fiat(Position pos){

        super.setPos(pos);
    }

    public String toString(){
        return "F";
    }

    public void move(){

        super.moveCarDown();
        super.moveCarLeft();
    }


}
