package prog9prob6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
	
//	public static Set<String> union(List<Set<String>> sets){
//		return sets
//		        .stream()
//		        .flatMap(set -> set.stream())
//		        .collect(Collectors.toSet());
//		
//	}
	public static Set<String> union1(List<Set<String>> sets){
		return sets.stream()
	        .reduce((x,y)->{x.addAll(y);
	        	return x;
	        			}).orElse(Collections.emptySet());
	}

	public static void main(String[] args) {
		List<Set<String>> list=new ArrayList<>();
		Set<String> s1= new TreeSet<>();
		s1.add("A");
		s1.add("B");
		Set<String> s2= new TreeSet<>();
		s2.add("D");
		Set<String> s3= new TreeSet<>();
		s3.add("1");
		s3.add("3");
		s3.add("5");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(union1(list));
	}
}