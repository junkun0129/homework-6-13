package inheritance.parent;



public class Animal {
    
protected int height;
protected int weight;
protected String animalType;
protected String bloodType;

protected Animal(){
    this.height = 0;
    this.weight = 0;
    this.animalType = "null";
    this.bloodType = "null";
}

public Animal(int height, int weight, String animalType, String bloodType) {
    this.height = height;
    this.weight = weight;
    this.animalType = animalType;
    this.bloodType = bloodType;
}

public int getHeight() {
    return height;
}

public void setHeight(int height) {
    this.height = height;
}

public int getWeight() {
    return weight;
}

public void setWeight(int weight) {
    this.weight = weight;
}

public String getAnimalType() {
    return animalType;
}

public void setAnimalType(String animalType) {
    this.animalType = animalType;
}

public String getBloodType() {
    return bloodType;
}

public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
}

public String run(){
    return "Running....";
}

@Override
public String toString() {
    return "Animal [animalType=" + animalType + ", bloodType=" + bloodType + ", height=" + height + ", weight=" + weight
            + "]";
}



}
