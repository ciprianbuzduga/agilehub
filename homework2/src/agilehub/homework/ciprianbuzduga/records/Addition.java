package agilehub.homework.ciprianbuzduga.records;

@SuppressWarnings("preview")
public record Addition(int param1, int param2) implements MathematicalOperation {

	@Override
	public int calculate() {
		return param1 + param2;
	}

}
