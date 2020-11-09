package agilehub.homework.ciprianbuzduga.records;

@SuppressWarnings("preview")
public sealed interface MathematicalOperation permits Addition, Subtraction {

	int calculate();
}
