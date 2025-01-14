package src;

public class Person {
    private  String name;
    int age;

    public Person() {

    }

    public Person(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNameAndSecondName(String name, int age) {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}
