
package com.ey;


import java.util.Date;
import java.util.Calendar;

public class StudentValidator {

    public boolean isValidStudentName(Student student) {
        String name = student.getStudentName();
        return name != null && name.matches("[a-zA-Z\\s]+");
    }

    public boolean isValidStudentBirthdate(Student student) {
        Date birthdate = student.getBirthdate();
        if (birthdate == null) {
            return false;
        }
        Calendar currentDate = Calendar.getInstance();
        Calendar birthDateCalendar = Calendar.getInstance();
        birthDateCalendar.setTime(birthdate);
        currentDate.add(Calendar.YEAR, -5);
        return birthDateCalendar.before(currentDate);
    }

    public boolean isValidStudentMarks(Integer[] marks) {
        if (marks == null || marks.length != 3) {
            return false;
        }
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidStudent(Student student) {
        return isValidStudentName(student) &&
               isValidStudentBirthdate(student) &&
               isValidStudentMarks(student.getMarks());
    }

    public static void main(String[] args) {
        Student student1 = new Student("ABC", new Date(2010 - 1900, 1 - 1, 1), new Integer[]{85, 90, 95});
        StudentValidator validator = new StudentValidator();
        
        System.out.println("Is valid student name: " + validator.isValidStudentName(student1)); // Expected true
        System.out.println("Is valid student birthdate: " + validator.isValidStudentBirthdate(student1)); // Expected true
        System.out.println("Is valid student marks: " + validator.isValidStudentMarks(student1.getMarks())); // Expected true
        System.out.println("Is valid student: " + validator.isValidStudent(student1)); // Expected true
    }
}
