package agilehub.homework.ciprianbuzduga.exercises;

import java.util.Objects;

/**
 * Define an enum with the days of the week.
 * Add to it a function which returns a string describing whether it’s a workday or a weekend day 
 * @author cbuzduga
 */
public class Exercise7 extends Exercise {

	public Exercise7() {
		super(7);
	}
	
	public static enum Days {
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY;
	}

	@Override
	protected void doInExercise(Object... params) {
		Objects.requireNonNull(params);
		for(Object param : params) { 
			if(param instanceof Days) {
				Days day = (Days) param;
				System.out.println("Day " + day + " is " + getTypeOfDay(day));
			}
		}
	}
	
	private String getTypeOfDay(final Days day) {
		return switch (day) {
		case SUNDAY, SATURDAY -> "Weekend day";
		case MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY -> "Work day";
		};
	}
}
