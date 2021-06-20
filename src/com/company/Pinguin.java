package com.company;

public class Pinguin extends NoFlyBird{
    public Pinguin (int eggs){
        super (eggs);
    }
    @Override
    public void fly() {
        System.out.println("This.Pinguin");
        super.fly();
    }
}
