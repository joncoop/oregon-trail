
public class Game
{
    private Party party;
    private Map map;
    private Landmark currentLandmark;
    
    public Game(Map map)
    {
        // load map
        
    }
    
    public void showTitle() {
        System.out.println("Oregon Trail");
    }
    
    public void showCredits() {
        System.out.println("Oregon Trail");
    }
    
    public void run() {
        boolean success = true;
        
        showTitle();
        
        while (currentLandmark != null && success == true) {
            currentLandmark = map.getCurrentLandmark();
            success = currentLandmark.play(party);
            
            if (success) {
                map.advance();
            }
        }

        showCredits();
    }
}
