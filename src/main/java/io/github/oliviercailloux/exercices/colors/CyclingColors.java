package io.github.oliviercailloux.exercices.colors;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * A modifiable set of colors over which it is possible to iterate infinitely,
 * cycling through the available colors. The order of iteration among the colors
 * contained in this object is unspecified during the first cycle, but further
 * cycles should keep iterating in the same order.
 * <p>
 * For example, if an instance contains the three colors "Red", "Blue" and
 * "Green", an iterator might return "Red", "Blue", "Green", "Red", "Blue", and
 * so on indefinitely; or "Blue", "Red", "Green", "Blue", "Red", "Green", …
 * <p>
 * An instance does not contain duplicate colors.
 * <p>
 * An instance of this class should equal another one iff they contain the same
 * colors. (Do not forget that if you override {@link #equals(Object)}, you also
 * have to override another method.)
 */
public class CyclingColors implements Iterable<String> {

	/**
	 * Builds an instance that contains at most three colors.
	 *
	 * @throws NullPointerException if some of the given colors are {@code null}
	 */
	public CyclingColors(String color1, String color2, String color3) {
		/* TODO */
	}

	/**
	 * Returns an iterator cycling over the colors contained in this instance.
	 *
	 * @return an iterator that always has a next element.
	 */
	public Iterator<String> iterator() {
		/* TODO */
		return null;
	}

	/**
	 * Returns an iterator that starts iterating at the given color.
	 * <p>
	 * For example, if this object contains the colors "Green" and "Yellow", given a
	 * starting color of "Yellow", the iterator will return "Yellow", "Green",
	 * "Yellow", "Green", "Yellow", and so on.
	 *
	 * @param startingColor the color to start at
	 * @return an iterator that always has a next element
	 * @throws IllegalArgumentException if the given starting color is not in this
	 *                                  object.
	 */
	public Iterator<String> iterator(String startingColor) {
		/* TODO */
		return null;
	}

	/**
	 * Adds the given colors, so that future iterations (not ongoing ones) will
	 * consider them.
	 * <p>
	 * The colors in the given collection that are already in this object are
	 * <em>not</em> added again.
	 *
	 * @param colors the colors to add.
	 */
	public void addColors(Collection<String> colors) {
		/* TODO */
	}

	/**
	 * Returns the number of colors in this object.
	 *
	 * @return a non-negative integer.
	 */
	public int size() {
		/* TODO */
		return -10;
	}

	/**
	 * Returns a fixed collection of the colors contained in this instance at the
	 * time of the call, thus, one that is not modified when this instance is
	 * modified, and that contains the first color (in the iteration order) twice.
	 * The returned collection iteration does <em>not</em> cycle.
	 * <p>
	 * For example, if this instance contains the colors "Green" and "Blue", this
	 * method returns a collection that when iterated returns "Green", "Green" and
	 * "Blue".
	 *
	 * @return these colors with the first one duplicated, in a non-cyclic
	 *         collection
	 */
	public Collection<String> withDuplicatedFirstColor() {
		/* TODO */
		return null;
	}

	/**
	 * Returns a set view of the colors contained in this object. The returned set
	 * is a dynamic view of the colors contained in this object, thus, it is
	 * modified when the colors in this object change.
	 * <p>
	 * For example, calling this method to obtain a set <code>s</code> then adding a
	 * color to this instance modifies <code>s</code> as well.
	 *
	 * @return a view of the colors in this object.
	 */
	public Set<String> asSetOfColors() {
		/* TODO */
		return null;
	}

	/**
	 * Returns a fixed set of the colors contained in this instance at the time of
	 * the call, thus, one that is not modified when this instance is modified. The
	 * returned set iteration does <em>not</em> cycle.
	 * <p>
	 * For example, if this instance contains the colors "Green" and "Blue", this
	 * method returns a set that when iterated returns "Green" and "Blue".
	 *
	 * @return these colors in a (non-cyclic) set
	 */
	public Set<String> snapshot() {
		/* TODO */
		return null;
	}

}
