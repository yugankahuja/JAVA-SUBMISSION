
package com.ey;

import com.ey.Student;
import com.ey.StudentValidator;
import com.ey.StudentService;

import java.util.Date;

public class StudentTester {

    public static void main(String[] args) {
        StudentValidator validator = new StudentValidator();
        StudentService service = new StudentService();

        Student student1 = new Student("ABC", new Date(2010 - 1900, 1 - 1, 1), new Integer[]{85, 90, 95});
        Student student2 = new Student("PQR", new Date(2012 - 1900, 6 - 1, 15), new Integer[]{75, 80, 70});
        Student student3 = new Student("XYZ", new Date(2011 - 1900, 3 - 1, 30), new Integer[]{65, 60, 55});
        Student student4 = new Student("MNO", new Date(2014 - 1900, 10 - 1, 20), new Integer[]{95, 92, 88});
        Student student5 = new Student("KLM", new Date(2013 - 1900, 5 - 1, 10), new Integer[]{45, 55, 60});



        Student[] students = new Student[5];
        int index = 0;

        if (validator.isValidStudent(student1)) {
            students[index++] = student1;
        }
        if (validator.isValidStudent(student2)) {
            students[index++] = student2;
        }
        if (validator.isValidStudent(student3)) {
            students[index++] = student3;
        }
        if (validator.isValidStudent(student4)) {
            students[index++] = student4;
        }
        if (validator.isValidStudent(student5)) {
            students[index++] = student5;
        }

        service.showStudentDetails(students);
    }
}