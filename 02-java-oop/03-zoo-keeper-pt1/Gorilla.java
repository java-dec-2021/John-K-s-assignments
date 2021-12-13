class Gorilla extends Mammal {

    public void throwSomething(){
        int e = this.viewEnergyLevel();
        e = e - 5;
        this.setEnergyLevel(e);
        System.out.println("Gorilla has thrown something.");
    }
    public void eatBananas(){
        int e = this.viewEnergyLevel();
        e = e+10;
        this.setEnergyLevel(e);
        System.out.println("Gorilla has enjoyed a banana.");
    }
    public void climb(){
        int e = this.viewEnergyLevel();
        e = e-10;
        this.setEnergyLevel(e);
        System.out.println("Gorilla has climbed a tree.");
    }
}