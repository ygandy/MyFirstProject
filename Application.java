
public class Application {

	public static void main(String[] args) {
		
		/*@author Yolanda
			Comments: This program will take any number and print it out in reversed order.
			
			- initialize variables revno and number to equal zero.
			- ask for person to enter a number
			 
			number: Mod(%) the input number by 10 to extract off the rightmost digit.  (389 % 10) = 9	
			revno:	Take the extracted digit and add it to the revno multiplied by 10.
					This displays a zero to the right of the digit (9 * 10) = 90
					
			new number: Divide the number by 10 (removing the rightmost digit). (389 /10) = 38
						Repeat with remaining number digits 38*/

					int revno = 0;
					int number = 0;
					
					System.out.println("Enter a number:");
					
						while (number != 0){ 
							revno = (revno * 10)+(number%10);
							number = number/10;
						}
				
				System.out.println("This is your reversed number:" + revno);
		}
			
	}

