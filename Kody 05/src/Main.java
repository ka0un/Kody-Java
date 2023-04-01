import java.awt.desktop.SystemEventListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //===========Getters Setters (ep 20)=========
        //Bank Account

        class BankAccount { //class
            final int accountNumber;
            final String name;
            int balance;

            //constructer

            public BankAccount(int accountNumber, String name, int balance, double rate) {
                this.accountNumber = accountNumber;
                this.name = name;
                this.balance = balance;
            }

            public void CheckBalance(){           //Method
                System.out.println("Balance : " + this.balance);

            }

            public void addMoney(int amount){  //Methode
                balance = balance + amount;
                System.out.println(amount + "$ added to the account");
                System.out.println("Current balance : " + balance);
            }

            public void remMoney(int amount){  //Methode
                balance = balance - amount;
                System.out.println(amount + "$ removed the account");
                System.out.println("Current balance : " + balance);
            }

        }

        BankAccount kasun = new BankAccount(2020, "Kasun", 1000, 20); //object
        System.out.println(kasun.name);
        kasun.CheckBalance(); // calling methods
        kasun.addMoney(1000); // calling methods
        kasun.addMoney(1000); // calling methods
        kasun.remMoney(1000); // calling methods

        //======Overloading Methodes (ep 21)=========
        //multiple methodes with same name..

        //How to make Overloaded methode

        // 1. Have a differt amount of parameters
        // 2. Give them differnt data types

        // WHY?
        //so you dont have to remember methode names

        class Summer{

            //this will be ran when calling findsome without params
            void findSum(){
                System.out.println("Please Provide pharameters!!");
            }

            //this will be ran when calling findsome with 2 porams
            int findSum(int a, int b){
                int output = a + b;
                return output;
            }

            //this will be ran when calling findsome with 3 porams
            int findSum(int a, int b, int c){
                int output = a + b + c;
                return output;
            }

        }

        Summer one = new Summer();
        System.out.println(one.findSum(10, 20));
        System.out.println(one.findSum(10,20,30));

        System.out.println();
        System.out.println();

        //===== Objects as parameters (ep 22)=================

        class Classmates{
            String name;
            int marks;

            public Classmates(String name, int marks) {
                this.name = name;
                this.marks = marks;
            }

            Classmates(){
                this.name = null;
                this.marks = -1;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getMarks() { // 01 this method allows user to make
                return marks;       //Objects without parameters
            }

            Classmates(Classmates object){    // 02 This Constructer allows user to
                this.name = object.name;     //copy previous object
                this.marks = object.marks;

            }

            public void setMarks(int marks) {
                this.marks = marks;
            }
        }

        Classmates mate1 = new Classmates("Kasun", 88 );
        System.out.println(mate1.getName());
        System.out.println(mate1.getMarks());

        Classmates mate2 = new Classmates(mate1);  //like this
        //Object as a parameter             ^
        mate2.setMarks(20);
        System.out.println(mate2.getMarks() + " " + mate2.getName());


        //help of both 01 constructer and 02 parameter now we can copy
        //vars of first object to another new object

        System.out.println();
        System.out.println();



        //=====Returing Objects (ep 23)==================

        class Numbers{
            int number;

            Numbers(int givenum){
                this.number = givenum;
            }
            Numbers squre(){
                Numbers temp = new Numbers(this.number*this.number);
                return temp;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }
        }

        Numbers friend = new Numbers(5);
        Numbers friend2 = friend.squre();
        System.out.println("Old Number from first object: " + friend.getNumber());
        System.out.println("New Number from secound object: " + friend2.getNumber());

        System.out.println();
        System.out.println();

        //=====Inheritance (ep 24)======================

        //Subclasses that sharing details of main class

        //              Animals  (class Animals)
        //                 |
        //        |------------------|
        //        V                  V
        //      Rats                Bats  (class Bats extends Animals)
        //  (class Rats extends Animals)
        //
        // so both Rats and Bats have differnt variables and they
        // are sharing same variables from Animals class

        // All animals have name and age
        // Bats have wings
        // Rats have tail


        //main class
        class Animals{
            String name;
            int age;

            //constructer
            public Animals(String name, int age) {
                this.name = name;
                this.age = age;
            }

            //constructer win no params
            public Animals(){
                this.name = "unknown";
                this.age = 0;
            }

            //Getters and Setters
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

            public void readTag(){
                System.out.println("Name : " + name + " age : " + age);
            }

        }


        //subclass
        class Bats extends Animals{
            int Wings;

            //constructer
            public Bats(String name, int age, int wings) {
                super(name, age);
                Wings = wings;
            }

            //constructer with no params
            public Bats() {
                name = "unknown";
                age = -1;
            }

            //getters and setters
            public int getWings() {
                return Wings;
            }

            public void setWings(int wings) {
                Wings = wings;
            }
        }

        class  Rats extends Animals{
            int Tails;

            public Rats(String name, int age, int tails) {
                super(name, age);
                Tails = tails;
            }

            public Rats() {
                name = "unknown";
                age = -1;
            }

            public int getTails() {
                return Tails;
            }

            public void setTails(int tails) {
                Tails = tails;
            }
        }


        Bats Darq = new Bats("Draqula", 20, 3);
        Darq.readTag();
        System.out.println(Darq.getWings());

        Rats rat1 = new Rats("Mikky", 5, 1);
        rat1.readTag();
        System.out.println(rat1.getTails());

        Rats rat0 = new Rats();
        rat0.readTag();












    }
}