public abstract class Component {
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
	
	/*Methods*/
}
