
public class Carpenter extends Person
{
    private int startingWealth;
        
    public Carpenter(String name)
    {
        super(name);
        this.startingWealth = 800;
    }
    
    public int getStartingWealth() {
        return startingWealth;
    }
}
