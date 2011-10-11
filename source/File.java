
import java.io.*;

public class File extends Component implements Serializable{
	
	private int mDataPointer;
	
	public File() {
			
		super("default");
		mDataPointer = -1;
	}
	
	public File(int dataPointer, String name) {
	
		super(name);
		
		mDataPointer = dataPointer;
	}
	
	public int getDataPointer() {
	
		return mDataPointer;
	}
}
