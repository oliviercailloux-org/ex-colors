package io.github.oliviercailloux.exercices.colors;

import static com.google.common.base.Verify.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class CyclingColorsTests {

	@Test
	void testIt() throws Exception {
		final CyclingColors inst = new CyclingColors("Blue", "Red", "Red");
		inst.addColors(ImmutableSet.of("Blue"));
		inst.addColors(ImmutableSet.of("Green"));
		final Iterator<String> it = inst.iterator();
		final String c1 = it.next();
		final String c2 = it.next();
		final String c3 = it.next();
		assertEquals(c1, it.next());
		assertEquals(c2, it.next());
		assertEquals(c3, it.next());
		assertEquals(c1, it.next());
		assertEquals(c2, it.next());
		assertEquals(c3, it.next());
		assertEquals(c1, it.next());
	}

	@Test
	void testItStarting() throws Exception {
		final CyclingColors inst = new CyclingColors("Blue", "Red", "Red");
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
		final CyclingColors inst = new CyclingColors("Blue", "Red", "Red");
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
		final CyclingColors inst = new CyclingColors("Blue", "Red", "Red");
		final Collection<String> dupl = inst.withDuplicatedFirstColor();
		inst.addColors(ImmutableSet.of("Green"));
		final Iterator<String> it = dupl.iterator();
		assertTrue(it.hasNext());
		final String c1 = it.next();
		assertTrue(it.hasNext());
		assertEquals(c1, it.next());
		assertTrue(it.hasNext());
		assertNotEquals(c1, it.next());
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
		final List<String> resultingColors = new ArrayList<>();
		Iterators.addAll(resultingColors, it);
		verify(!it.hasNext());
		assertEquals(3, resultingColors.size());
		assertEquals(ImmutableSet.of("Blue", "Red", "Green"), ImmutableSet.copyOf(resultingColors));
	}

	@Test
	void testSnapshot() throws Exception {
		CyclingColors inst = new CyclingColors("Blue", "Red", "Blue");
		final Set<String> snapshot = inst.snapshot();
		inst.addColors(ImmutableSet.of("Green"));
		final Iterator<String> it = snapshot.iterator();
		final List<String> resultingColors = new ArrayList<>();
		Iterators.addAll(resultingColors, it);
		verify(!it.hasNext());
		assertEquals(2, resultingColors.size());
		assertEquals(ImmutableSet.of("Blue", "Red"), ImmutableSet.copyOf(resultingColors));
	}
}
