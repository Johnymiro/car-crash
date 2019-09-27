package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {




    public static Car getNewCar() {

        Car[] cars = {new Mustang(RPG()), new Fiat(RPG()), new BMW(RPG())};

        int random = (int)(Math.random() * cars.length);


        return cars[random];
    }





    private static Position RPG(){

        int randomCol = (int)(Math.random()* Field.getWidth());
        int randomRow = (int)(Math.random()* Field.getHeight());

        return new Position(randomCol, randomRow);
    }


}
