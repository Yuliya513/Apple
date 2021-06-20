package com.company;

public class App {
    public static void main (String args []) {
        /*-
        Abstract.Bird bird = new Abstract.Bird("feathers", "Dove");
        Abstract.Bird bird1 = new Abstract.Bird("feathers", "Ogar");
        Abstract.Bird bird2 = new Abstract.Bird("feathers", "Black Vorona");
        Abstract.Bird.bird();
        Abstract.Bird.bird1();
        Abstract.Bird.bird2();
        Abstract.Bird.bird3();
        int[] birds = new int[3];
        String[] strings = new String[4];
        Abstract.Bird bird1 = new Abstract.Bird("Yastrub", "feathers");
        Abstract.Bird bird2 = new Abstract.Bird("Ogar", "feathers");
        Abstract.Bird bird3 = new Abstract.Bird("Black Vorona", "feathers");
        Bird[0] = bird1;
        Bird[1] = bird2;
        Bird[2] = bird3;
        System.out.println(Bird[0], Name);
        System.out.println(Bird[1], Name);
        System.out.println(Bird[2], Name);

         */
        Bird[] birds = {
        new Eagel(2), new Pinguin(1),new Eagel(1)
        };
        for (Bird current: birds){
            current.fly();
        }
    }

}
