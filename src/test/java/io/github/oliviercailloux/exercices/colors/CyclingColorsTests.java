package io.github.oliviercailloux.exercices.colors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class CyclingColorsTests {

	@Test
	void testIt() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Red", "Red");
		inst.addColors(ImmutableSet.of("Blue"));
		inst.addColors(ImmutableSet.of("Green"));
		final Iterator<String> it = inst.iterator();
		assertEquals("Blue", it.next());
		assertEquals("Red", it.next());
		assertEquals("Green", it.next());
		assertEquals("Blue", it.next());
		assertEquals("Red", it.next());
		assertEquals("Green", it.next());
		assertEquals("Blue", it.next());
		assertEquals("Red", it.next());
		assertEquals("Green", it.next());
		assertEquals("Blue", it.next());
	}

	@Test
	void testItStarting() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Red", "Blue");
		final Iterator<String> it = inst.iterator("Red");
		assertEquals("Red", it.next());
		assertEquals("Blue", it.next());
		assertEquals("Red", it.next());
		assertEquals("Blue", it.next());
		assertEquals("Red", it.next());
		assertEquals("Blue", it.next());
	}

	@Test
	void testAddWhileIt() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Red", "Blue");
		final Iterator<String> it = inst.iterator("Red");
		assertEquals("Red", it.next());
		inst.addColors(ImmutableSet.of("Green"));
		assertEquals("Blue", it.next());
		assertEquals("Red", it.next());
		assertEquals("Blue", it.next());
		assertEquals("Red", it.next());
		assertEquals("Blue", it.next());
	}

	@Test
	void testWithDuplicated() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Red", "Blue");
		final Collection<String> dupl = inst.withDuplicatedFirstColor();
		inst.addColors(ImmutableSet.of("Green"));
		final Iterator<String> it = dupl.iterator();
		assertTrue(it.hasNext());
		assertEquals("Blue", it.next());
		assertTrue(it.hasNext());
		assertEquals("Blue", it.next());
		assertTrue(it.hasNext());
		assertEquals("Red", it.next());
		assertFalse(it.hasNext());
	}

	@Test
	void testSize() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Pink", "Red");
		assertEquals(3, inst.size());
	}

	@Test
	void testAsSet() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Red", "Blue");
		final Set<String> asSet = inst.asSetOfColors();
		inst.addColors(ImmutableSet.of("Green"));
		final Iterator<String> it = asSet.iterator();
		assertTrue(it.hasNext());
		assertEquals("Blue", it.next());
		assertTrue(it.hasNext());
		assertEquals("Red", it.next());
		assertTrue(it.hasNext());
		assertEquals("Green", it.next());
		assertFalse(it.hasNext());
	}

	@Test
	void testSnapshot() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Red", "Blue");
		final Set<String> snapshot = inst.snapshot();
		inst.addColors(ImmutableSet.of("Green"));
		final Iterator<String> it = snapshot.iterator();
		assertTrue(it.hasNext());
		assertEquals("Blue", it.next());
		assertTrue(it.hasNext());
		assertEquals("Red", it.next());
		assertFalse(it.hasNext());
	}
}
