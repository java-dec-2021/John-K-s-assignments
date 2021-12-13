class Bat extends Mammal {

    public void fly(){
        int e = this.viewEnergyLevel();
        e = e - 50;
        this.setEnergyLevel(e);
        System.out.println("woosh.");
    }
    public void eatHumans(){
        int e = this.viewEnergyLevel();
        e = e + 25;
        this.setEnergyLevel(e);
        System.out.println("nom nom nom.");
    }
    public void attackTown(){
        int e = this.viewEnergyLevel();
        e = e - 100;
        this.setEnergyLevel(e);
        System.out.println("ahhhh.");
    }
}