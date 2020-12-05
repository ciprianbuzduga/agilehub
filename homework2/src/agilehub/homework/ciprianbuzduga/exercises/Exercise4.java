package agilehub.homework.ciprianbuzduga.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Write a method that calculates the difference between the largest and the smallest number in a list of integers
 * @author cbuzduga
 */
public class Exercise4 extends Exercise {

	public Exercise4() {
		super(4);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doInExercise(Object... params) {
		Objects.requireNonNull(params);
		Object param = params[0];
		Objects.requireNonNull(param);
		List<Integer> list = (List<Integer>) param;
		int size = list.size();
		if(size < 2)
			throw new IllegalArgumentException("The List must contains at least two elements");
		
		//By the way Collections.sort delegates to List.sort
		//More good performance is to find manual elements
		list.sort(Comparator.naturalOrder());
		
		int largestEl = list.get(size-1);
		int smallesEl = list.get(0);
		int difference = largestEl - smallesEl;
		String message = String.format("Found largest %s and smalles %s numbers. Differnce between this is %s",
				largestEl, smallesEl, difference);
		System.out.println(message);
	}

}
