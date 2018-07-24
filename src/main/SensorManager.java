package main;

import java.util.ArrayList;

public class SensorManager {
	private ArrayList<Sensor> sensors;
	private int currentId;
	public SensorManager() {
		sensors = new ArrayList<Sensor>();
		currentId = 0;
	}
    public void addSensor(Sensor s) 
    {
    	sensors.add(s);
    }
    public Sensor getSensor(int id)
    {
    	for ( Sensor sensor: sensors ) {
    		if(sensor.id == id)
    			return sensor;
    	}
		return null;
    	
    }
	public int getNextId() {
		return currentId++;
	}
    public ArrayList<Sensor> getSensors() 
    {
    	return sensors;
    }
    
}
