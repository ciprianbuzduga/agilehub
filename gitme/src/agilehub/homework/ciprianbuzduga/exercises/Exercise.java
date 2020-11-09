package agilehub.homework.ciprianbuzduga.exercises;

public abstract class Exercise {

	private final int noOfExercise;

	public Exercise(int noOfExercise) {
		this.noOfExercise = noOfExercise;
	}

	public void doHomework(Object... params) {
		System.out.println(">>>>>>> Start Exercise " + noOfExercise + " <<<<<<<<<<<");
		doInExercise(params);
		System.out.println(">>>>>>> Done Exercise " + noOfExercise + " <<<<<<<<<<<");
	}

	protected abstract void doInExercise(Object... params);

}
