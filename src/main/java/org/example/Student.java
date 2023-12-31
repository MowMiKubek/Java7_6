package org.example;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String index;
    private int year;

    public Student(String name, String surname, int age, String index, int year) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.index = index;
        this.year = year;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
