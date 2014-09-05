import java.util.Scanner;

public class GirlScout {
	// declaring variables
	private int boxes;
	private int tier1, tier2, tier3, tier4, tier5 = 0;
	private String str = "";

	public static void main(String[] args) {
	// run program
		new GirlScout();
	}
	
	public GirlScout() {

		Scanner input = new Scanner(System.in); 
		System.out.print("Please enter the number of girl scouts: ");
		int girls = input.nextInt(); //allowing input

		for (int i = 1; i <= girls; i++) { // entering number of boxes each girl sold
			System.out.print("How many cookies did Girl " + i + " sell?");
			boxes = input.nextInt();

			if (boxes >= 41) { // categorizing
				tier5++;
			}
			else if (boxes >= 31) {
				tier4++;
			}
			else if (boxes >= 21) {
				tier3++;
			}
			else if (boxes >= 11) {
				tier2++;
			}
			else {
				tier1++;
			}
		}

		getText("Total Boxes Sold", "Number of Girl Scouts"); // storing strings into String str
		getText("0 to 10", tier1 + "");
		getText("11 to 20", tier2 + "");
		getText("21 to 30", tier3 + "");
		getText("31 to 40", tier4 + "");
		getText("41 and more", tier5 + "");

		System.out.println(str);
}
	
	public void getText(String str, String num){ // organizing format
		this.str += "\n" + str; 
		for (int i=0; i < 21 - str.length(); i++) // spacing
			this.str += " ";
		this.str += num;
	}
}