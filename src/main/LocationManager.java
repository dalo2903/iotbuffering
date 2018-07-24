package main;
import java.util.HashMap;



public class LocationManager {
	private HashMap<Integer, Location> locations;
    public LocationManager() {
        locations = new HashMap<Integer, Location>();
    }
    public void setLocation(int sensorId, Location location) {
        this.locations.put(sensorId, location);
    }
    public Location getLocation(int sensorId) {
        return locations.get(sensorId);
    }
}