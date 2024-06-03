package com.ey.problem1;

public class StudentTest {
	public static void main(String[] args) {
		StudentService ss= new StudentService();
		
		
		Address a1=new Address("Chennai");
		Student s1=new Student("Yugank","Ahuja",a1);
		
		Address a2=new Address("Chennai");
		Student s2=new Student("Yugank","Ahuja",a2);
		
		System.out.println(ss.addStudent(s1));
		System.out.println(ss.addStudent(s2));

		ss.listStudents();
		
		System.out.println(ss.isValidStudent(s1, s2));
		
	}

}