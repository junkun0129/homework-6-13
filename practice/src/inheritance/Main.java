package inheritance;

import inheritance.son.Bird;
import inheritance.son.Fish;
import inheritance.son.Reptile;
import inheritance.grondson.Eagle;
import inheritance.grondson.Eel;
import inheritance.grondson.Crocodile;



public class Main {
    public static void main(String[] args){

        System.out.println("==============");

        Bird bird = new Bird();
        System.out.println(bird);
        System.out.println("-------------");
        Eagle eagle = new Eagle();
        System.out.println(eagle);

        System.out.println("==============");

        Fish fish = new Fish();
        System.out.println(fish);
        System.out.println("-------------");
        Eel eel = new Eel();
        System.out.println(eel);

        System.out.println("==============");

        Reptile reptile = new Reptile();
        System.out.println(reptile);
        System.out.println("-------------");
        Crocodile crocodile = new Crocodile();
        System.out.println(crocodile);
        
        System.out.println("==============");







        
    }
}
