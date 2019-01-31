
public class Runner
{
    public static void main(String[] args) 
    {
        String mapData = null; // use this later
        
        Map map = new Map(mapData);
        Game game = new Game(map);
        game.run();
    }
}
