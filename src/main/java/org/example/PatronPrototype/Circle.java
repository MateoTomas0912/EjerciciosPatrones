package org.example.PatronPrototype;

public class Circle implements Clonable{
    public int Radio;
    public int Centro;

    public Circle(){

    }

    public Circle(Circle target){
        this.Radio = target.Radio;
        this.Centro = target.Centro;
    }

    @Override
    public Clonable clonar() {
        return new Circle(this);
    }
}
