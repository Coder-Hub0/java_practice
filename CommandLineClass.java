

/*
 * Write a java program to pass command line Argument and display its on the screen
 */
public class CommandLineClass {
	public static void main(String... strings) {
		if(strings.length>1)
		{
			for(String string:strings)
			{
				System.out.println(string);
			}
		}
	}
}
