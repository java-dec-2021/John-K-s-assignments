public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return "Galaxy " + this.getVersion() + " says " + this.getRingtone();
    }
    @Override
    public String unlock() {
        // your code here
        return "Password accepted";
    }
    @Override
    public void displayInfo() {
        // your code here    
        System.out.println("Galaxy " + this.getVersion() + " from " + this.getCarrier());        
    }
}


