package main;



public class Entry {
	public int sensorId;
    public long time;
    public Location location;
    public String data;
    public Entry(int id, long l, Location location,String data ){
        this.sensorId = id;
        this.time = l;
        this.location = location;
        this.data = data;
    }
}
