package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.cars.Mustang;
import org.academiadecodigo.carcrash.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 30;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars(cars);

            // Update screen
            Field.draw(cars);



        }
    }

    private void moveAllCars(Car[] cars) {


       for(int i = 0; i < cars.length; i++){

           // In case cars crashes
           for(int j = 0; j < cars.length; j++){

               if(i != j && cars[i].getPos().getRow() == cars[j].getPos().getRow() &&
                       cars[i].getPos().getCol() == cars[j].getPos().getCol()){

                   cars[i].setCrashed(true);
                   cars[j].setCrashed(true);
               }
           }




           // if car gets out of width length restarts from initial column position
           if(cars[i].getPos().getCol() == Field.getWidth()+1){

               cars[i].resetCarCol(0);
           }
           if(cars[i].getPos().getCol() == -1){
               cars[i].resetCarCol(Field.getWidth());
           }



           // if car gets out of height length restarts from initial height position
           if(cars[i].getPos().getRow() == Field.getHeight()+1){

               cars[i].resetCarRow(0);
           }
           if(cars[i].getPos().getRow() == -1){    // if car touches the bottom

               cars[i].resetCarRow(Field.getHeight());  // st
           }


           cars[i].move();




         /*  if(cars[i] instanceof Mustang){

               cars[i].moveCarRight();
               cars[i].moveCarDown();
           }

           if(i % 2 == 0){
               cars[i].moveCarRight();

               if(RNG() == 0){
                   cars[i].moveCarDown();
               }
           }
           else cars[i].moveCarDown();*/


       }



    }

    private static int RNG(){

        return (int) (Math.random()*5);
    }

}
