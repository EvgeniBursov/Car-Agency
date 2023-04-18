package vehiclePackage;

public abstract class Vehicle
{
	//private
	protected String _name;
	protected float _maxSpeed;
	protected float _distance;
	protected int _numOfPassanger;
	
	//publics
	public Vehicle() 
	{
		_maxSpeed=_distance=_numOfPassanger=0;
		
	}
	
	public Vehicle(String name,float speed,float dist,int pas)
	{
		this._name = name;
		this._maxSpeed = speed;
		this._distance = dist;
		this._numOfPassanger = pas;
		
	}
	
	/*public boolean equals(Vehicle v)
	{
		if(!(v instanceof Vehicle))
			
	}*/
	
	
}
