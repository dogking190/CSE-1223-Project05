/**
 * Project05.java
 * 
 * takes a random number and has the player try to guess it
 * 
 * @author ponderisin
 * @version 1.0.0
 */
package osu.cse1223;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 *
 */
public class Project05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int _counter = 0;
		int _usr = 0;
		
		Random _random = new Random();
		
		int _rand = _random.nextInt(200) + 1;
		
		while(true)
		{
			System.out.print("Please guess the number the computer has picked between 1 - 200: ");
			_usr = in.nextInt();
			
			_counter++;
			
			if(_usr > 200 || _usr < 1)
			{
				System.out.println("Your guess is out of range.  Pick a number between 1 and 200.");
			}
			else if(_usr > _rand)
			{
				System.out.println("Your guess was too high.  Try again.");
			}
			else if(_usr < _rand)
			{
				System.out.println("Your guess was too low.  Try again.");
			}
			else if(_usr == _rand)
			{
				System.out.println("Congratulations!  Your guess was correct!");
				System.out.println("");
				break;
			}
			
			System.out.println("");
			
		}
		
		System.out.println("I had chosen " + _rand + " as the target number.");
		System.out.println("You guessed it in " + _counter + " tries.");
		
		if(_counter == 1)
		{
			System.out.println("That was astounding!");
		}
		else if(_counter >=2 && _counter <=4 )
		{
			System.out.println("That was lucky!");
		}
		else if(_counter == 5 || _counter == 6)
		{
			System.out.println("That was pretty good.");
		}
		else if(_counter == 7)
		{
			System.out.println("That was not that impressive.");
		}
		else if(_counter == 8 || _counter == 9)
		{
			System.out.println("Are you sure this is the right game for you?");
		}
		else
		{
			System.out.println("This just isn't your game, is it?");
		}
		
		in.close();
	}

}
