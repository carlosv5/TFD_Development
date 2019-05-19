package es.upm.TFD.clase.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runners.Suite;

import es.upm.TFD.clase.src.Color;
import es.upm.TFD.clase.src.Suit;

public class SuitTest {
	
	@Test
	public void givenAnArrayOfInitials_WhenChekingTheInitials_ThenItsTrue() {
		assertTrue(java.util.Arrays.equals(new char[]{'C', 'D', 'H', 'P'},(Suit.initials())));
	}
	
	
	@Test
	public void givenAnInitial_WhenFindingItSuit_ThenTheyAreEquals() {
		assertEquals(Suit.DIAMONDS, Suit.find('D'));
	}
}