package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);


        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
        Person person1=new Person("ahmet","tarık",26,"fullstack Develope","06.08.1999","asgdfgahgfhfa");
        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("LastName: " + person1.getLastName());

        System.out.println("Age: " + person1.getAge());
        System.out.println("job: " + person1.getJob());


    }

}
