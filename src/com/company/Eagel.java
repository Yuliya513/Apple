package com.company;

public class Eagel extends FlyBird {
    public Eagel (int eggs){
        super (eggs);
    }

    @Override
    public void fly() {
        System.out.println("This.Eagel");
        super.fly();
    }
}
