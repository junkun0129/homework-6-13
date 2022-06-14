package inheritance.son;

import inheritance.parent.Animal;

public class Fish extends Animal{
    protected String habitat;
    protected String feacher;

    public Fish(){
        super();
        this.habitat = "Live in water";
        this.feacher = "Has gills";
    }

    public Fish(int height, int weight, String animalType, String bloodType, String habitat, String feacher) {
        super(height, weight, animalType, bloodType);
        this.habitat = habitat;
        this.feacher = feacher;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getFeacher() {
        return feacher;
    }

    public void setFeacher(String feacher) {
        this.feacher = feacher;
    }

    @Override
    public String toString() {
        return "Fish [animalType=" + animalType + ", bloodType=" + bloodType + ", height=" + height + ", weight=" + weight
        + ", feacher=" + feacher + ", habitat=" + habitat + "]";
    }

    

    
}
