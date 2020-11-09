package agilehub.homework.ciprianbuzduga.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Write a method that returns a Map<Integer, String> called mapExample.
 * Fill it with 3 separate key - value pairs.
 * Call it from another method and add something to the results.
 * Add a comment in your code to explain the whole behavior (why it works / fails).
 * @author cbuzduga
 */
public class Exercise1 extends Exercise {
	
	public Exercise1() {
		super(1);
	}

	@Override
	protected void doInExercise(Object... params) {
		Map<Integer, String> mapExample1 = mapExample1();
		Map<Integer, String> mapExample2 = mapExample2();
		Map<Integer, String> mapExample3 = mapExample3();
		Map<Integer, String> mapExample4 = mapExample4();
		
		System.out.println("Try to modify mapExample1, all should gone ok");
		putKeyValue(1, mapExample1, 1, "B");
		removeKeyValue(1, mapExample1, 1);

		System.out.println("\nTry to modify mapExample2, you must get UnsupportedOperationException");
		try {
			putKeyValue(2, mapExample2, 1, "B");
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		try {
			removeKeyValue(2, mapExample2, 1);
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nTry to modify mapExample3, you must get UnsupportedOperationException");
		try {
			putKeyValue(3, mapExample3, 1, "B");
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		try {
			removeKeyValue(3, mapExample3, 1);
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nTry to modify mapExample4, you must get UnsupportedOperationException");
		try {
			putKeyValue(4, mapExample4, 1, "B");
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		try {
			removeKeyValue(4, mapExample4, 1);
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}

	private void putKeyValue(int indexMap, Map<Integer, String> mapExample, Integer key, String value)
			throws UnsupportedOperationException {
		System.out.println("MapExample" + indexMap + " " + mapExample);
		String message = String.format("[key:%s][value:%s]", key, value);
		System.out.println("Put " + message);
		String previousValue = mapExample.put(1, "B");
		System.out.println("Modify MapExample" + indexMap + " " + mapExample + " with old value " + previousValue + " for key " + 1);
	}
	
	private void removeKeyValue(int indexMap, Map<Integer, String> mapExample, Integer key)
			throws UnsupportedOperationException {
		System.out.println("MapExample" + indexMap + " " + mapExample);
		String message = String.format("[key:%s]", key);
		System.out.println("Remove " + message);
		String previousValue = mapExample.remove(1);
		System.out.println("Modify MapExample" + indexMap + " " + mapExample + " with old value " + previousValue + " for key " + 1);
	}

	/**
	 * @return a HashMap implementation. You can do:</br>
	 * 1. Put a new pair of key with value</br>
	 * 2. Remove a pair
	 */
	public Map<Integer, String> mapExample1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		return map;
	}
	
	/**
	 * @return Unmodifiable map with Map.of. You can't do:</br>
	 * 1. Put a new pair of key with value</br>
	 * 2. Remove a pair
	 */
	public Map<Integer, String> mapExample2() {
		return Map.of(1, "A", 2, "B", 3, "C");
	}

	/**
	 * @return Unmodifiable map with Map.copyOf. You can't do:</br>
	 * 1. Put a new pair of key with value</br>
	 * 2. Remove a pair
	 */
	public Map<Integer, String> mapExample3() {
		return Map.copyOf(mapExample1());
	}

	/**
	 * @return Unmodifiable map with Map.ofEntries. You can't do:</br>
	 * 1. Put a new pair of key with value</br>
	 * 2. Remove a pair
	 */
	@SuppressWarnings("unchecked")
	public Map<Integer, String> mapExample4() {
		return Map.ofEntries(mapExample1().entrySet()
				.stream().toArray(Entry[]::new));
	}
}
