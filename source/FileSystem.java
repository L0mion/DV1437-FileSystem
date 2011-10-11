import java.util.*;

/*This is the main class of the program*/

public class FileSystem {
	
	/*Constructors*/
	public FileSystem() {
		mCurrentDirectory = new Directory("root");
		mCurrentAction = "";
		mInput = new Scanner(System.in);
		mRunning = true;	
		mPaths = new ArrayList<CommandPath>();
		mActions = new String[19];
		//blocks = new ArrayList<byte[]>();
		 
		mActions[0] = "format"; 	//bygger upp ett tomt system (“formatterar skivan”)
		mActions[1] = "quit"; 		//lämnar körningen
		mActions[2] = "exit";		//lämnar körningen
		mActions[3] = "save";		//sparar systemet som en vanlig UNIX-fil
		mActions[4] = "read";		//återställer ett filsystem från en UNIX-fil
		mActions[5] = "create";		//skapar en fil (lägger in text till extra tom rad)
		mActions[6] = "cat";		//skriver ut innehållet i en fil
		mActions[7] = "ls";			//listar innehållsförteckningen I en catalog
		mActions[8] = "dir";		//listar innehållsförteckningen I en catalog
		mActions[9] = "copy";		//kopierar en fil
		mActions[10] = "append";	//lägger till på slutet av filen
		mActions[11] = "rename";	//ändrar namn på fil
		mActions[12] = "rn";		//ändrar namn på fil
		mActions[13] = "mkdir"; 	//skapar ny tom catalog
		mActions[14] = "cd"; 		//ändrar aktuell catalog
		mActions[15] = "pwd";		//skriver namn på aktuell katalog (print working directory)
		mActions[16] = "rm";		//tar bort en fil
		mActions[17] = "remove";	//tar bort en fil
		mActions[18] = "help";
		
		start();
	}
	
	/*Members*/
	private boolean mRunning;
	private Directory mCurrentDirectory;
	private Scanner mInput;
	private ArrayList<CommandPath> mPaths;
	private String mCurrentAction;
	private String[] mActions;
	//private ArrayList<byte[]> blocks;
	
	/*Attributes*/
	
	/*Methods*/
	private void start() {
		while(mRunning) {
			if(validCommand()) {
				executeCommand();
			}
		}
	}
	private boolean validCommand() {
			//In order to avoid inconsistencies - reset relevant command variables.
			resetCommandVariables();
		
			/*Get input*/
			String currentInput;
			currentInput = mInput.nextLine();
			
			/*Interpet action*/
			String[] command;
			command = currentInput.split(" ", 100);
			
			boolean validCommand = false;
			if(command.length > 0) {
				//Assumption: The action is always specified firsthand.
				mCurrentAction = command[0];
				
				for(int i = 0; i < mActions.length; i++) {
					if(mCurrentAction.equals(mActions[i])) {
						validCommand = true;
					}
				}
			}
			else {
				System.out.println("Blank command input detected. No action performed.");
			}
			
			if(validCommand) {
					if(command.length > 1) {	//e.g. one or more paths specified
						for(int i = 1; i < command.length; i++) {
							/*Interpret command paths*/
							String localPath = command[i];
							String[] localCommand = localPath.split("/");
							mPaths.add(new CommandPath(localCommand));
						}
					}
					return true;
			}
			else {
				System.out.println("No valid input. Enter 'help' for a list of valid commands.");
			}
			
			return false;
	}
	private void resetCommandVariables() {
		mCurrentAction = "";
		mPaths = new ArrayList<CommandPath>();
	}
	private void executeCommand() {
		if(mCurrentAction == "format") {
		}
		else if(mCurrentAction.equals("quit") || mCurrentAction.equals("exit")) {
			mRunning = false;
		}
		else if(mCurrentAction.equals("dir")) {
		}
		else if(mCurrentAction.equals("copy")) {
		}
		else if(mCurrentAction.equals("append")) {
		}
		else if(mCurrentAction.equals("rn") || mCurrentAction.equals("rename")) {
		}
		else if(mCurrentAction.equals("mkdir")) {
		}
		else if(mCurrentAction.equals("cd")) {
		}
		else if(mCurrentAction.equals("pwd")) {
		}
		else if(mCurrentAction.equals("rm") || mCurrentAction.equals("remove")) {
		}
		else if(mCurrentAction.equals("help")) {
			printHelp();
		}
	}

	private void printHelp() {
		System.out.println("\nValid commands:");
		for(int i = 0; i < mActions.length; i++) {
			System.out.println(" - " + mActions[i]);
		}
	}
	
	private void save() {
	
		/*
		 * Find root directory
		 */
		Component parent = null;
		do {
			
			parent = mCurrentDirectory.getParent();
		
		}while(parent != null);
		
		/*
		 * Save root which will save everything under root
		 */
		 
		 FileOutputStream fileStream = new FileOutputStream("../resources/
	}
}
