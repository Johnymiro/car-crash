package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean crashed = false;






    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setCrashed(boolean crashed){

        this.crashed = crashed;
    }

    public void setPos(Position pos){
        this.pos = pos;
    }



    public abstract void move(); // every specific car must have a move method and decides how to move



    // directions of car movement
    public void moveCarRight(){

        if(!crashed) {
            pos.moveColRight();
        }
    }

    public void moveCarLeft(){

        if(!crashed) {
            pos.moveColLeft();
        }
    }

    public void moveCarDown(){

        if(!crashed) {
            pos.moveRowDown();
        }
    }

    public void moveCarUp(){

        if(!crashed) {
            pos.moveRowUp();
        }
    }






    public void resetCarCol(int n){

        pos.setCol(n);
    }

    public void resetCarRow(int n){

        pos.setRow(n);
    }
}
