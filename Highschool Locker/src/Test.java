public class Test {

	public static void main(String[] args) {
		
		Locker Mickey = new Locker(28,17,39,3,100,"Mickey Mouse"); // sets locker components
		Locker Donald = new Locker(35,16,27,0,275,"Donald Duck");
		
		Mickey.openLocker(); // adds books in locker
		for (int i=0; i<3; i++){
			Mickey.putBookInLocker();
		}
		
		Donald.removeBookFromLocker(); // removes book from locker
		
		System.out.println(Mickey.toString()); // prints results
		System.out.println(Donald.toString());
			
	}

}