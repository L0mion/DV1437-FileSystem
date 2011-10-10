import java.util.*;

public class CommandPath {
	ArrayList<String> mPaths;
	int currentIndex;

	public CommandPath(String[] paths) {
		mPaths = new ArrayList<String>();
		currentIndex = -1;
	
		for(int i = 0; i < paths.length; i++) {
			mPaths.add(paths[i]);
		}
	}
	public String getNext() {
		if(currentIndex < 0) {
			currentIndex = 0;
			return mPaths.get(currentIndex);
		}
		else {
			currentIndex++;
			return mPaths.get(currentIndex);
		}
	}
	public String getPrevious() {
		if(currentIndex < 1) {
			currentIndex = 0;
			return mPaths.get(currentIndex);
		}
		else {
			currentIndex--;
			return mPaths.get(currentIndex);
		}
	}
	public void print() {
		for(int i = 0; i < mPaths.size(); i++) {
			System.out.println(mPaths.get(i));
		}
	}
}
