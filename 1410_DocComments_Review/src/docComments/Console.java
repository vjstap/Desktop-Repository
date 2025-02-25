package docComments;

/**
 * Class that stores data for specific consoles with getter methods to return
 * each specific piece of information and a toString method
 * 
 * @author vincentstapley
 * @version 1
 */

public class Console {
	private String brand;
	private String model;
	private String storage;
	private final int id;
	private static int count = 0;

	/**
	 * Constructor for Console object with brand, model, storage, and id's
	 * 
	 * @param brand   Brand of console
	 * @param model   Model of console
	 * @param storage Storage amount of console
	 */

	public Console(String brand, String model, String storage) {
		this.id = 1234567 + count++;
		this.brand = brand;
		this.model = model;
		this.storage = storage;
	}

	/**
	 * Returns brand of console
	 * 
	 * @return brand of console
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Returns id of console
	 * 
	 * @return id of console
	 */
	public int getId() {
		return id;
	}

	/**
	 * Returns storage of console
	 * 
	 * @return storage of console
	 */
	public String getStorage() {
		return storage;
	}

	/**
	 * Returns model of console
	 * 
	 * @return model of console
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns a string with the brand model storage and id
	 */
	@Override
	public String toString() {
		return brand + " " + model + " (" + storage + ") id: " + id;
	}
}
