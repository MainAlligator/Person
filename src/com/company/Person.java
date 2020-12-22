package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age = 0;

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public boolean isTeen() {

        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {

        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        }

        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty()) {
            return lastName;
        }
        return firstName + lastName;
    }
}
