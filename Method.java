package w3resourceProblem;

/*1.Write a Java program to create a class called "Person" with a name and age attribute.
 Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.*/

class Person{
    String name;
    int age;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Method {
    public static void main(String[] args) {
        Person p = new Person("Fahim",24);
        p.display();

        Person p2 = new Person("Nur",27 );
        p2.display();

    }
}
