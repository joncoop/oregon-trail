/**
 * Opening scene to Oregon Trail. This is where the player picks
 * their character type, names party, and buys initial supplies.
 */
public class Start extends Landmark
{
    public Start(String name)
    {
        super(name);
    }
    
    public void description() {
        
    }
    
    public void menu() {
        
    }
    
    public void createParty() {
        
    }
    
    /**
     * 
     * @return true always. You can't lose on the starting landmark.
     */
    public boolean play(Party party) {
     
        return true;
    }
}
