
public class Outpost extends Landmark
{
    public Outpost(String name)
    {
        super(name);
    }
    
    public void description() {
        System.out.println("You are at the " + getName() + " outpost");
    }
    
    public void shop() {
        
    }
}
