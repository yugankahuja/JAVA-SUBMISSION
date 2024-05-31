package com.ey;

import java.util.Date;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Student {
    private Integer admissionCode;
    private String studentName;
    private Date birthdate;
    private Integer[] marks;
    private String grade;
    private static Integer admissionCounter = 1;
    private static String schoolName;

    static {
        schoolName = "Hyderabad Public School";
    }

    public Student() {
        this.admissionCode = admissionCounter++;
    }

    public Student(String studentName, Date birthdate) {
        this();
        this.studentName = studentName;
        this.birthdate = birthdate;
    }

    public Student(String studentName, Date birthdate, Integer[] marks) {
        this(studentName, birthdate);
        this.marks = marks;
    }

    public Integer getAdmissionCode() {
        return admissionCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Integer[] getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setMarks(Integer[] marks) {
        this.marks = marks;
        calculateGrade();
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    private void calculateGrade() {
        if (marks == null || marks.length != 3) {
            grade = "Undefined";
            return;
        }

        int total = Arrays.stream(marks).mapToInt(Integer::intValue).sum();

        if (total >= 240 && total <= 300) {
            grade = "Excellent";
        } else if (total >= 180 && total <= 239) {
            grade = "Good";
        } else if (total >= 150 && total <= 179) {
            grade = "Average";
        } else {
            grade = "Fail";
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Student{" +
                "admissionCode=" + admissionCode +
                ", studentName='" + studentName + '\'' +
                ", birthdate=" + (birthdate != null ? sdf.format(birthdate) : "null") +
                ", marks=" + (marks != null ? Arrays.toString(marks) : "null") +
                ", grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student("ABC", new Date(), new Integer[]{85, 90, 95});
        System.out.println(s1);
    }
}