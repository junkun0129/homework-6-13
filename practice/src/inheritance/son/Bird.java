package inheritance.son;

import inheritance.parent.Animal;

public class Bird extends Animal{
    protected String feacher1;
    protected String feacher2;
    
    public Bird(){
        super();
        this.feacher1 = "Animals with feathers";
        this.feacher2 = "Can Fly";
    }

    

    public Bird(int height, int weight, String animalType, String bloodType, String feacher1, String feacher2) {
        
        super(height, weight, animalType, bloodType);
        this.feacher1 = feacher1;
        this.feacher2 = feacher2;
    }



    public String getFeacher1() {
        return feacher1;
    }

    public void setFeacher1(String feacher1) {
        this.feacher1 = feacher1;
    }

    public String getFeacher2() {
        return feacher2;
    }

    public void setFeacher2(String feacher2) {
        this.feacher2 = feacher2;
    }



    @Override
    public String toString() {
        return "Bird [animalType=" + animalType + ", bloodType=" + bloodType + ", height=" + height + ", weight=" + weight
        + "feacher1=" + feacher1 + ", feacher2=" + feacher2 + "]";
    }

    public String run(){
        return "wwwwwww";
    }





   
    

    

}
