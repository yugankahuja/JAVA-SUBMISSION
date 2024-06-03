package com.ey.problem1;

import java.util.*;

public class StudentService {
	
	Set<Student> studentSet = new HashSet<>();
	
	public String addStudent(Student s) {
		studentSet.add(s);
		return "Addition Completed";
	}
	
	public void listStudents() {
		studentSet.forEach(x -> System.out.println(x));
	}
	
	public boolean isValidFn(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.firstname.equals(s2.firstname);
	}
	
	public boolean isValidLn(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.lastname.equals(s2.lastname);
	}
	
	public String isValidStudent(Object o1, Object o2) {
		if(isValidFn(o1, o2) && isValidLn(o1, o2))
			return "It's a match";
		else
			return "Not a match";
	}
}
