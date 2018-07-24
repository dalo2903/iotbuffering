package main;
import java.util.Date;


public class Client {

	public static void main(String[] args) {
        Date date = new Date();
		SensorManager sensorManager = new SensorManager();
        LocationManager locationManager = new LocationManager();
        Exporter exporter = new ConsoleExporter();
        BufferManager bufferManager = new BasicBufferManager();
        SensorFactory sensorFactory = new SensorFactory();
        Sensor tempSensor = sensorFactory.getSensor(sensorManager.getNextId(), "TEMPERATURE");
        locationManager.setLocation(tempSensor.id, new Location(100,200));
        
        Sensor phSensor = sensorFactory.getSensor(sensorManager.getNextId(), "PH");
        locationManager.setLocation(phSensor.id, new Location(100,200));

        Sensor oxygenSensor = sensorFactory.getSensor(sensorManager.getNextId(), "OXYGEN");
        locationManager.setLocation(oxygenSensor.id, new Location(100,200));

        sensorManager.addSensor(tempSensor);
        sensorManager.addSensor(phSensor);
        sensorManager.addSensor(oxygenSensor);
        
        
        
        for(Sensor sensor: sensorManager.getSensors()) {
            bufferManager.writeToBuffer(sensor, locationManager.getLocation(sensor.id));
        }
        exporter.export(bufferManager.getDataByTime(0, date.getTime() + 100));
        // exporter.export(bufferManager.getAllEntries());

	}

}
