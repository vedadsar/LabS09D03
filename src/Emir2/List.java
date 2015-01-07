package Emir2;

public class List {

	private Node first;
	 private Node last;
	 private static int size;
	 private int index;
	 
	 
	 public List(){
		 
	 }
	 /**
	  * Adding Node sent as parameter into our list
	  * @param next
	  */
	 public void add(Object next){
		 
		 Node node = new Node(next); 										//Casting object into Node
		 
		 if(last != null){													//If our last node is different then 'null' we're setting sent object to last.setNext
			 last.setNext(node);
			 last = node;													// now last is our added object	
		 }else																// If our last node is null, that means our list is empty so our node is first and last.
			 first = last = node;										
		 
		 		 
	 }
	 
	 /**
	  * Method for getting node at index sent as parameter.
	  * @param index
	  * @return
	  */
	 public Node getNode (int index){
		 
	 }
	 
	 /**
	  * Method for adding a Node sent as parameter into first place.
	  * @param next
	  */
	 public void push(Node next){
		 
	 }
	 
	 /**
	  * Method removing a node which is on first place.
	  */
	 public void pop(){
		 		 
	 }
	 
	 /**
	  * Method for inserting node (next) which is sent as parameter into slot at index (index) sent as parameter.
	  * @param index index place in list where we'll add Node
	  * @param next Node which we'll add.
	  */
	 public void insertAt(int index, Node next){
		 
	 }
	 
	 /**
	  * Method which removes an Object at index which is sent as parameter.
	  * @param index position of object we want to remove.
	  */
	 public void removeAt(int index){
		 
	 }
	 
	 /**
	  * method which returns size of our list
	  * @return
	  */
	 public int size(){
		 return this.size;
	 }
	 
	 /**
	  * Method which checks if our list is empty or not. returning true if its empty or false if its false.
	  * @return
	  */
	 public boolean isEmpty(){
		 return false;
	 }
	 	 
}
