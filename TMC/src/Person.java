import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCreation;

public class Person {
	private String name;
	private int age;
	private double weight;
	private double height;
	private LocalDateTime date;
	public Person(String name) {
		this.name = name;
		this.age = 0;
		this.height = 0.0;
		this.weight = 0.0;
		this.date = LocalDateTime.now();
	}
	public String toString() {
		return this.name +" ,age "+this.age+" is "+this.weight +" kg heavy and "+this.height+" meters tall and was created at " + this.date;
	}
	public void setAge(int number) {
		this.age = number;
	}
	public void setWeightAndHeight(int number,int number2) {
		this.weight = number;
		this.height = number2;
	}
	public String getName() {
		return this.name;
	}
	

}
