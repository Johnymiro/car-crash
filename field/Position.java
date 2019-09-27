package org.academiadecodigo.carcrash.field;

public class Position {

    private int Col;
    private int Row;

    public Position(int Col, int Row){
        this.Col = Col;
        this.Row = Row;
    }

    public int getCol() {
        return Col;
    }

    public int getRow() {
        return Row;
    }

    public void moveColRight(){

        this.Col++;
    }
    public void moveColLeft(){

        this.Col--;
    }

    public void moveRowDown(){
        this.Row++;
    }

    public void moveRowUp(){
        this.Row--;
    }


    public void setCol(int n){
        this.Col = n;
    }

    public void setRow(int n){
        this.Row = n;
    }
}
