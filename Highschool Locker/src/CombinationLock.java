public class CombinationLock {
	
	private int dial=0; // initialize variables
	private int num1;
	private int num2;
	private int num3;
	
	
	public CombinationLock(){
	}
	
	public CombinationLock(int num1,int num2,int num3) { // declares variable values
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void resetDial(){ // reset dial will = 0
		dial = 0;
	}
	
	public int turnRight(int Ticks){ // right turn dial
		if (dial + Ticks > 39){
			dial = dial + Ticks-40;
		}
		else {
			dial = dial + Ticks;
		}
		return dial;
	}
	
	public int turnLeft(int Ticks){ // left turn dial
		if (dial>Ticks){
			dial = dial - Ticks;
		}
		else {
			dial = dial + 40 -Ticks;
		}	
		return dial;
	}
		
	public boolean openLock(int dial1, int dial2,int dial3){ // opens the locker
		if ((num1 == dial1) && (num2 == dial2) && (num3 == dial3)){
			return true;	
		}
		else
			return false;
	}
	
	public int getDial() { // gets default dial
		return dial;
	}
	public void setDial(int dial) { // sets dial
		this.dial = dial;
	}		
	public void setNum1(int num1) { // sets numbers
		this.num1 = num1;
	}	
	public void setNum2(int num2) {
		this.num2 = num2;
	}	
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public String toString() {
		return "Combination Lock [dial = " + dial + ", Number 1 = " + num1
				+ ", Number 2 = " + num2 + ", Number 3 = " + num3 + "]";
	}
	
}