
import java.io.*;

public abstract class Component implements Serializable {
	/*Constructors*/
	public Component(String name) {
		mName = name;
		mSize = -1;
	}
	
	/*Members*/
	private String mName;
	private int mSize;
	
	/*Attributes*/
	public String name() {
		return mName;
	}
	public int size() {
		return mSize;
	}
	
	public void rename(String name) {
	
		mName = name;
	}
	
	/*Methods*/
}
