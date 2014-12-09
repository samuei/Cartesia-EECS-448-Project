// imports go here
import java.util.Scanner;
//import java.io.IOException;

public class SETTheory {

	public static void main(String[] args) {
		// TODO Parse input, create world, character creation, etc
		boolean gameloop = true;
		Scanner scanner = new Scanner(System.in);
		String cmd;
		System.out.println("Welcome to KUSET Theory!");
		do
		{
			System.out.println(">");
			cmd = new String(scanner.next());
			if (cmd.equals("quit"))
			{
				gameloop = false;
			}	
		}	
		while(gameloop);
		scanner.close();
	}

}
