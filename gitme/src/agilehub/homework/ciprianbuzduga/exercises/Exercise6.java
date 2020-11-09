package agilehub.homework.ciprianbuzduga.exercises;

import java.util.Map;
import java.util.Objects;

/**
 * Write a method called generateViewTemplate. The view takes a Map<String, String> as input.
 * The method first defines a simple HTML template. It should return a page containing the text:
 * Hello ${name}. ${greeting}. Replace ${name} and ${greeting} with the values corresponding to
 * the keys with the same names from the input map. Return the result.
 * Print it in the calling function. Hint: use text blocks and text block specific methods
 * @author cbuzduga
 */
public class Exercise6 extends Exercise {

	public Exercise6() {
		super(6);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doInExercise(Object... params) {
		Objects.requireNonNull(params);
		Object param = params[0];
		Objects.requireNonNull(param);
		Map<String, String> props = (Map<String, String>) param;
		System.out.println("Generate template with props " + props);
		String template = generateViewTemplate(props);
		System.out.println("Template is:\n" + template);
	}

	private String generateViewTemplate(Map<String, String> props) {
		String example = """
			    <h1>Hello %s. %s.</h1>""";
		return example.formatted(props.get("name"), props.get("greeting"));
	}

}
