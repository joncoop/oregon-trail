
public class Farmer extends Person
{
    private int startingWealth;
    
    public Farmer(String name)
    {
        super(name);
        this.startingWealth = 400;
    }
    
    public int getStartingWealth() {
        return startingWealth;
    }
}