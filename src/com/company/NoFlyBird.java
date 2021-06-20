package com.company;

public class NoFlyBird extends Bird {
    public NoFlyBird (int eggs)
    {
        super ("feathers absent", eggs);

    }
    public  void fly(){
        System.out.println("No flying bird");
    }

}
