package vehiclePackage;

public class MarineVehicle extends Vehicle implements Motorizedable, Commercial
{
	private boolean _wind;
	private String _flag;
	
	public MarineVehicle(String modelname,float speed,float distance,float totaldistance,int pas,
			boolean wind,String flag)
	{
		super(modelname,speed,distance,totaldistance,pas)
		this._modelName = modelname;
		this._maxSpeed = speed;
		this._distance = distance;
		this._totalDistance = totaldistance;
		this._numOfPassanger = pas;
		this._wind = wind;
		this._flag = flag;
	}

	public boolean getWindWay()
	{
		return this._wind;
	}
	
	public String getFlag()
	{
		if (getWindWay() == true)
		{
			return this._flag;
		}
		return this._flag = null;
	}
	
	public void setFlag(String flag)
	{
		this._flag = flag;
	}
	
	public boolean setWindWay(boolean way)
	{
		if (way == false)
		{
			setFlag(null);
			return this._wind = false;
		}
		return this._wind = way;
	}
	
	
	
	
}
