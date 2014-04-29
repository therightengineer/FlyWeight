/**
 * 
 */
package flyweight.runarray;

import java.util.TreeMap;

import flyweight.model.FlyWeightFont;

/**
 * @author Anil Panicker
 *
 */
public class RunArray {
	private TreeMap<Integer,FlyWeightFont> runArray = new TreeMap<>();
	private int lastRunLength = 0;
	private static final int STARTING_INDEX = 0;

	public void addRun(int startIndex, int runLength, FlyWeightFont Font){
		runArray.put(startIndex,Font);
		lastRunLength = runLength;
	}

	public void appendRun(int runLength, FlyWeightFont Font){
		if(runArray.isEmpty()){
			runArray.put(STARTING_INDEX,Font);
		}else{
			runArray.put(runArray.lastKey() + lastRunLength,Font);
		}
		lastRunLength = runLength;
	}
}

