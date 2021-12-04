import java.util.Date; 
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        if (dayPeriod == "morning"){
            return "Good morning, "+ name + " coffee is brewing";
        }
        else if (dayPeriod == "afternoon"){
            return "Good Afternoon, " + name + " Lovely to see you";
        }
        return "Good evening, " + name + " Dinner will be ready shortly";
    }

    public String dateAnnouncement() {
            Date date = new Date();
            return "Today's date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation){
        if (conversation.contains("Alexis")){
            return "She does not have clearance for that, I will assist.";
        }
        else if (conversation.contains("Alfred")){
            return "Happy to be of service.";
        }
        else{
        return "Should you need anything do reach out.";
        }
    }
    public String batSignal(String conversation){
        if (conversation.contains("Joker")){
            return "We really need to do something about that one.";
        }
        else if (conversation.contains("Superman")){
            return "Do try to let him do the heavy lifting this time."; 
        }
        else{
        return "Robin will meet you.";
        }
        }
}