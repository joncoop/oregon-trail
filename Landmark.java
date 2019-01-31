import java.util.ArrayList;

public abstract class Landmark
{
    private String name;
    private int mileMarker;
    private String description; // maybe use
    private String[] options;
    
    public Landmark(String name, int mileMarker) {
        this.name = name;
        this.mileMarker = mileMarker;
    }
    
    public String getName() {    
        return name;
    }
    
    // public abstract void description();
    
    public void menu() {
        for (int i=0; i<options.length; i++) {
            System.out.println(i + ") " + options[i]);
        }   
    }
    
    
    /**
     * Player will stay on current Landmark until successfully advancing
     * or until all members of the party die.
     * 
     * @return true if party successfully advances past Landmark
     */
    public boolean play(Party party) {
        menu();
        
        return true;
    }
}
