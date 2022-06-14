package inheritance.grondson;

import inheritance.son.Reptile;

public class Crocodile extends Reptile{
    protected String eggType2;
    protected String ShowInfo;

    public Crocodile() {
        super();
        this.eggType2 = "Hard-shelled eggs";
        this.ShowInfo = "bad ass";
    }

    public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String boneType,
            String eggType, String eggType2, String showInfo) {
        super(height, weight, animalType, bloodType, skinType, boneType, eggType);
        this.eggType2 = eggType2;
        this.ShowInfo = showInfo;
    }

    public String getEggType2() {
        return eggType2;
    }

    public void setEggType2(String eggType2) {
        this.eggType2 = eggType2;
    }

    public String getShowInfo() {
        return ShowInfo;
    }

    public void setShowInfo(String showInfo) {
        ShowInfo = showInfo;
    }

    @Override
    public String toString() {
        return "Crocodile [animalType=" + animalType + ", bloodType=" + bloodType + ", height=" + height + ", weight=" + weight
        + ", boneType=" + boneType + ", eggType=" + eggType + ", skinType=" + skinType + ", ShowInfo=" + ShowInfo + ", eggType2=" + eggType2 + "]";
    }

    

    
}
