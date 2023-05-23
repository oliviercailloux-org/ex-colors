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
 * An instance of this class should equal another one iff they contain the same
 * colors. (Do not forget that if you override {@link #equals(Object)}, you also
 * have to override another method.)
 */
public class CyclingColors implements Iterable<String> {

	/**
	 * Builds an instance that contains at most three colors.
	 */
	public CyclingColors(String color1, String color2, String color3) {
		/* TODO */
	}

	/**
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

	public void addColors(Collection<String> colors) {
		/* TODO */
	}

	public void removeColor() {
		/* TODO */
	}

	public int size() {
		/* TODO */
		return -10;
	}

	public Collection<String> withDuplicatedFirstColor() {
		/* TODO */
		return null;
	}

	public Set<String> asSetOfColors() {
		/* TODO */
		return null;
	}

	public Set<String> snapshot() {
		/* TODO */
		return null;
	}

}
