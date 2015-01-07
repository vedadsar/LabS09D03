package Emir;
/**
 * Class Truck which creates object of type Truck. Truck has similar methods as Engine. Attach is connecting next Truck to our train ( connected to this Truck)
 * getNext method returns attached Truck ( if exist, if not returns null )
 * toString method which prints character which is in truck. One truck contains only 1 letter.
 * @author Vedad Zornic
 *
 */
public class Truck {
	private char letter;
	private Truck nextTruck;
	
	public Truck(char letter){
		this.letter = letter;
	}
	

	public void attach(Truck nextTruck){
		this.nextTruck = nextTruck;
	}
	
	public Truck getNext(){
		return this.nextTruck;
	}
	
	@Override
	public String toString(){
		return ""+letter;
	}
	
}
