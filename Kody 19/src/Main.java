import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //====Lambda Expressions (ep 83)=====

        //Lambda Expressions is a shorten way to
        //work with functional interface

        //functional interface is interface with one
        //abstract methode

        //Creating a programme for find numbers
        //grater than 25
        List<Integer> numbers = Arrays.asList(1, 2, 56, 3, 8, 99);

        //Normal way (for loop):
        for (int i = 0;i<numbers.size();i++){
            if (numbers.get(i)>25){
                System.out.println(numbers.get(i));
            }
        }

        System.out.println();
        //improved way (for each loop):
        for (int number : numbers){
            if (number>25){
                System.out.println(number);
            }
        }

        System.out.println();
        //mor improved way (Functional Interface):

        //functional interface is very general methode
        //that can use for something ;-/

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                if (number > 25){
                    System.out.println(number);
                }

            }
        });

        System.out.println();
        //mor improved way (Functional Interface) SHORTEN BY LAMBDA:

        //basically easy way to use functional
        //interface

        numbers.forEach((number) -> {
            if (number > 25){
                System.out.println(number);
            }
        });

        System.out.println();

        //Nonesence way (Stream Api):
        numbers.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer number) {
                        if (number > 25){
                            return true;
                        }
                        return false;
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer number) {
                        System.out.println(number);
                    }
                });

        System.out.println();

        //Nonesence way (Stream Api) shorten by lambda:

        numbers.stream()
                .filter((number) -> (number > 25))
                .forEach(System.out::println);


        /*

        1.Imperative programming
          tells the computer exactly
          what to do and how to do it
          eg :- for loop

        2.Declarative Programming
          is a style of coding that focuses on
          the desired outcome, not the steps
          to achieve it
          eg :- functional interface

         */

        System.out.println();

        //creating functional interface
        @FunctionalInterface
        interface Thing{
            int doSomeThing(int a, int b);
        }

        //object (normal)

        Thing thing1 = new Thing() {
            @Override
            public int doSomeThing(int a, int b) {
                return a+b;
            }
        };

        System.out.println(thing1.doSomeThing(1,2));


        //object (Lambda Expression)
        Thing thing2 = (int a, int b) -> {
            return a + b;
        };

        //object (Lambda Expression) soml
        Thing thing3 = (a, b) -> a + b;

        //Variable Capture
        //local variable inside the lambda expression
        //you can edit it anymore its become
        //effectively final except static variables

        System.out.println();
        System.out.println();


        //====Switch Expressions (ep 84)====

        //Java 14 - Swithc Expressions
        //Features of switch expressions
        //1. Can be used as expressions
        //2. No need for break statements(NO FALLTHRO)
        //3. Arrow syntax (lambda like syntax)
        //4. Multiple cases per line
        //5. Yiedld keyword to replace blank when returniung a value

        enum VehicleType{ CAR, TRUCK, TRAIN, PLANE, MOTORCYCLE }

        //Switch Statements (old way)
        VehicleType vehicle1 = VehicleType.MOTORCYCLE;
        switch (vehicle1){
            case CAR:
                System.out.println("carr");
                break;
            case TRUCK:
                System.out.println("trr");
                break;
            case  TRAIN:
                System.out.println("rain");
                break;
            case PLANE:
                System.out.println("lane");
                break;
            case MOTORCYCLE:
                System.out.println("2weeler");
                break;
        }

        //Switch Expressions (new way)

        VehicleType vehicle2 = VehicleType.CAR;
        switch (vehicle2){
            case CAR -> System.out.println("brr");
            case TRUCK -> System.out.println("trr");
            case TRAIN -> System.out.println("rain");
            case PLANE -> System.out.println("lane");
            case MOTORCYCLE -> System.out.println("moto");
        }

        //What is Expression !?

        //peace of code that can
        //return value from itself

        //like 1+1;

        String dayOfTheWeek = "Monday";
        int result =switch (dayOfTheWeek){
            case "Monday" -> {
                System.out.println("Monday sucks!!");
                yield 1;
                //yield is just a break;
                //but also outputs value
            }
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saterday" -> 6;
            case "Sunday" -> 7;
            default -> 0;
        };

        System.out.println("day : " + dayOfTheWeek + " " + result);

        System.out.println();

        //==== Records (JDK 16) (ep 85) =====
        //basically classes that are ment to be
        //immutable

        //immutable - cannot be modified

        BankAcc acc1 = new BankAcc("bob", 1200.0);
        acc1.report();

        System.out.println();

        //==== == AND .equals (ep 86)======

        // ==

        int num1 = 8;
        int num2 = 3;
        int num3 = 8;

        System.out.println(num1 == num2);
        System.out.println(num1 == num3);

        //== is a boolean operator and just
        //output booliean value

        // .equals

        String name1 = new String("Randy");
        String name2 = new String("Randy");

        System.out.println(name1 == name2);
        //*Not Gonna Work bc its just compairing
        //Refernce variable

        System.out.println(name1.equals(name2));
        //*This Gonna Work bc now its copairing
        //actual value

        System.out.println();

        //Overiding .equals methode

        //every class have .equals methode by
        //default

        class Person{
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            //this code is AUTO generated
            //from suggestion of public

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return age == person.age && name.equals(person.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, age);
            }
        }

        Person person1 = new Person("Kasun", 20);
        Person person2 = new Person("Kasun", 20);

        System.out.println(person2.equals(person1));
        //this tyhing gonna be flase if you dont override .equals


        // [*EXTRA] turning any object into hash
        System.out.println(Objects.hash(person2.name));



    }
}