package  src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        int a = 10000000;
//        float b = 3.14f;
//        double c = 10.64654654;
//        boolean d = false;
//        System.out.println(a);

//        String name = "Andrei";
//        String name1 = "Andrei";
//        String name2 = new String("Andrei");
//        System.out.println(name == name1);  // true
//        System.out.println(name == name2);  // false

//        int a = 1;
//        int b = 2;
//        double c = (double) a / b;
//        System.out.println(c);  // 0.5

//        int example = 15;
//        if(example > 5) {
//            example += 10;
//        }
//        System.out.println(example);

//        int a = 1;
//          switch (a) {
//              case 1 -> System.out.println(1);
//              default -> System.out.println(100);
//          }
//        int a = 1;
//        String s = switch (a) {
//            case 1 -> "one";
//            default -> "default";
//        };
//        System.out.println(s);

//        int age = 20;
//        String info = age >= 18 ? "adult" : "teen";
//        System.out.println(info);

//        int a = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(a);
//            a++;
//        }

//        int [] array = new int [10];
//        for (int num : array) {
//            System.out.println(num);
//        }

//        int [] array = new int [5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//            System.out.println(array[i]);
//        }
//
//        Person man_1 = new Person();
//        Person man_2 = new Person("Vik", 10);
//        System.out.println(man_2.age);

//        Person man_2 = new Person("Tor", 50);
//        System.out.println(man_2.getName());
//
//        man_2.setName("alex");
//        System.out.println(man_2.getName());

//        Person man_2 = new Person("Tor", 50);
//        man_2.printNameAndSecondName("VIK", 25);

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        Person man_3 = new Person(name);
//        man_3.printName();

//        final double PI = 3.14;

         Person man_3 = new Person("Alex");
         Person man_4 = new Person("And");
        System.out.println(man_3.count);
        System.out.println(man_4.count);
        System.out.println(Person.count);
    }
}