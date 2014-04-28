/**
 * 
 */
package flyweight.model;

/**
 * @author Anil Panicker
 *
 */
public class FlyWeightFont {

	private final String name;
	private final int size;
	private final String style;

	/**
	 * Constructor
	 * @param name
	 * @param size
	 * @param style
	 */
	protected FlyWeightFont(String name, int size, String style){
		this.name = name;
		this.size = size;
		this.style = style;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	@Override
	public String toString(){
		return name + size + style;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(!(obj instanceof FlyWeightFont)){
			return false;
		}
		return (this.toString()).equals(((FlyWeightFont)obj).toString());
	}

	@Override
	public int hashCode(){
		return (this.toString()).hashCode();
	}

}
