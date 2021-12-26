package Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String location;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String location, int salary) {
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee e) {
		subordinates.add(e);
	}
	
	public void remove(Employee e) {
		subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	
	public String toString(){
	      return ("Employee :[ Name : " + name + ", Location : " + location + ", salary :" + salary+" ]");
	} 
	

}
