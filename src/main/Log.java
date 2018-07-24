//package main;
//
//import java.util.ArrayList;
//
//public class Log {
//	private BufferManager bufferManager;
//    private Exporter      exporter;
//    private LocationManager locationManager;
//    public Log(BufferManager bufferManager, Exporter exporter, LocationManager locationManager){
//        this.exporter = exporter;
//        this.bufferManager = bufferManager;
//        this.locationManager = locationManager;
//    }
//    public void readDataFromSensor(Sensor sensor){
//        bufferManager.writeToBuffer(sensor, locationManager.getLocation(sensor.id));
//    }
//    public ArrayList<Entry> getDatasByTime(int t1, int t2 ){
//        return bufferManager.getDataByTime(t1,t2);
//    }
//    public ArrayList<Entry> getDataByLocation(Location l , int radius)
//    {
//        return bufferManager.getDataByLocation(l,radius);
//    }
//    public void export(){
//        exporter.export(bufferManager.getBuffer());
//    }
//}
