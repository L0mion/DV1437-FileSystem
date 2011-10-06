import java.util.*;

/*This is the main class of the program*/

public class FileSystem {
	
	/*Constructors*/
	public FileSystem() {

		System.out.println("##Startup: Constructing FileSystem");
		mCurrentDirectory = new Directory("root");
		
		mInput = new Scanner(System.in);
		mRunning = true;
		
		//blocks = new ArrayList<byte[]>();
		
		start();
	}
	
	/*Members*/
	private boolean mRunning;
	private Directory mCurrentDirectory;
	private Scanner mInput;
	//private ArrayList<byte[]> blocks;
	
	/*Attributes*/
	
	/*Methods*/
	private void start() {
		String currentInput;
		String[] command;
		while(mRunning) {
			/*Get input*/
			currentInput = mInput.nextLine();
			
			/*Interpet input*/
			command = currentInput.split(" ", 100);
			
			for(int i = 0; i < command.length; i++) {
				System.out.println(command[i]);
			}
			
			/*Perform command*/
		}
	}
}
