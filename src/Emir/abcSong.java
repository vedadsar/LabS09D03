package Emir;

public class abcSong {
	public static void main(String[] args) {

		Truck[] alphabet = new Truck[26];
		Engine eng = new Engine("Alphabet");
		Train abc = new Train(eng);			// Train object, simply pointing to engine.
		
		int alphaCharNumber = 65;
		
		// Loop for adding whole alphabet characters into our train
		for (int i = 0; i < 26; i++) {
			alphabet[i] = new Truck((char) alphaCharNumber);
			alphaCharNumber++;
		}
			
		eng.attach(alphabet[0]);	//Attaching first truck to engine
		
		// For loop for attaching
		for(int i=1; i<alphabet.length; i++){
			alphabet[i-1].attach(alphabet[i]);
		}
		
		
		sing(abc);
		
	
	}
	
	
	
	/**
	 * Sing method printing all characters in our train.
	 * @param abc Train made of alphabet trucks.
	 */
	public static void sing(Train abc){
		Truck current = abc.getEngine().getFirst();
		
		while(current != null){
			System.out.print(current.toString() +" ");
			current = current.getNext();
		}
	}
}
