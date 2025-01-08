package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    String job;
    String date;
    String mail;
    public Person(String firstname,String lastName,int age) {
        this.firstname=firstname;
        this.lastName=lastName;
        this.age=age;

    }
    public Person(String firstname,String lastName,int age,String job,String date,String mail) {
        this(firstname,lastName,age);
        this.job=job;
        this.date=date;
        this.mail=mail;

    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    } public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
    public String getJob(){
        return job;
    }

}
