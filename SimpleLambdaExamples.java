

import java.util.ArrayList;
import java.util.List;

public class SimpleLambdaExamples {

	private static void myMethod(String s) {

			boolean yup = false;
			for (int i=0;i<s.length() && i<5;i++) {
				if (s.charAt(i) == 'e') { yup = true; break; }
			}
			if (yup) System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = new ArrayList<String>();
		
		System.out.println("Create list of Strings");
		strings.add("Zee This is a very loooong string....");
		strings.add("Yea This is a very loooong string");
		strings.add("When This is a very looong string");
		strings.add("This is a very loong string");
		strings.add("So This is a very long string");
		strings.add("No This is very long");
		strings.add("Can This be long");
		strings.add("An This is");
		
		
		System.out.println("=====================================================");
		System.out.println("Show list, shortest to longest ");
		System.out.println("=====================================================");
		strings.stream().sorted((s1,s2) -> s1.length() - s2.length()).forEach(e -> System.out.println(e));;
		System.out.println("=====================================================");
		System.out.println("Show list, longest to shortest");
		System.out.println("=====================================================");
		strings.stream().sorted((s1,s2) -> s2.length() - s1.length()).forEach(e -> System.out.println(e));;
		System.out.println("=====================================================");
		System.out.println("Show list, reverse alphabetical, 1st char only");
		System.out.println("=====================================================");
		strings.stream().sorted((s1,s2) -> s2.charAt(0) - s1.charAt(0)).forEach(e -> System.out.println(e));;
		System.out.println("=====================================================");
		System.out.println("Show list, alphabetical, 1st char only");
		System.out.println("=====================================================");
		strings.stream().sorted((s1,s2) -> s1.charAt(0) - s2.charAt(0)).forEach(e -> System.out.println(e));;
		System.out.println("=====================================================");
		System.out.println("Show list, contains 'e' in first few letters");
		System.out.println("=====================================================");
		strings.stream().forEach(s -> {
			boolean yup = false;
			for (int i=0;i<s.length() && i<5;i++) {
				if (s.charAt(i) == 'e') { yup = true; break; }
			}
			if (yup) System.out.println(s);
		});
		System.out.println("=====================================================");
		System.out.println("Show list, contains 'e' in first few letters, using custom static method");
		System.out.println("=====================================================");
		strings.stream().forEach(s -> myMethod(s));
		
	}

}
