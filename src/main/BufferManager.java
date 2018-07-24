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
    abstract public ArrayList<Entry> getDataByTime(long t1, long t2 );
	abstract public ArrayList<Entry> getDataByLocation(Location l , float radius);
	abstract public ArrayList<Entry> getAllEntries();
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
	public ArrayList<Entry> getDataByTime(long t1, long t2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Entry> getDataByLocation(Location l, float radius) {
		// TODO Auto-generated method stub
		return null;
	}
    //extend

	@Override
	public ArrayList<Entry> getAllEntries() {
		return null;
	}
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
	public ArrayList<Entry> getDataByTime(long t1, long t2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Entry> getDataByLocation(Location l, float radius) {
		// TODO Auto-generated method stub
		return null;
	}
    //extend

	@Override
	public ArrayList<Entry> getAllEntries() {
		return null;
	}
}

class BasicBufferManager extends BufferManager
{
	public BasicBufferManager() {
		super();
	}
	@Override
    public ArrayList<Entry> getAllEntries(){
        return this.buffer.entries;
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
	public ArrayList<Entry> getDataByTime(long t1, long t2) {
		ArrayList<Entry> result = new ArrayList<Entry>();
		for(Entry e: buffer.entries) {
			if(e.time >= t1 && e.time <= t2) {
				result.add(e);
			}
		}
		return result;
	}
	@Override
	public ArrayList<Entry> getDataByLocation(Location l, float radius) {
		//TODO
		return null;
	}

}