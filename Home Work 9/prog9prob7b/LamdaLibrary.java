package prog9prob7b;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaLibrary {

	public static final	TriFunction<List<Employee>,Double,Character,Stream<String>> GETFULLNAME_STARTWITH=
				(emp,salary,searchChar)->emp.stream()
				.filter(e->e.getSalary()>100000&&e.getLastName().charAt(0)>searchChar)
				.map(e->e.getFirstAndLastName()).sorted();


}