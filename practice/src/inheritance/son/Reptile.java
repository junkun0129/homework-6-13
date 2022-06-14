package inheritance.son;

import inheritance.parent.Animal;

public class Reptile extends Animal{
    protected String skinType;
    protected String boneType;
    protected String eggType;
    
    public Reptile() {
        super();
        this.skinType = "Dry Skin";
        this.boneType = "Backbone";
        this.eggType = "Soft-shelled eggs";
    }

    public Reptile(int height, int weight, String animalType, String bloodType, String skinType, String boneType,
            String eggType) {
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.boneType = boneType;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBoneType() {
        return boneType;
    }

    public void setBoneType(String boneType) {
        this.boneType = boneType;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    @Override
    public String toString() {
        return "Reptile [animalType=" + animalType + ", bloodType=" + bloodType + ", height=" + height + ", weight=" + weight
        + ", boneType=" + boneType + ", eggType=" + eggType + ", skinType=" + skinType + "]";
    }

    

    
}
