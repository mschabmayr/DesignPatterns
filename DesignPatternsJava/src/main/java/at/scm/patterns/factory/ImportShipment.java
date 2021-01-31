package at.scm.patterns.factory;

public class ImportShipment implements IShipment {

	public ImportShipment() {
		super();
	}

	@Override
	public String getDescription() {
		return "Import Shipment";
	}

}
