package at.scm.designpatterns.creational.abstractfactory.model.base;

public class Wall {

	private int width; // m
	private int height; // m
	private String material;
	private String effect;
	
	public Wall() {
		super();
	}

	public Wall(int width, int height, String material, String effect) {
		super();
		this.width = width;
		this.height = height;
		this.material = material;
		this.effect = effect;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

}
