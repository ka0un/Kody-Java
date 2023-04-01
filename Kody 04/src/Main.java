import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //=========Multidemetional Arrays (ep 15)========

        int kasun[][] = new int[4][5];
                          // rows^ ^collems

        kasun[2][3] = 69;

        System.out.println(kasun[2][3]);

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(kasun[i][j] + ","); //prntln create new line
            }
        }
        System.out.println();
        System.out.println();

        // 3D Arrays

        int kasun3d[][][] = new int[3][4][5];
        for( int i = 0;i < 3; i++){
            for( int j = 0;j < 4; j++){
                for( int k = 0;k < 5; k++){
                    System.out.print(kasun3d[i][j][k]);

                }
                System.out.println();
            }
            System.out.println();
        }

        //==============Search in Array (ep 16)========

        int numberList[] = {24, 33, 33, 259, 232, 3232, 323, 11};
        System.out.println("Our Array " + Arrays.toString(numberList)); // printing arrey to strings
        int tofind = 33;
        for(int i = 0; i < numberList.length; i++){
            System.out.println("Checking... " + numberList[i]);
            if(numberList[i] == tofind){
                System.out.println("It matched!!!");
                break;
            }
        }

        System.out.println();

        //=========Classes & Declearing Objects (ep 17)========
        //Classes Are Just Variables Template
        //Objects are just usecases of classes

        class Human{
            String name;
            int age;                     //class
            boolean isMale;
        }

        Human human1 = new Human();

        human1.name = "Kasun";
        System.out.println(human1.name);
        human1.age = 25;
        System.out.println(human1.age);    //object one
        human1.isMale = true;
        System.out.println(human1.isMale);

        System.out.println();

        Human human2 = new Human();

        human2.name = "Sithumni";
        System.out.println(human2.name);
        human2.age = 16;                     //object two
        System.out.println(human2.age);
        human2.isMale = false;
        System.out.println(human2.isMale);

        //================Methods (ep 18)==================
        class Dog{
            int age;
            String name;
            int moneyInHand;
            int moneyInBank;

            // methods (Peace of Code Inside of Template)
            //     type name(parameters){
            //         //code that will be repeated everytime if we Call it
            //     }
            void talk(){
                System.out.println("I am " + name + " My Age is " + age );
            }

            void calculate(){
                int totalMoney = moneyInBank+moneyInHand;
                System.out.println("Total Money = " + totalMoney);
            }

            int calcualte2(){
                return moneyInHand; //just returning value dont print antything
            }

            int count(int one, int two){
                return one + two;
            }


        }

        Dog dog1 = new Dog();
        dog1.age = 56;
        dog1.name = "Tommy";
        dog1.moneyInHand = 1000;
        dog1.moneyInBank = 2000;
        dog1.talk(); //Calling the method
        dog1.calculate();
        //just need to enter numbers lol its alredy know first one is one
        System.out.println(dog1.count(10,20));



        int hand = dog1.calcualte2();
        System.out.println(hand);

        System.out.println();
        System.out.println();


        //========Constructors / Parameterized.. (ep 19)======

        class Zebra{
            String name;
            int age;

            //Constructer - peace of code that can run in evey object

            //    NameOfClass() {
            //        //code
            //    }


            Zebra() {
                System.out.println("Making a new Zebra....");  // now this thing is running
                age = 1;                                       // on every object under
                talk();  //calling methods inside of the       // this class no need to
                ageup(); //constaructer                        // call same method
            }                                                  // in all oblects


            void talk(){
                System.out.println("hi, ima a Zebra my name is " + name + " and my age is " + age);
            }
            void ageup(){
                age++;
                System.out.println("I am now " + age);
            }

        }

        Zebra zebra1 =new Zebra();
        zebra1.name = "bob";

        Zebra zebra2 =new Zebra();
        zebra2.name = "bobby";

        Zebra zebra3 =new Zebra();
        zebra3.name = "bobson";

        System.out.println();
        System.out.println();


        class Product{
            String name;
            int id;

            String legal;

            Product(String madeDate, String expDate){    //Constucter - will run on every Objects without requiring call
                System.out.println("Making a new product...");
                legal = madeDate + "-" + expDate;
                sayCopy();  // executing method 02 (call)
            }

            void sayDetails(){     //Method 01
                System.out.println("name: " + name + " id: " + id);
            }

            void sayCopy(){     //Method 02
                System.out.println(legal);
            }

        }

        Product milk = new Product("1/1/2023", "5/5/2023");
        //object 01
        milk.name = "Kasun's milk";
        milk.id = 0001;
        milk.sayDetails(); // executing method 01 (call)

        System.out.println();

        Product sugar = new Product("3/1/2023", "5/5/2023");
        //object 02
        sugar.name = "Kasun's diabatics";
        sugar.id = 0002;
        sugar.sayDetails(); // executing method 01 (call)

        System.out.println();

        Product chocolate = new Product("6/1/2023", "5/5/2023");
        //object 03
        chocolate.name = "Kasun's choko";
        chocolate.id = 0003;
        chocolate.sayDetails(); // executing method 01 (call)





    }
}