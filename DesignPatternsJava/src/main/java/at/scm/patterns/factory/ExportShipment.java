package at.scm.patterns.factory;

public class ExportShipment implements IShipment {

	public ExportShipment() {
		super();
	}

	@Override
	public String getDescription() {
		return "Export Shipment";
	}

}
