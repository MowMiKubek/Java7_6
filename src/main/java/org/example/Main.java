package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jan", "Kowalski", 20, "12345", 1);
        Student s2 = new Student("Jan", "Nowak", 21, "54321", 3);
        Student s3 = new Student("Adam", "Mickiewicz", 25, "11222", 5);


        StudentL s4 = new StudentL("Jan", "Kowalski", 20, "12345", 1);
        StudentL s5 = new StudentL("Jan", "Nowak", 21, "54321", 3);
        StudentL s6 = new StudentL("Adam", "Mickiewicz", 25, "11222", 5);

        s4.setSurname("Kowalik");
        s4.setName("Janek");
        System.out.println(s4.getName() + " " + s4.getSurname());
    }
}