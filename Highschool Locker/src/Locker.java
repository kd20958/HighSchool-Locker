import java.util.Scanner;

public class Locker {	
	
	public Locker(){
	}
	private String Name;
	private int Books;
	private int lockNumber;
	private int num1;
	private int num2;
	private int num3;
	
	public Locker(int num1, int num2,int num3,int Books,int lockNumber, String Name){
		
		this.Name = Name; // declares variable values
		this.Books = Books;
		this.lockNumber = lockNumber;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;	
	}
	
	CombinationLock combolock = new CombinationLock(num1,num2,num3); // sets combo lock

	public void putBookInLocker(){ // add book method
		
		Books++;
	}
	
	public boolean removeBookFromLocker(){ // remove book method
		
		if (Books>=1){
			Books--;
			return true;
		}
		else{
			return false;
		}
	}
	
	public void openLocker(){ // open locker method
		
		System.out.println("Enter three numbers to open the lock.");
		Scanner keyboard = new Scanner(System.in); // reads input
		int dial1= keyboard.nextInt(); // stores inputs
		int dial2= keyboard.nextInt(); 
		int dial3= keyboard.nextInt();
		if (combolock.openLock(dial1, dial2, dial3)){
			
			System.out.println("The lock is opened.");
		}
		else {
			
			System.out.println("You fail to open the lock");
		}
	}
	
	public String getName() { // get variables
		return Name;
	}
	public int getBooks() {
		return Books;
	}
	public int getLockNumber() {
		return lockNumber;
	}
	public void setName(String Name) { // set variables
		this.Name = Name;
	}
	public void setBooks(int Books) {
		this.Books = Books;
	}
	public void setLockNumber(int lockNumber) {
		this.lockNumber = lockNumber;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public String toString() {
		return "Locker [Amount of books = " + Books + ", Name = "
				+ Name + ", Number 1 = " + num1 + ", Number 2 = " + num2
				+ ", Number 3 = " + num3 + ", Locker number = " + lockNumber
				+ ", Combination Lock = " + combolock + "]";
	}
	
}