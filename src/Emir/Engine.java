package Emir;
/**
 * Class that creates Engine of train. Has method for attaching first truck to our engine.
 * @author vedadzornic
 *
 */
public class Engine {
	
	private String name; 		//Name of engine
	private Truck nextTruck;	//Pointer to next truck
	
	/**
	 * Constructor.
	 * @param name is name of our engine.
	 */
	public Engine(String name){
		this.name = name;
	}
	
	/**
	 * Method which is adding forwarded parameter of type Truck to our class variable nextTruck.
	 * @param nextTruck
	 */
	public void attach(Truck nextTruck){
		this.nextTruck = nextTruck;
	}
	/**
	 * getter for first truck of our train. First truck is attached to engine.
	 * @return
	 */
	public Truck getFirst(){
		return nextTruck;
	}
	
	
	
}
