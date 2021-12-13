public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return "Iphone " + this.getVersion() + " says " + this.getRingtone();
    }
    @Override
    public String unlock() {
        // your code here
        return "Password accepted";
    }
    @Override
    public void displayInfo() {
        // your code here
        System.out.println("IPhone " + this.getVersion() + " from " + this.getCarrier());            
    }
}

