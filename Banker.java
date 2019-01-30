
public class Banker extends Person
{
    private int startingWealth;
    
    public Banker(String name)
    {
        super(name);
        this.startingWealth = 1600;
    }
    
    public int getStartingWealth() {
        return startingWealth;
    }
}
