package at.scm.patterns.factory;

@SuppressWarnings("serial")
public class UnknownShipmentTypeException extends RuntimeException {

	public UnknownShipmentTypeException(String shipmentType) {
		super("Unexpected shipment type: " + shipmentType);
	}

}
