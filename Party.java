import java.util.List;
import java.util.ArrayList;

public class Party
{
    private List<Person> travelers;
    private int dollars;
    private int oxen;
    private int food;
    private int clothes;
    private int bullets;
    private int wagonWheels;
    private int wagonAxels;
    private int wagonTongues;

    public Party(ArrayList<Person> travelers)
    {
        this.travelers = travelers;
    }
    
    public void addPerson(Person p) {
        
    }
    
    public void removePerson(Person p) {
        
    }
    
    public int getSize() {
        return travelers.size();
    }
    
    public int getMoney() {
        return dollars;
    }
    
    /**
     * Gets a random Person from the party, presumable so that they can
     * get sick or whatever.
     * 
     * @return a random Person from the Party.
     */
    public Person getRandomPerson() {
        int rand = (int)(Math.random() * travelers.size());
        return travelers.get(rand);
    }
}
