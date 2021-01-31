package at.scm.patterns.factory;

public class ShipmentFactory {

	public IShipment createShipment(String shipmentType) {
		IShipment shipment = null;

		switch (shipmentType) {
		case "IS":
			shipment = new ImportShipment();
			break;
		case "ES":
			shipment = new ExportShipment();
			break;
		default:
			throw new UnknownShipmentTypeException(shipmentType);
		}

		return shipment;
	}
}
