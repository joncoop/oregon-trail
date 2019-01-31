
public class Fort extends Landmark
{
    public Fort(String name, int mileMarker)
    {
        super(name, mileMarker);
    }
    
    public void description() {
        System.out.println("You are at the " + getName() + " outpost");
    }
    
    public void shop() {
        
    }
}
