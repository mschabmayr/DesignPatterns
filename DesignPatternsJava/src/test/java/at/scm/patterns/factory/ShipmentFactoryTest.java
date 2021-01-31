package at.scm.patterns.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShipmentFactoryTest {

	private void runCreateShipmentTest(String shipmentType, String expectedDescription) {
		ShipmentFactory factory = new ShipmentFactory();
		IShipment shipment = factory.createShipment(shipmentType);
		assertEquals(expectedDescription, shipment.getDescription());
	}

	@Test
	// @DisplayName("shipment factory created import shipment")
	public void testCreateImportShipment() {
		runCreateShipmentTest("IS", "Import Shipment");
	}

	@Test
	// @DisplayName("shipment factory created export shipment")
	public void testCreateExportShipment() {
		runCreateShipmentTest("ES", "Export Shipment");
	}

}
