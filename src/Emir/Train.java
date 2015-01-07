package Emir;
/**
 * Class which just point to Engine. Has method getEngine which returns engine sent as parameter in constructor.
 * @author vedadzornic
 *
 */
public class Train {
	private Engine eng;
	
	
	public Train(Engine eng){
		this.eng = eng;
	}
	
	public Engine getEngine(){
		return this.eng;
	}
	
}
