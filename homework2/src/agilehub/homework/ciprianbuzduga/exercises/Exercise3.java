package agilehub.homework.ciprianbuzduga.exercises;

import java.util.Optional;

/**
 * Write a method that calls randomOptionalGenerator.
 * If it returns a value, print it. Otherwise, print the message: “You’ve reached the end of INT”
 * @author cbuzduga
 */
public class Exercise3 extends Exercise2 {

	public Exercise3() {
		super(3);
	}

	@Override
	protected void doInExercise(Object... params) {
		System.out.println("Call randomOptionalGenerator...");
		Optional<Integer> randomOptional = randomOptionalGenerator();
		randomOptional.ifPresentOrElse(
				res -> System.out.println("Got result " + res),
				() -> System.out.println("You’ve reached the end of INT"));
	}

}
