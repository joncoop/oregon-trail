
public class Game
{
    SimpleScanner input;
    private Profession profession;
    private Party party;
    private int score;

    private Map map;
    private Landmark currentLandmark;
    
    public Game(Map map)
    {
        input = new SimpleScanner();        
    }
    
    public void showTitle() {
        System.out.println("****************");
        System.out.println("* Oregon Trail *");
        System.out.println("****************");
        System.out.println("");
    }
    
    public void showCredits() {
        System.out.println("****************");
        System.out.println("*   Goodbye    *");
        System.out.println("****************");
        System.out.println("");
    }
    
    public int menu(String prompt, String[] options) {
        for (int i=0; i<options.length; i++) {
            System.out.println(i + ") " + options[i]);
        }
        
        return input.readInt(1, options.length);
    }
    
    public void selectProfession() {
        String[] options = {"Banker", "Carpenter", "Farmer"};
        String prompt = "Select a profession.";
        
        int choice = menu(prompt, options);
        
        if (choice == 1) {
            profession = new Banker();
        }
        else if (choice == 2) {
            profession = new Carpenter();
        }
        else if (choice == 3) {
            profession = new Farmer();
        }
        
        System.out.println("Your profession is set.");
    }
    
    public void createParty() {
        System.out.println("Now enter the names of the members of your party.");
        
        System.out.println("Name 1/5");
        String name1 = input.readString();
        
        System.out.println("Name 2/5");
        String name2 = input.readString();
        
        System.out.println("Name 3/5");
        String name3 = input.readString();
        
        System.out.println("Name 4/5");
        String name4 = input.readString();
        
        System.out.println("Name 5/5");
        String name5 = input.readString();
        
        party = new Party();
        party.addPerson( new Person(name1) );
        party.addPerson( new Person(name2) );
        party.addPerson( new Person(name3) );
        party.addPerson( new Person(name4) );
        party.addPerson( new Person(name5) );
        
        System.out.println("Your party is set!");
        System.out.println();
    }
    
    public void run() {
        boolean success = true;
        
        showTitle();
        selectProfession();
        createParty();
        map.load();
        score = 0;
        
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
