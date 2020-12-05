package agilehub.homework.ciprianbuzduga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import agilehub.homework.ciprianbuzduga.exercises.Exercise;
import agilehub.homework.ciprianbuzduga.exercises.Exercise1;
import agilehub.homework.ciprianbuzduga.exercises.Exercise2;
import agilehub.homework.ciprianbuzduga.exercises.Exercise3;
import agilehub.homework.ciprianbuzduga.exercises.Exercise4;
import agilehub.homework.ciprianbuzduga.exercises.Exercise5;
import agilehub.homework.ciprianbuzduga.exercises.Exercise6;
import agilehub.homework.ciprianbuzduga.exercises.Exercise7;
import agilehub.homework.ciprianbuzduga.exercises.Exercise7.Days;
import agilehub.homework.ciprianbuzduga.exercises.Exercise8;
import agilehub.homework.ciprianbuzduga.records.Addition;
import agilehub.homework.ciprianbuzduga.records.Subtraction;

public class Main {

	public static void main(String[] args) {
		Exercise exercise1 = new Exercise1();
		exercise1.doHomework();
		
		Exercise exercise2 = new Exercise2();
		exercise2.doHomework();
		
		Exercise exercise3 = new Exercise3();
		exercise3.doHomework();
		
		Exercise exercise4 = new Exercise4();
		List<Integer> integers = randomListIntegers(100);
		exercise4.doHomework(integers);
		
		Exercise exercise5 = new Exercise5();
		List<String> strings = randomListStrings(10, ArrayList::new);
		exercise5.doHomework(strings);
		
		strings = randomListStrings(10, LinkedList::new);
		exercise5.doHomework(strings);
		
		exercise5.doHomework(new Object());
		
		Exercise exercise6 = new Exercise6();
		Map<String, String> props = Map.of("name", "Ciprian", "greeting", "Salut");
		exercise6.doHomework(props);
		
		Exercise exercise7 = new Exercise7();
		exercise7.doHomework(Days.values());

		Exercise exercise8 = new Exercise8();
		Addition addition = new Addition(4, 2);
		Subtraction subtraction = new Subtraction(4, 2);
		exercise8.doHomework(addition, subtraction);
	}

	private static List<Integer> randomListIntegers(int interval) {
		List<Integer> list = new ArrayList<>();
		SplittableRandom sr = new SplittableRandom();
		for(int i = 0; i < interval; i++)
			list.add(sr.nextInt());
		return list;
	}
	
	private static <C extends List<String>> List<String> randomListStrings(int noOfElements,
			Supplier<C> collectionFactory) {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		Random random = new Random();

		return random.ints(leftLimit, rightLimit + 1)
				.limit(noOfElements)
				.boxed()
				.map(el -> (char) el.intValue())
				.map(String::valueOf)
				.collect(Collectors.toCollection(collectionFactory));
	}
}
