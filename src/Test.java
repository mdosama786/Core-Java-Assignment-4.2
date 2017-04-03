/** @Create class Test */
public class Test {
	/** @main method */
	public static void main(String[] args) {
		/** @creating object */
		Shirt obj = new Shirt();
		new Shirt(11, 43);
		/** @calling set method */
		obj.setshirtcollarsize(3);
		obj.setshirtsleevlength(5);
		obj.setshirtmaterial("Nailon");
		/** @Output */
		System.out.println("Shirt coller size is: " + obj.getShirtcollarsize());
		System.out.println("Shirt leev length is: " + obj.getshirtsleevlength());
		System.out.println("Material of shirt is: " + obj.getshirtmaterial());
	}
}
