import java.util.Scanner;

public class Temp {
	
	private Scanner keyboard; // declaring variables
	private int[][] temperatures;
	public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	public Temp() {
		
		keyboard = new Scanner(System.in); //intialize variables
		temperatures = new int[12][2];
		
		inputTempForYear(); // prints temps
		
		System.out.println("Average low: " + calculateAverageLow());
		System.out.println("Average high: " + calculateAverageHigh());
		System.out.println("Month with lowest temperature is " + MONTHS[findLowestTemp()]);
		System.out.println("Month with highest temperature is " + MONTHS[findHighestTemp()]);
		
	}
	
	public void inputTempForYear() { //allows input for temp for the year
		
		for (int i=0; i<12; i++)
			inputTempForMonth(i);
	}
	
	public void inputTempForMonth(int month) { // allows input  for temp for the month
		
		System.out.println("Please enter the low temperature for " + MONTHS[month]);
		temperatures[month][1] = keyboard.nextInt();
		
		System.out.println("Please enter the high temperature for " + MONTHS[month]);
		temperatures[month][0] = keyboard.nextInt();
		
	}
	
	public float calculateAverageLow() { // calculate avg low temp
		
		float sum = 0;
		for (int i=0; i<temperatures.length; i++)
			sum += temperatures[i][1];
		return sum /= temperatures.length;
		
	}
	
	public float calculateAverageHigh() { // calculate avg high temp
		
		float sum = 0;
		for (int i=0; i<temperatures.length; i++)
			sum += temperatures[i][0];
		return sum /= temperatures.length;
		
	}
	
	public int findLowestTemp() { //looks for lowest temp
		
		int min = 0;
		int indexLow = 0;
		for (int i=0; i<temperatures.length; i++)
			if (temperatures[i][1] < min) {
				min = temperatures[i][1];
				indexLow = 0;
			}
		
		return indexLow;
		
	}
	
	public int findHighestTemp() { // looks for highest temp 
		
		int max = 0;
		int indexHigh = 0;
		for (int i=0; i<temperatures.length; i++)
			if (temperatures[i][0] > max) {
				max = temperatures[i][0];
				indexHigh = i;
			}
		
		return indexHigh;
		
	}
	
	public static void main(String[] args) { //runs program
		
		new Temp();
		
	}
}