package fr.leblanc.utilitary;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Position p){
        return Math.sqrt(Math.pow(p.x-this.x,2)+ Math.pow(p.y-this.y, 2));
    }
}
