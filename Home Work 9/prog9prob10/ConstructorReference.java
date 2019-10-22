package prog9prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import prog9prob7b.TriFunction;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
	 // Query 1  : Print only Female canditates names
	
		System.out.println("---Female candidates--");
		Arrays.asList(list).stream()
		.filter(t->t.getGender().equals("Female"))
		.map(t->t.getName())
		.forEach(System.out::println);
		

	    // Query 2 : Create an object by choosing suitable Interface to the specified constructors(Totally 3
		//constructors)using fourth type of Method Reference ClassName::new. Then print the object status 
		Function<String,Human> Obj1=Human::new;//x->new Human(x);
		
		System.out.println("--First object---\n"+Obj1.apply("Selam"));
		BiFunction<String,Integer,Human> Obj2=Human::new;//(x,y)->new Human(x,y);
		
		System.out.println("--Second object---\n"+Obj2.apply("Haile", 32));
		TriFunction<String,Integer,String,Human> Obj3=Human::new;//(x,y,z)->new Human(x,y,z);
		System.out.println("--Third object---\n"+Obj3.apply("Awet", 32, "Male"));
		
		// Query 3 : Count the male candidates whose age is more than 30
		
		System.out.println("---Number of male candidates older than 30 years : "+Arrays.asList(list).stream()
		.filter(t->t.getGender().equals("Male"))
		.map(t->t.getAge()>30)
		.count());
	    
	    
	   }

	}
