package main;

import java.util.Date;

public class SensorDataReader {
    public Entry getData(Sensor sensor, Location location) {
        Date date = new Date();
        return new Entry(sensor.id, date.getTime(), location,  sensor.getData());
    }
}
