package agilehub.homework.ciprianbuzduga.exercises;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Write a method that returns an Optional<Integer>, called randomOptionalGenerator.
 * Randomly, the result should be either value 1 or an empty value.
 * Call it from another method and, if it contains no result, throw an exception
 * @author cbuzduga
 */
public class Exercise2 extends Exercise {

	public Exercise2() {
		super(2);
	}

	protected Exercise2(int noOfSubexercise) {
		super(noOfSubexercise);
	}

	@Override
	protected void doInExercise(Object... params) {
		System.out.println("Get randomOptional, if it contains no result, throw an exception");
		Optional<Integer> randomOptional = null;
		do {
			randomOptional = randomOptionalGenerator();
		} while (catchNoSuchElementException()
				.test(randomOptional));
	}

	private Predicate<Optional<Integer>> catchNoSuchElementException() {
		Predicate<Optional<Integer>> pred = new Predicate<Optional<Integer>>() {
			
			@Override
			public boolean test(Optional<Integer> t) {
				try {
					int i = t.orElseThrow();
					System.out.println("Get value " + i);
					return false;
				} catch (NoSuchElementException e) {
					System.out.println("Finally got NoSuchElementException!");
					e.printStackTrace();
					return true;
				}
			}
		};
		return Predicate.not(pred);
	}

	/**
	 * @return an Optional represents an integer value of 1 or an empty Optional
	 */
	protected Optional<Integer> randomOptionalGenerator() {
		Random random = new Random();
		int next = random.nextInt(100);
		if((next % 2) == 0)
			return Optional.of(1);
		return Optional.empty();
	}
}
