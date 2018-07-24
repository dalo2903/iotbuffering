package main;

import java.util.Random;

public abstract class Sensor {
    public int id;
    protected Random rand;
	public Sensor(int id) {
		rand = new Random();
		this.id = id;
	}
	

    abstract public String getData();
}
class TemperatureSensor extends Sensor
{
    public TemperatureSensor(int id) {
		super(id);
	}

	@Override
     public String getData(){
		int num = rand.nextInt(100) + 1;
        return "Temperature = "+ num +" degree celcius";
  }
}
class PHSensor extends Sensor
{
    public PHSensor(int id) {
		super(id);
	}

	@Override
  public String getData(){
		int num = rand.nextInt(200) + 1;
        return "PH level = " + num;
  }
}

class OxygenSensor extends Sensor
{
    public OxygenSensor(int id) {
		super(id);
	}

	@Override
    public String getData()
    {
		int num = rand.nextInt(200) + 1;
        return "Oxygen level = " + num;
    }
}