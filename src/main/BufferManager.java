package main;

import java.util.ArrayList;

public abstract class BufferManager {
	protected Buffer buffer;
	protected SensorDataReader dataReader;
	public BufferManager() {
        this.buffer = new Buffer();
        this.dataReader = new SensorDataReader();
    }
    abstract public Buffer getBuffer();
    abstract public void writeToBuffer(Sensor sensor, Location location);
    abstract public ArrayList<Entry> getDataByTime(int t1, int t2 );
    abstract public ArrayList<Entry> getDataByLocation(Location l , float radius);
}
class NoSQLBufferManager extends BufferManager
{

	@Override
	public Buffer getBuffer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeToBuffer(Sensor sensor, Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Entry> getDataByTime(int t1, int t2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Entry> getDataByLocation(Location l, float radius) {
		// TODO Auto-generated method stub
		return null;
	}
    //extend
}

class SQLBufferManager extends BufferManager
{

	@Override
	public Buffer getBuffer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeToBuffer(Sensor sensor, Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Entry> getDataByTime(int t1, int t2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Entry> getDataByLocation(Location l, float radius) {
		// TODO Auto-generated method stub
		return null;
	}
    //extend
}

class BasicBufferManager extends BufferManager
{
	public BasicBufferManager() {
		super();
	}
    @Override
    public Buffer getBuffer(){
        return this.buffer;
    }
    @Override
    public void writeToBuffer(Sensor sensor, Location location){        
    	Entry e = dataReader.getData(sensor, location);
    	buffer.addEntry(e);
        
    }
	@Override
	public ArrayList<Entry> getDataByTime(int t1, int t2) {
		ArrayList<Entry> result = new ArrayList<Entry>();
		
		return null;
	}
	@Override
	public ArrayList<Entry> getDataByLocation(Location l, float radius) {
		//TODO
		return null;
	}

}