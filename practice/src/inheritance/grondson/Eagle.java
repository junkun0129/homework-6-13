package inheritance.grondson;

import inheritance.son.Bird;

public class Eagle extends Bird{
    protected String ShowInfo;

    public Eagle(){
        super();
        this.ShowInfo = "cool";
    }

    public Eagle(int height, int weight, String animalType, String bloodType, String feacher1, String feacher2, String showInfo) {
        super();
        ShowInfo = showInfo;
    }

    public String getShowInfo() {
        return ShowInfo;
    }

    public void setShowInfo(String showInfo) {
        ShowInfo = showInfo;
    }

    @Override
    public String toString() {
        return "Eagle [animalType=" + animalType + ", bloodType=" + bloodType + ", height=" + height + ", weight=" + weight
        + "feacher1=" + feacher1 + ", feacher2=" + feacher2 + ", ShowInfo=" + ShowInfo + "]";
    }

    // public String run(){
    //     return "iiiiiii";
    // }

   

    

    
}
