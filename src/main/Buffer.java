package main;

import java.util.ArrayList;

public class Buffer {
	public ArrayList<Entry> entries;
	public Buffer() {
		entries = new ArrayList<Entry>();
	}

	public void addEntry(Entry e)
	{    
		entries.add(e);
	}
	
}
