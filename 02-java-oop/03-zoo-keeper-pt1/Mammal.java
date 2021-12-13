public class Mammal {
    private int energyLevel = 100;
    
    public int viewEnergyLevel(){
        return energyLevel;
    }
    public void setEnergyLevel(int e){
        this.energyLevel= e;
    }
    public int displayEnergy() {
        System.out.println("current energy level: " + energyLevel);
        return energyLevel;
    }
}