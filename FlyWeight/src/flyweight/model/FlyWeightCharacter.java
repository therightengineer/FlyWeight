/**
 * 
 */
package flyweight.model;

/**
 * @author Anil Panicker
 *
 */
public class FlyWeightCharacter {

	private final char unicode;
	
	protected FlyWeightCharacter(char unicode){
		this.unicode = unicode;
	}
	
	
	/**
	 * @return the unicode
	 */
	public char getUnicode() {
		return unicode;
	}
}
