package at.scm.designpatterns.creational.builder;

public class MountainBikeBuildDirector {
	
	private IBicycleBuilder bicycleBuilder;
	private Bicycle bicycle;
	
	public MountainBikeBuildDirector(IBicycleBuilder bicycleBuilder) {
		super();
		this.bicycleBuilder = bicycleBuilder;
		
	}
	public void construct() {
		this.bicycle = new Bicycle();
	}
	
	public Bicycle getResult() {
		return this.bicycle;
	}

}
