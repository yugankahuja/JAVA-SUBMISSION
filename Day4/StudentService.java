package com.ey;
import java.util.Date;


public class StudentService {

    public void showStudentDetails(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("ABC", new Date(2010 - 1900, 1 - 1, 1), new Integer[]{85, 90, 95});
        Student student2 = new Student("PQR", new Date(2012 - 1900, 6 - 1, 15), new Integer[]{75, 80, 70});
        Student student3 = new Student("XYZ", new Date(2011 - 1900, 3 - 1, 30), new Integer[]{65, 60, 55});

        Student[] students = {student1, student2, student3};

        StudentService service = new StudentService();
        service.showStudentDetails(students);
    }
}



