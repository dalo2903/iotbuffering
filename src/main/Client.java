package main;


public class Client {

	public static void main(String[] args) {
		SensorManager sensorManager = new SensorManager();
        LocationManager locationManager = new LocationManager();
        Exporter exporter = new ConsoleExporter();
        BufferManager bufferManager = new BasicBufferManager();

        Sensor tempSensor = new TemperatureSensor(sensorManager.getNextId());
        locationManager.setLocation(tempSensor.id, new Location(100,200));
        
        Sensor phSensor = new PHSensor(sensorManager.getNextId());
        locationManager.setLocation(phSensor.id, new Location(100,200));

        Sensor oxygenSensor = new OxygenSensor(sensorManager.getNextId());
        locationManager.setLocation(oxygenSensor.id, new Location(100,200));

        sensorManager.addSensor(tempSensor);
        sensorManager.addSensor(phSensor);
        sensorManager.addSensor(oxygenSensor);
        
        
        
      
        for(Sensor sensor: sensorManager.getSensors()) {
        	bufferManager.writeToBuffer(sensor, locationManager.getLocation(sensor.id));
        }
        exporter.export(bufferManager.getBuffer().entries);
	}
}
