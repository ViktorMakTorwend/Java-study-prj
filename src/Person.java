package src;

public class Person {
    private  String name;
    //int age;
    public static int count = 0;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
        count++;
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

    public void printName() {
        System.out.println("Name: " + name);
    }
}
