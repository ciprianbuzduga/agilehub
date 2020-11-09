package agilehub.homework.ciprianbuzduga.exercises;

import java.util.Objects;

import agilehub.homework.ciprianbuzduga.records.MathematicalOperation;

/**
 * Define an interface called MathematicalOperation.
 * Extend it, and only allow Addition and Subtraction as operations.
 * Each of these operations should be defined as records.
 * Each of them should have the two operands and a way to calculate a result.
 * Write a function that takes two such operations and returns true if they are identical.
 * @author cbuzduga
 */
public class Exercise8 extends Exercise {

	public Exercise8() {
		super(8);
	}

	@Override
	protected void doInExercise(Object... params) {
		Objects.requireNonNull(params);
		Object param1 = params[0];
		Objects.requireNonNull(param1);
		Object param2 = params[1];
		Objects.requireNonNull(param2);
		
		MathematicalOperation addition = (MathematicalOperation) param1;
		MathematicalOperation subtraction = (MathematicalOperation) param2;
		
		int resAdd = addition.calculate();
		int resSub = subtraction.calculate();
		
		System.out.println("Addition result " + resAdd);
		System.out.println("Substraction result " + resSub);

		boolean areIdentical = addition.equals(subtraction);
		System.out.println("Are operations identical ? " + areIdentical);
	}
}
