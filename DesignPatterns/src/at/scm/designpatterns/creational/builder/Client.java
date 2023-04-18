package at.scm.designpatterns.creational.builder;

public class Client {
	
	public void DoSomethingWithBicycles()
    {
        GTBuilder builder = new GTBuilder();
        MountainBikeBuildDirector director = new MountainBikeBuildDirector(builder);

        director.construct();
        Bicycle myMountainBike = director.getResult();
        
        // do something with it, allow assert?
        
        // better data model?
        
        
        
    }

}
