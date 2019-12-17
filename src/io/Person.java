package io;

public class Person {
private String firstName ;
private String lastName;
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
private   int age;


 public Person(String firstName,String lastName, int age) {
     super();
     this.firstName= firstName;
     this.lastName = lastName;
     this.age = age;
    // TODO Auto-generated constructor stub
}
@Override
public String toString() {
    return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", getFirstName()=" + getFirstName() + ", getAge()=" + getAge() + "]";
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
    
}
