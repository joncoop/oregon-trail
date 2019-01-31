import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Map
{
    private List<Landmark> landmarks;
    private int currentLocation;
    private String dataFile;
    
    public Map(String dataFile)
    {
        this.landmarks = new ArrayList<Landmark>();
        this.dataFile = dataFile;
        this.currentLocation = 0;
    }
    
    public void load() {
        // eventually loads landmark data from text file, but for now...
        
        landmarks.add( new River("Kansas River", 10) );
        landmarks.add( new Fort("Fort Kearney", 20) );
        landmarks.add( new Nature("Chimney Rock", 40) );
    }

    public void advance() {
        currentLocation++;
    }
    
    public Landmark getCurrentLandmark() {
        return landmarks.get(currentLocation);
    }
    
    public Landmark getNextLandmark() {
        int temp = currentLocation++;
        
        if (temp < landmarks.size()) {
            return landmarks.get(temp);
        }
        else {
            return null;
        }
    }
    
    public int distanceToNextLandmark() {
        return 0;
    }
}
