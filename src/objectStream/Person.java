package objectStream;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String name;
	private int age;
	private boolean isMale;
	
	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	public String getName(){
		return this.name;
	}
	
}
