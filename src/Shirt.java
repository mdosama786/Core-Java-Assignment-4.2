/**
 * @Create a main class Shirt
 * 
 */
public class Shirt {
	/** @Declaration */
	private int shirtcollarsize;
	private int shirtsleevlength;
	private String shirtmaterial;

	/** @creating constructor */
	public Shirt() {
		int shirtcollarsiz = 10;
		int shirtsleevlhengt = 40;
		/** @final */
		final String shirtmaterial = "Nialon";
		/** @Output */
		System.out.println("Default constructor shirt length: " + shirtsleevlhengt);
		System.out.println("Default costructor collar size: " + shirtcollarsiz);
		System.out.println("Material is: " + shirtmaterial);
	}

	/** @Constructor */
	public Shirt(int shirtsleevlength, int shirtcollarsize) {
		System.out.println("Parametrised shirt length: " + shirtsleevlength);
		System.out.println("Parametrised collar length: " + shirtcollarsize);
	}

	/** @get method */
	public int getShirtcollarsize() {
		return shirtcollarsize;
	}

	/** @get method */
	public int getshirtsleevlength() {
		return shirtsleevlength;
	}

	/** @get method */
	public String getshirtmaterial() {
		return shirtmaterial;
	}

	/** @set method */
	public void setshirtcollarsize(int newvalue) {
		shirtcollarsize = newvalue;
	}

	/** @set method */
	public void setshirtsleevlength(int newvalue) {
		shirtsleevlength = newvalue;
	}

	/** @set method */
	public void setshirtmaterial(String newvalue) {
		shirtmaterial = newvalue;
	}
}
