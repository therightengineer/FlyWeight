/**
 * 
 */
package flyweight.runarray;

import java.util.TreeMap;

import flyweight.model.FlyWeightFont;

/**
 * @author therightengineer
 *
 */
public class RunArray {
	private TreeMap<Integer,FlyWeightFont> runArray = new TreeMap<>();
	private int lastRunLength = 0;
	private static final int STARTING_INDEX = 0;

	/**
	 * Adds run with starting index info to the runArray
	 * @param startIndex
	 * @param runLength
	 * @param Font
	 */
	public void addRun(int startIndex, int runLength, FlyWeightFont Font){
		runArray.put(startIndex,Font);
		lastRunLength = runLength;
	}

	/**
	 * Adds run without start index info to runArray
	 * @param runLength
	 * @param Font
	 */
	public void appendRun(int runLength, FlyWeightFont Font){
		if(runArray.isEmpty()){
			runArray.put(STARTING_INDEX,Font);
		}else{
			runArray.put(runArray.lastKey() + lastRunLength,Font);
		}
		lastRunLength = runLength;
	}

	/**
	 * Given an index position returns the font info for character at that position
	 * @param index
	 * @return Null if the inputed index is outside the recorded run else
	 * returns Font info for char at that location
	 */
	public FlyWeightFont findFontInfo(int index){
		if(index < 0 || index > runArray.lastKey() + lastRunLength){
			return null;
		}else{
			return (FlyWeightFont) (runArray.get(index) != null ? runArray.get(index) : runArray.get(runArray.lowerKey(index))); 
		}
	}
}

