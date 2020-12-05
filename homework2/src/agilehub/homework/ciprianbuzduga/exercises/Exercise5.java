package agilehub.homework.ciprianbuzduga.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Write a method that takes a List<String> as a parameter.
 * If it’s an ArrayList, iterate over it using forEach, and print each element.
 * If it’s a LinkedList and it’s not empty, iterate over it using descendingIterator.
 * Otherwise, print a disappointing error message.
 * @author cbuzduga
 */
public class Exercise5 extends Exercise {

	public Exercise5() {
		super(5);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doInExercise(Object... params) {
		Objects.requireNonNull(params);
		Object param = params[0];
		Objects.requireNonNull(param);
		if(param instanceof ArrayList) {
			System.out.println("Got an Arraylist, iterate using forEach, and print each element");
			ArrayList<String> list = (ArrayList<String>) param;
			list.forEach(System.out::println);
		} else if(param instanceof LinkedList && !((LinkedList<String>) param).isEmpty()) {
			System.out.println("Got a LinkedList, iterate using descendingIterator, and print each element");
			LinkedList<String> list = (LinkedList<String>) param;
			System.out.println("All elements in LinkedList " + list);
			list.descendingIterator().forEachRemaining(System.out::println);
		} else
			System.err.println("Ohh crap! What kind of list you sent?");
	}

}
