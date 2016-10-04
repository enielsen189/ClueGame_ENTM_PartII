package tests;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;

import clueGame.Board;
import experiment.BoardCell;
import experiment.IntBoard;

public class loadConfigFileTests{
	public static final int LEGEND_SIZE = 11;
	public static final int NUM_ROWS = 24;
	public static final int NUM_COLUMNS = 21;
	
	@BeforeClass
	public static void setUp(){
		Board board = Board.getInstance();
		board.setConfigFiles("ClueLegend.txt", "ClueLayout.csv");
		board.initialize();
	}

	@Test
	public void numRoomsTest(){
		Board board = Board.getInstance();
		Map<Character, String> legend = board.getLegend();
		assertEquals(LEGEND_SIZE, legend.size());
		assertEquals("Mercury", legend.get('M'));
		assertEquals("Neptune", legend.get('N'));
		assertEquals("Jupiter", legend.get('J'));
		assertEquals("Uranus", legend.get('U'));
	}


	@Test
	public void numRowsColsTest(){
		Board board = Board.getInstance();
		assertEquals(NUM_ROWS, board.numRows);
		assertEquals(NUM_COLUMNS, board.numColumns);
	}


	//Test to verify at least one doorway in each direction.
	//Also verify cells that don't contain doorways return false for isDoorway
	@Test
	public void doorwayDirectionsTest(){
		Board board = Board.getInstance();
		BoardCell room = board.getCellAt(1,5);
		assertTrue(room.isDoorway());
	}
	

	//Test that the correct number of doors have been loaded



	//Test some of the cells to ensure they have the correct initial
	
	
}

