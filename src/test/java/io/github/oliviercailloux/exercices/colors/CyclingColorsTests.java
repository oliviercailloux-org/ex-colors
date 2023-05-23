package io.github.oliviercailloux.exercices.colors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CyclingColorsTests {
	@Test
	void testSize() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Pink", "Red");
		assertEquals(3, inst.size());
	}
}
