import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {

	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetTotal() {
		assertEquals(45.0,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	}

	@Test
	void testGetAverage() {
		assertEquals(5.0,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	}

	@Test
	void testGetRowTotal() { 
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(14.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,1),.001);
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(5.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,1),.001);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,1),.001);
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1,1),.001);
	}

	@Test
	void testGetHighestInColumn() {
		assertEquals(7.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1,1),.001);
	}

	@Test
	void testGetHighestInColumnIndex() {
		assertEquals(2.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1,1),.001);
	}

	@Test
	void testGetLowestInColumn() {
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,1),.001);
	}

	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,1),.001);
	}

	@Test
	void testGetHighestInArray() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
	}
	
}
