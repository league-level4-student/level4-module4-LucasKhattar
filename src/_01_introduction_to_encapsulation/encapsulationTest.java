package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class encapsulationTest {
	EncapsulateTheData etd = new EncapsulateTheData();

	@Test
	void itemsReceivedTest() {
		etd.setItemsReceived(-4);
		assertEquals(0, etd.getItemsReceived());
	}
	
	@Test
	void degreesTurnedTest() {
		etd.setDegreesTurned(379);
		assertEquals(360, etd.getDegreesTurned());	
	}
	
	@Test
	void nomenclatureTest() {
		etd.setNomenclature("");
		assertEquals(" ", etd.getNomenclature());
	}
	
	@Test
	void memberObjTest() {
		etd.setMemberObj(new String());
		assertEquals(new Object(), etd.getMemberObj());	
	}

}
