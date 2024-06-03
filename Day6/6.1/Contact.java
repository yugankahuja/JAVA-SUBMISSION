package com.ey;

import java.util.Date;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String mobileNumber;

    public Contact(String firstName, String middleName, String lastName, Date dateOfBirth, String gender, String mobileNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean validate() {
        return true;
    }
}

class Stack {
    private int maxSize;
    private Contact[] stackArray;
    private int top;

    
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Contact[maxSize];
        this.top = -1;
    }

    public void push(Contact contact) throws Exception {
        if (top == maxSize - 1) {
            throw new Exception("Stack overflow: Stack is full");
        }
        if (!contact.validate()) {
            throw new Exception("Invalid Contact: Validation failed");
        }
        top++;
        stackArray[top] = contact;
    }

    public Contact pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack underflow: Stack is empty");
        }
        Contact contact = stackArray[top];
        stackArray[top] = null;
        top--;
        return contact;
    }
}

