import java.util.SortedMap;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

        // If you dont want sub classes accessing main class Vars
        // you can use private keyword
        //========Super Keyword (ep 25)==================

        class Animals{
            String name = "bob";

            void getinfo(){
                System.out.println("this is super getinfo " + name);
            }
        }

        class Horse extends Animals{

            String  name = "Gudhorse";

            void getinfo(){
                System.out.println("Subclass name : " + name);
                System.out.println("Mainclass name : " + super.name); //01 Usage of Super Keyword
            }

            void superinfo(){
                super.getinfo(); //02 Usage of Super Keyword
            }

        }

        Horse horseboi = new Horse();
        horseboi.getinfo();
        horseboi.superinfo(); //02 Usage of Super Keyword

        System.out.println();
        System.out.println();



        //--

        class Vehicle{

            String name;
            public Vehicle(String name) {
                System.out.println("Ima  " + name);
            }

            public Vehicle() {
                System.out.println("Ima vehicle");
            }


        }

        class Car extends Vehicle{
            public Car(String name) {
                //super(name);
                System.out.println("ima Car");
            }

            public Car() {
                System.out.println("ima car");
            }


        }

        Car owo = new Car("kasun");

        System.out.println();
        System.out.println();


        //========Encapsulation (ep 26)===========
        //Basically limmiting the access of Vars, Methods and others

        //public - Access is only limited to Package
        //nothing - Same as public
        //private - Access is limited to the class

        class Account{
            public int balance = 100;

            public int getBalance() {
                return balance;
            }
        }


        Account account1 = new Account();
        System.out.println(account1.balance);

        System.out.println();
        System.out.println();



        //======Static and Final keyword (ep 27)=============

        //Static Usage of inside of a class

        class Chocolate{
            static {
                System.out.println("First Object Created");
                // static running only when first object created
            }

            Chocolate(){
                System.out.println("Another Object Created");
                // constructer running everytime when every new object created
            }
        }

        Chocolate kandy = new Chocolate();
        Chocolate saga = new Chocolate();


        //Static Usage in Variable

        class Robots{
            static int arms = 2;
            //if we created static VAR inside of class
            //we can access it without creating an object
            //     classname.VARname

        }

        System.out.println(Robots.arms);
        // Acessing static variable


        //Static Usage in Methods

        class Students{
            static int id = 1;

            static void Checkid(){

                //static methodes can be ran without making
                //object
                //     Classname.Methode();

                System.out.println(1000 + id);
            }
        }

        Students.Checkid();
        //like this

        //Usage of Final Keyword
        //In Variables, Methodes,

        //Basically Finals Cant be changed or edited they are
        //constant variables (but we can access them)
        //we are using FULL_CAPS_&_UNDERSCOPE for finlas VARS

        final double GAME_VERSION = 2.2;

        System.out.println(GAME_VERSION);

        // But u cant Change that like this
        //     GAME_VERSION = 66.6;

        System.out.println();
        System.out.println();


        //====Overriding Methodes (ep 28)========

        //Basically if you created two methodes with same name
        //in both super class and sub class, subclass objects allways
        //run subclass param so if you wanna run main class param
        //you can change the params and override that rules like this


        class OrangeProducts{
            String name;

            void Idandname(){   //methode 01
                System.out.println(name + "01");
            }
        }

        class Juice extends OrangeProducts{
            void Idandname(int id){ // Methode 02
                System.out.println("juice" + id);
            }
        }

        Juice thic = new Juice();
        thic.Idandname();
        //this gonna execute Super class methode (Methode 01)
        //Bc its doesnt have any params

        thic.Idandname(20);
        //this gonna execute Sub class methode (Methode 02)
        //Bc its does have params

        System.out.println();
        System.out.println();


        //==Abstract Classes and Methodes (ep 29)====

        // Basically when you can overide methodes
        //main class methodes are useless right ?
        //so if you wanna create methode that doesnt
        // have a {body} you can use abstact keyword
        //but abstract methodes must be inside of
        //abstract class + objects cannot be created with
        //abstract classes bc its just a template

        //abstract class
        //   public abstract class Classname

        //abstract methode
        //  abstarct void Methodename();
        // no body so no {             ^


        abstract class template{
            abstract void run();
        }

        //sn - you u dont wanna methode to have a body you can
        //make an abstract methode inside of abstract class

        class Product extends template{

            void run(){
                System.out.println("A");
            }

        }

        Product one = new Product();
        one.run();

        
































    }
}