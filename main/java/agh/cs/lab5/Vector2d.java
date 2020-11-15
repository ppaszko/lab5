package agh.cs.lab5;

import java.util.Objects;

public class Vector2d {
     private int x;
     private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    //konstruktor


    public Vector2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "("+x+","+y+")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean precedes (Vector2d other){
        return (this.x<other.x && this.y<other.y);
    }
    public boolean follows (Vector2d other){
        return (this.x>other.x && this.y>other.y);
    }
    public Vector2d upperRight(Vector2d other){
        return new Vector2d(Math.max(this.x,other.x), Math.max(this.y, other.y));
    }
    public Vector2d lowerLeft(Vector2d other){
        return new Vector2d(Math.min(this.x,other.x), Math.min(this.y, other.y));
    }
    public Vector2d add(Vector2d other){
        return new Vector2d(this.x+other.x, this.y+ other.y);
    }
    public Vector2d subtract(Vector2d other){
        return new Vector2d(this.x-other.x, this.y-other.y);
    }
    public Vector2d opposite(){
        return new Vector2d(-this.x, -this.y);
    }
    public boolean equals(Object other){
        if (this == other)
            return true;
        if (!(other instanceof Vector2d))
            return false;
        Vector2d that = (Vector2d) other;
        return this.x == that.x && this.y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}
