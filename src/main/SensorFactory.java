package main;

public class SensorFactory {
    public SensorFactory(){}
    public Sensor getSensor(Integer sensorId, String sensorType) {
        if(sensorType.equalsIgnoreCase("OXYGEN")){
            return new OxygenSensor(sensorId);
        } else if(sensorType.equalsIgnoreCase("PH")){
            return new PHSensor(sensorId);
        } else if(sensorType.equalsIgnoreCase("TEMPERATURE")){
            return new TemperatureSensor(sensorId);
        }
        return null;
    }

}