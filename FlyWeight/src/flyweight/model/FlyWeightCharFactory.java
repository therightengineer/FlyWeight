/**
 * This is Character Factory.
 * Given a unicode entry it returns Character object.
 */
package flyweight.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Anil Panicker
 *
 */
public final class FlyWeightCharFactory {

	private static Map<Character,FlyWeightCharacter> charMap = new ConcurrentHashMap<>();

	/**
	 * Given a unicode this method will return the flyWeight Character object
	 * representing that unicode
	 */
	public static FlyWeightCharacter getCharacter(char unicode){
		FlyWeightCharacter flyWeightCharacter = charMap.get(unicode);
		return flyWeightCharacter != null ? flyWeightCharacter : createAndReturnFlyWeightChar(unicode);

	}

	/**
	 * create a new FlyWeightCharacter object for the given unicode
	 * @param unicode
	 * @return
	 */
	private static FlyWeightCharacter createAndReturnFlyWeightChar(char unicode) {
		FlyWeightCharacter flyWeightCharacter = new FlyWeightCharacter(unicode);
		charMap.put(unicode, flyWeightCharacter);
		return flyWeightCharacter;
	}
}
