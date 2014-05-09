/**
 * This is Font Factory.
 * In this factory the input will be a triple:
 * font name, point size and style
 */
package flyweight.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author therightengineer
 *
 */
public final class FlyWeightFontFactory {
	private static Map<String,FlyWeightFont> fontMap = new ConcurrentHashMap<>();
	
	/**
	 * This method creates FlyWeightFont object given name, size and style
	 * @param name
	 * @param size
	 * @param style
	 * @return FlyWeightFont object
	 */
	public FlyWeightFont getFont(String name, int size, String style){
		FlyWeightFont flyWeightFont = fontMap.get(name + size + style);
		return flyWeightFont != null ? flyWeightFont : createAndReturnFlyWeightFont(name, size, style);
	}

	/**
	 * This method creates a new FlyWeightFont object, makes an entry in the map
	 * for this FlyWeightFont and also return it
	 * @param name
	 * @param size
	 * @param style
	 * @return FlyWeightFont
	 */
	private FlyWeightFont createAndReturnFlyWeightFont(String name, int size, String style) {
		FlyWeightFont flyWeightFont = new FlyWeightFont(name, size, style);
		fontMap.put(name + size + style, flyWeightFont);
		return flyWeightFont;
	}
}
