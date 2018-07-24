package main;

import java.util.ArrayList;

public interface Exporter {
	public void export(ArrayList<Entry> entries);
}

class IPExporter implements Exporter
{
    @Override
    public void export (ArrayList<Entry> entries) {
    	System.out.println("IP Exporter");

	}
}
class AbsPathExporter implements Exporter
{
    @Override
    public void export (ArrayList<Entry> entries) {
    	System.out.println("Path Exporter");
	}
}
class ConsoleExporter implements Exporter
{
    @Override
    public void export (ArrayList<Entry> entries) {
    	System.out.println("Console Exporter: ");
    	for(Entry entry: entries) {
        	System.out.println("Sensor id: "+ entry.sensorId);
        	System.out.println("Data: "+ entry.data);
        	System.out.println("Time: "+ entry.time );
        	System.out.println("Location: "+ entry.location.longitude + ", "+ entry.location.latitude);

    	}
	}
}