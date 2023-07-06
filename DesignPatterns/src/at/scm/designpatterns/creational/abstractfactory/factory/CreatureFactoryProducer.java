package at.scm.designpatterns.creational.abstractfactory.factory;

public class CreatureFactoryProducer {

	public static AbstractCreatureFactory getFactory(String colour) {
		AbstractCreatureFactory creatureFactory;

		switch (colour) {
		case "Black":
			creatureFactory = new BlackCreatureFactory();
			break;
		case "Blue":
			creatureFactory = new BlueCreatureFactory();
			break;
		case "Green":
			creatureFactory = new GreenCreatureFactory();
			break;
		case "Red":
			creatureFactory = new RedCreatureFactory();
			break;
		case "White":
			creatureFactory = new WhiteCreatureFactory();
			break;
		default:
			throw new UnsupportedOperationException(
					"Encountered unsupported colour during factory creation: " + colour);
		}

		return creatureFactory;
	}

}
