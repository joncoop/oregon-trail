import java.util.ArrayList;

public class Map
{
    private ArrayList<Landmark> landmarks;
    private int currentLocation;
    
    public Map()
    {
        loadLandmarks();
        this.currentLocation = 0;
    }
    
    public void loadLandmarks() {
        // loads landmark data from text file
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
