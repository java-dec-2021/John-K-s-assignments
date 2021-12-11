
public class Project {
    //attributes
    private String name;
    private String description;

    // instance method
    public String elevatorPitch() {
        return name + ":" + description;
    }
    public Project() {
        this.name = "My name is...";
        this.description = "My description is...";
    }
    public Project(String name) {
        this.name = name;
        this.description = "Better than Alexa";
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    //getter
    public String myNameIs() {
        return name;
    }
    //setter
    public void callMe(String name) {
        this.name = name;
    }
    //getter
    public String myDescription() {
        return description;
    }
    //setter
    public void describeMe(String description) {
        this.description = description;
    }
}