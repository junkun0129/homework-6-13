package inheritance.grondson;

import inheritance.son.Fish;

public class Eel extends Fish{
    protected String ability;
    protected String ShowInfo;

    public Eel() {
        super();
        this.ability = "Release electric charge";
        this.ShowInfo = "oeeeeee";
    }

    public Eel(int height, int weight, String animalType, String bloodType, String habitat, String feacher,
            String ability, String showInfo) {
        super(height, weight, animalType, bloodType, habitat, feacher);
        this.ability = ability;
        this.ShowInfo = showInfo;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getShowInfo() {
        return ShowInfo;
    }

    public void setShowInfo(String showInfo) {
        ShowInfo = showInfo;
    }

    @Override
    public String toString() {
        return "Eel [animalType=" + animalType + ", bloodType=" + bloodType + ", height=" + height + ", weight=" + weight
        + ", feacher=" + feacher + ", habitat=" + habitat + ", ShowInfo=" + ShowInfo + ", ability=" + ability + "]";
    }

    

    

    
}
